package revature.Day5;

import java.util.Scanner;

/**
 * simple scanner code
 * input output
 */
public class Demo26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter FirstName and LastName");
        String firstName =  scanner.nextLine();
        String lastName = scanner.nextLine();
        System.out.println("Full Name: "+ firstName + " " + lastName);
    }
}
