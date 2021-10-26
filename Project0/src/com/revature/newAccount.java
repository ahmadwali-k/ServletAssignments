package com.revature;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class newAccount {
    //access modifiers
    private String new_userName;
    private String new_password;

    /**
     * having problem with calling constructor from main method.
     * add the rest of the parameters in
     */

    //account arrAccount[] = new arrAccount[10];

    public static account NewAccount() {
        account account1 = null;
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            account1 = new checkingAcct();
        } else {
            account1 = new savingAcct();
        }
        return account1;
    }

    public void deposit(account arrAccount[], int count){

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

    // getter method
    public String getUserName() {
        return new_userName;
    }
    // setter method
    public void setUserName(String userName) {
        this.new_userName = new_userName;
    }
    public String getPassword() {
        return new_password;
    }
    public void setPassword(String password){
        this.new_password = new_password;
    }

}
