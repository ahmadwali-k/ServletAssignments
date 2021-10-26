package revature;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("List of operations: " + " add " + " subtract " + " multiply " + " divide " );
        System.out.println("Enter an operation: ");
        String userInput = input.nextLine().toLowerCase();


        switch (userInput) {

            case "add":
                // add
                System.out.println("Enter two integers: ");
                int addNum1 = input.nextInt();
                int addNum2 = input.nextInt();
                             /*if (addNum1 % 1 != 0) {
                                System.out.println("invalid input entered");
                                }*/
                int total_add = addNum1 + addNum2;
                System.out.println("Answer: " + total_add);
                break;
            case "subtract":
                // subtract
                System.out.println("Enter two Integers: ");
                int substractNum1 = input.nextInt();
                int substractNum2 = input.nextInt();

                int total_substract = substractNum1 - substractNum2;
                System.out.println("Answer: " + total_substract);
                break;
            case "multiply":
                // upto 2 decimal places
                // multiply
                System.out.println("Enter two doubles: ");
                double multiNum1 = input.nextDouble();
                double multiNum2 = input.nextDouble();
                double total_Multiply = multiNum1 * multiNum2;
                System.out.printf("Answer: %.2f" , total_Multiply);
                break;
            case "divide":
                // upto 2 decimal places
                // divide
                // can't divide by 0
                System.out.println("Enter two double: ");
                double divNum1 = input.nextDouble();
                double divNum2 = input.nextDouble();

                if (divNum2 == 0) {
                    System.out.println("invalid input entered.");
                }
                double total_divide = divNum1 / divNum2;
                System.out.printf("Answer: %.2f" , total_divide);
                break;

            default:

                // msg invalid input entered. Terminating..
                // cannot be anything other than " add, subtract, multiply, divide, alphabetize"
                // msg invalid input entered. terminating...
                System.out.println("invalid entry");
        }

    }
}


