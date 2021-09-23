package com.revature;

public class MSU extends University {

    private String name = "MSU";
    public int faculty = 51;
    public String curriculum = "Computer Science";
    protected double avgGPA = 3.0;
    public float acceptanceRate = 85.66f;
    char avgGrade = 'B';

    /*public MSU(String name, int faculty, String curriculum, double avgGPA, float acceptanceRate, char avgGrade) {
        //super(name, faculty, curriculum, avgGPA, acceptanceRate, avgGrade);
        this.name = name;
        this.faculty = faculty;
        this.curriculum = curriculum;
        this.avgGPA = avgGPA;
        this.acceptanceRate = acceptanceRate;
        this.avgGrade = avgGrade;
    }*/


    public String getName(){
        return name;
    }
    public void setName(){
        this.name = "MSU Denver";
    }

}

