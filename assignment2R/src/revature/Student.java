package revature;

import java.util.Scanner;

public class Student {

    public String name;
    private int rollNum;
    public String field;


    public Student() {

    }

    public void displayInfo() {
        System.out.println("Hey my name is " + name + " my roll number is " + rollNum + " and my field" +
                " of interest is " + field);
    }

    public void getInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is Student's name?");
        name = scanner.next();
        System.out.println("What is Student's Roll Number?");
        rollNum = scanner.nextInt();
        System.out.println("What is Student's field of interest?");
        field = scanner.next();
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.getInfo();
        student.displayInfo();
    }
}
