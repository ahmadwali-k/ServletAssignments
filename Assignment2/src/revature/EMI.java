package revature;

import java.util.Scanner;

public class EMI {
    public static void main(String[] args) {
        // EMI = P × r × (1 + r)n/((1 + r)n - 1)

        double r, E, P, n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("To calculate the EMI, please enter the following");
        System.out.println("Enter your loan amount.");
        P = scanner.nextInt();
        System.out.println("what is the rate of interest. ");
        r = scanner.nextDouble();
        System.out.println("And Tenure in the number of months");
        n = scanner.nextInt();
        System.out.println(E = P * r * ((1 + r)*n) / ((1+r)*n - 1));
        System.out.println("EMI = " + E);
    }
}
