package com.revature;

public class UCD {
    private String name = "UCD";
    public int faculty = 51;
    protected double avgGPA = 3.5;
    public String curriculum = "Computer Science";
    public float acceptanceRate = 80.333f;
    char avgGrade = 'A';

    /*public UCD(String new_Name, int new_Faculty, double new_AvgGPA, String new_Curriculum, float new_AcceptanceRate, char new_AvgGrade) {
        this.name = new_Name;
        this.faculty = new_Faculty;
        this.avgGPA  = new_AvgGPA ;
        this.curriculum = new_Curriculum;
        this.acceptanceRate = new_AcceptanceRate;
        this.avgGrade = new_AvgGrade;
    }*/

    // Getter for private method
    public String getName(){
        return name;
    }
    // Setter for private method
    public void setName() {
        this.name = "new UCD";
    }

}

