/**
Ahmadwali Zadron
Date 7/29/21 - 8/11/21
Project0 (console-based-banking Application)
Revature (java)
*/


//Project 0

//For Project 0, you will be building a console-based banking application. Presentation date: August 11th, 2021

////////////////////////////////////////User Stories////////////////////////////////////

//As a user, I can:

// register a new user account with the system (must be secured with a password)
// login with my existing credentials
// create at least one account
// deposit funds into an account (use doubles, not ints)
// withdraw funds from an account (no overdrafting!)
// view the balance of my account(s) (all balance displays must be in proper currency format)


///////////////////////////////Suggested Bonus User Stories//////////////////////////////


//As a user I can:

// view the transaction history for an account
// create multiple accounts per user (checking, savings, etc.)
// share a joint account with another user
// transfer money between accounts

//////////////////////////////////////////////Minimum Features////////////////////////////

// Basic validation (no negative deposits/withdrawals, no overdrafting, etc.)
// All exceptions are properly caught and handled
// Proper use of OOP principles
// Documentation (all classes and methods have basic documentation)
// Use of custom data structures (do not use java.util Collection types!)
// SQL Data Persistance (at least 3 tables; all 3NF (normal form))

//////////////////////////////////////////////Bonus Features//////////////////////////////

// Unit tests for persistance-layer classes
// Logging messages and exceptions to a file

////////////////////////////////////////////// Tech Stack////////////////////////////

// Java 8
// Apache Maven
// PostGreSQL deployed on AWS RDS
// Git SCM (on GitHub)

//////////////////////////////////////////////// Init Instructions///////////////////////////

// Create a new repository within this organization (naming convention: firstname_lastname_p0)

//////////////////////////////////////////////// Presentation /////////////////////////////

// finalized version of application must be pushed to personal repository within this organization by the presentation date
// 5 minute live demonstration of the implemented features

///////////////////////////////////////////////////////////////

package com.revature;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static com.revature.login.*;
import static com.revature.newAccount.newName;
import static com.revature.newAccount.newPassWord;
//import java.util.regex.*;

public class main {
    public static void main(String[] args){
        // TODO: 7/31/2021 method invocation does not work and if fixed remove imports.
        //newAccount name = new newAccount(String newName);

        Menu();
        //public login = new login(initUserName(),);
    }

    public static void Menu(){
        System.out.println("Main Menu\n");
        //System.out.println("Select one of the following\n");
        System.out.println("0) To Quit ");
        System.out.println("1) To create a new account");
        System.out.println("2) To login to your current account");
        System.out.println("3) To Deposit funds into Account");
        System.out.println("4) To Withdraw funds from Account");
        System.out.println();
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
                        //newName();
                        //newPassWord();
                        System.out.println("Account Type: ");
                        System.out.println("1. Checking");
                        System.out.println("2. Saving");

                        while (choice <1 || choice > 2) {
                            System.out.println("Enter choice 1 or 2.");
                            choice = scanner.nextInt();

                            newAccount.NewAccount();
                        }

                        break;
                    case 2:
                        /**
                         // To login to your existing Account (press2)
                         //-> view balance should be under login
                         //-> withdraw and deposit funds
                         */
                        login obj1 = new login("John", "xyz", 12, 12, 2);
                        obj1.currentAccount();
                        //login Login = new login(String initUserName, String initPassword, double ch_acc, double sv_acc, double initTransactions)
                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    default:
                        System.out.println("\nInvalid input, the number is out of range. ");
                        System.out.println("choose 0, 1, 2, 3 or 4 \n");
                } Menu();
            } catch (InputMismatchException e) {
                System.out.println("\nStrings and special characters are not supported, please pick a number\n");
                //break;
                Menu();
            }
        }
    }
}
