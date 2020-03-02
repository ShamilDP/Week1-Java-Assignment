package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner details = new Scanner(System.in);
        List<Student> studentDetails = new ArrayList<>();

        while (true) {
            System.out.print("Enter your name: (Exit-END)\n");
            String studentName = details.nextLine();
            if (studentName.equals("END")) {
                System.out.println("Thank you, Come again");
                showUpdate(studentDetails);
                break;
            }

            System.out.println("Enter Maths Marks: ");
            int mathsMarks = getMarkFrom(details);

            System.out.println("Enter Science Marks: ");
            int scienceMarks = getMarkFrom(details);

            System.out.println("Enter English Marks: ");
            int englishMarks = getMarkFrom(details);

            studentDetails.add(new Student(studentName, mathsMarks, scienceMarks, englishMarks));
        }

    }

    private static int getMarkFrom(Scanner scanner) {
        String enteredMark;
        int mark = Integer.MIN_VALUE;
        while ((enteredMark = scanner.nextLine()) != null) {
            try {
                mark = Integer.parseInt(enteredMark);
                if (isValidMark(Integer.parseInt(enteredMark))) {
                    break;
                } else {
                    System.out.println("Please Enter Valid Mark ");
                }
            } catch (NumberFormatException ignored) {
            }
        }
        return mark;
    }

    private static boolean isValidMark(int mark) {
        return (mark >= 0) && (mark <= 100);
    }

    private static void showUpdate(List<Student> studentDetailsDisplay) {
        for (Student student: studentDetailsDisplay) {
            System.out.println(student);
        }
    }
}
