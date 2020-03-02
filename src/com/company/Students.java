package com.company;

public class Students {
    private String name;
    private int mathsMarks;
    private int scienceMarks;
    private  int englishMarks;

    private double averageMark;
    private String grade;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public void setMathsMarks(int mathsMarks) {
        this.mathsMarks = mathsMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMarks) {
        this.averageMark = averageMarks;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String gradeLetter) {
        this.grade = gradeLetter;
    }

}
