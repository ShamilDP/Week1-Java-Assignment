package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner details = new Scanner(System.in);
        List<Students> studentDetails = new ArrayList<>();

        while(true){
            Students students = new Students();
            System.out.print("Enter your name: (Exit-END)\n");
            String studentName = details.nextLine();

            if (studentName.equals("END")){
                System.out.println("Thank you, Come again");
                showUpdate(studentDetails);
                break;
            }
            students.setName(studentName);
            System.out.println("Enter Maths Marks: ");
            String mathsMark = details.nextLine();
            if (isValid(mathsMark)){
                students.setMathsMarks(Integer.parseInt(mathsMark));
            }else{
                while(!isValid(mathsMark)){
                    System.out.println("Invalid Input");
                    System.out.println("Enter Maths Marks: ");
                    mathsMark = details.nextLine();
                }
                students.setMathsMarks(Integer.parseInt(mathsMark));
            }

            System.out.println("Enter Science Marks: ");
            String scienceMark = details.nextLine();
            if (isValid(scienceMark)){
                students.setScienceMarks(Integer.parseInt(scienceMark));
            }else{
                while (!isValid(scienceMark)){
                    System.out.println("Invalid Input");
                    System.out.println("Enter Science Marks: ");
                    scienceMark = details.nextLine();
                }
                students.setScienceMarks(Integer.parseInt(scienceMark));
            }

            System.out.println("Enter English Marks: ");
            String englishMark = details.nextLine();
            if (isValid(englishMark)){
                students.setEnglishMarks(Integer.parseInt(englishMark));
            }else{
                while (!isValid(englishMark)){
                    System.out.println("Invalid Input");
                    System.out.println("Enter English Marks: ");
                    englishMark = details.nextLine();
                }
                students.setEnglishMarks(Integer.parseInt(englishMark));
            }

            double averagedValue = calculateAverage(Integer.parseInt(mathsMark),Integer.parseInt(scienceMark),Integer.parseInt(englishMark));
            checkRange(averagedValue,students,studentDetails);

        }
    }

    //----------------------Check whether marks within range ------------------------
    public static void checkRange(double averagedMark, Students students,List<Students> studentDetails){
        if ((averagedMark>=0) && (100>=averagedMark)){
            students.setAverageMark(averagedMark);
            students.setGrade(calculateGrade(averagedMark));
            studentDetails.add(students);
            showUpdate(studentDetails);
        }else{
            System.out.println("Enter Marks with a value in between 0-100");
        }
    }

    //----------------------------Check whether valid input------------------------
    public static boolean isValid(String userInput){
        boolean valid = true;
        char[] charArray = userInput.toCharArray();
        for (char ch:charArray) {
            if (!Character.isDigit(ch)){
                valid = false;
                break;
            }
        }

        return valid;
    }
    //-------------------------- Calculate the average value ----------------------
    public static double calculateAverage(int mathMark,int scienceMark, int englishMark){
        double averageMark = (mathMark+scienceMark+englishMark)/3.0;
        return averageMark;
    }
    //-------------------------- Calculate relavant grade -------------------------
    public static String calculateGrade(double averageData){
        if (averageData>=85) return "A";
        else if ((averageData>=75)&&(85>averageData)) return "B";
        else if ((averageData>=65)&&(75>averageData)) return "C";
        else if ((averageData>=55)&&(65>averageData)) return "D";
        else return "F";
    }
    //-------------------------- Display student details --------------------------
    public static void showUpdate(List<Students> studentDetailsDisplay){

        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.printf("%20s %10s %10s %10s %12s %10s", "STUDENT NAME", "MATHS", "SCIENCE", "ENGLISH","AVERAGE", "GRADE");
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        for(Students data: studentDetailsDisplay){
            System.out.format("%20s %10d %10d %10d %12.2f %10s",
                    data.getName(),data.getMathsMarks(), data.getScienceMarks(),data.getEnglishMarks(), data.getAverageMark(),data.getGrade());
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------------------------------------");

    }

}
