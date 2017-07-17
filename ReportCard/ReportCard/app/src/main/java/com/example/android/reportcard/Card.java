package com.example.android.reportcard;

public class Card {

    /*PROPERTIES*/
    private String name;
    private int mathGrade;
    private int historyGrade;
    private int englishGrade;

    /*CONSTRUCTOR*/
    public Card(String name, int mathGrade, int historyGrade, int englishGrade) {
        this.name = name;
        this.mathGrade = mathGrade;
        this.historyGrade = historyGrade;
        this.englishGrade = englishGrade;
    }

     /*GETTERS AND SETTERS*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        this.historyGrade = historyGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    @Override
    public String toString() {
        return "Name: " + name + "; "
                + "English Grade: " + englishGrade + "; "
                + "History Grade: " + historyGrade + "; "
                + "English Grade: " + englishGrade + ";";
    }
}
