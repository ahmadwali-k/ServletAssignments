/**
Ahmadwali Zadron
Date 7/29/21 - 8/11/21
Project0 (console-based-banking Application)
Revature (java)
*/


//Project 0

//For Project 0, you will be building a console-based banking application. Presentation date: August 11th, 2021

//User Stories

//As a user, I can:

// register a new user account with the system (must be secured with a password)
// login with my existing credentials
// create at least one account
// deposit funds into an account (use doubles, not ints)
// withdraw funds from an account (no overdrafting!)
// view the balance of my account(s) (all balance displays must be in proper currency format)

//Suggested Bonus User Stories

//As a user I can:

// view the transaction history for an account
// create multiple accounts per user (checking, savings, etc.)
// share a joint account with another user
// transfer money between accounts

//Minimum Features

// Basic validation (no negative deposits/withdrawals, no overdrafting, etc.)
// All exceptions are properly caught and handled
// Proper use of OOP principles
// Documentation (all classes and methods have basic documentation)
// Use of custom data structures (do not use java.util Collection types!)
// SQL Data Persistance (at least 3 tables; all 3NF (normal form))

//Bonus Features

// Unit tests for persistance-layer classes
// Logging messages and exceptions to a file

// Tech Stack

// Java 8
// Apache Maven
// PostGreSQL deployed on AWS RDS
// Git SCM (on GitHub)

// Init Instructions

// Create a new repository within this organization (naming convention: firstname_lastname_p0)

// Presentation

// finalized version of application must be pushed to personal repository within this organization by the presentation date
// 5 minute live demonstration of the implemented features

package com.revature;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.util.regex.*;

public class main {

    public static void main(String[] args){
        // TODO: 7/31/2021 method invocation does not work.
        //newAccount name = new newAccount(String newName);
        Menu();
    }

    public static void Menu(){

        System.out.println("Main Menu\n");
        //System.out.println("Select one of the following\n");
        System.out.println("0) To Quit ");
        System.out.println("1) To create a new account");
        System.out.println("2) To login to your current account");


        Scanner scanner = new Scanner(System.in);

        // TODO: 7/31/2021 validate switch Statement

        /**
         * Validations
         * checks for a number out of range
         * checks for Strings
         */

        boolean f = false;

        while (!f) {

            try {

                int choice = scanner.nextInt();
                switch (choice) {

                    case 0:
                        System.exit(0);
                    case 1:
                        /**
                         // create new user Account
                         //-> new user name and password goes here.

                         */
                        newName();
                        newPassWord();
                        break;
                    case 2:
                        /**
                         // To login to you existing Account (press2)
                         //-> view balance should be under login
                         //-> withdraw and deposit funds
                         */
                        //login();
                        current_User_Name();
                        current_Password();
                        break;
                    default:
                        System.out.println("\nInvalid input, the number is out of range. ");
                        System.out.println("choose 0, 1 or 2 \n");

                } Menu();

            } catch (InputMismatchException e) {
                System.out.println("\nStrings and special characters are not supported, please pick a number\n");
                //break;
                Menu();

            }

        }
    }

    // TODO: 7/31/2021 take method to newAccount class.
    public static String newName(){

        // TODO: 7/31/2021 validations need for inputs 
        // to create the scanner object
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter new User name: \n");

        // to read the user input
        String userInput2 = userInput.nextLine();
        System.out.println("you Entered: \n" + userInput2);
        return userInput2;
    }

    public static String newPassWord(){

        // TODO: 7/31/2021 adding validations (use a Capital letter,
        //  use a Number, use a special letter, should be atleast 8 characters long, no white spaces)


        // TODO: 8/1/2021 whats the proper way to document references
            /**
             * got from https://www.geeksforgeeks.org/how-to-validate-a-password-using-regular-expressions-in-java/
             */
            // Regex to check valid password.
            String  regex = "^(?=.*[0-9])"              //^ for starting character of String, for digits 0-9
                    + "(?=.*[a-z])(?=.*[A-Z])"         // to check for lower and upper case letters
                    + "(?=.*[@#$%^&+=])"               // to check for a special character
                    + "(?=\\S+$).{8,20}$";             // white spaces not allowed and it must be between 8 to 20 characters


            // compile regex

            Scanner obj = new Scanner(System.in);
            System.out.println("Enter you new Password: ");

            // read input
            String userInput = obj.nextLine();
            Pattern p = Pattern.compile(regex);
            Matcher matcher = p.matcher(userInput);
            /*if (userInput.equals(regex)) {
                System.out.println("you Entered: " + userInput);
                return userInput;}*/
            if (userInput.equals(matcher)) {
                System.out.println("valid: " + matcher);
                return userInput;}
            else { System.out.println("password requirements not met");}

            return userInput;


    }

    /**
     *
     * code belongs to login
     */
    public static String current_User_Name() {
        // current user name
        Scanner obj = new Scanner(System.in);
        System.out.println("what is the user name: ");
        String userInput = obj.next();
        System.out.println("you Entered: " + userInput);
        return userInput;}

    public static String current_Password() {

        // current password
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String userInput = obj.next();
        System.out.println("you Entered: " + userInput);
        return userInput;
    }

}
