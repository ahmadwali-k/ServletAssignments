package com.revature;

import java.io.*;

public class University {



    public static void main(String[] args) {

        //File newFile = new File("week1/University_prog/FileIO/newFile.txt");
        //String userInput = "Storing data\n";

        System.out.println("Universities\n");

        MSU m = new MSU();
        System.out.println("Name: " + m.getName());
        System.out.println("Number of Faculty members: " + m.faculty);
        System.out.println("Curriculum: "  + m.curriculum);
        System.out.println("Acceptance rate: " + m.acceptanceRate);
        System.out.println("Average GPA: " + m.avgGPA);
        System.out.println("Average Grade: " + m.avgGrade +"\n");

        UCD u = new UCD();
        System.out.println("Name: " + u.getName());
        System.out.println("Number of Faculty members: " + u.faculty);
        System.out.println("Curriculum: " + u.curriculum);
        System.out.println("Acceptance rate: " + u.acceptanceRate);
        System.out.println("Average GPA: " + u.avgGPA);
        System.out.println("Average Grade: " + u.avgGrade);

        //readFile(newFile);
       // writeToFile(newFile);
    }

    /*public static void readFile(File file){
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = "";
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
    }*/
   /* public static void writeToFile(String input, File file) {
        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            //BufferedWriter bw2 = new BufferedWriter(new FileWriter(newFile));

            bw.append(userInput);
            bw.write(input);
            //bw.newLine();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }*/
}

