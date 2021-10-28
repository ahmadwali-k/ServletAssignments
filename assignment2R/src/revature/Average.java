package revature;

import java.util.Scanner;

public class Average {
    public int num1;
    public int num2;
    public int num3;

    public Average() {

    }

    public void findAvg() {
        int avg = (num1 + num2 + num3)/3;
        System.out.println("The Average is: " + avg);
    }

    public void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number to find the average: ");
        num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        num2 = scanner.nextInt();
        System.out.println("Enter third number:");
        num3 = scanner.nextInt();


    }
}
class Main2 {
    public static void main(String[] args) {
        Average average = new Average();
        average.getInfo();
        average.findAvg();
    }
}