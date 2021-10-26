package com.revature;
import java.util.Scanner;

public class login {
    public String customerName;
    private String password;
    // view balance
    private double checking_Account;
    private double saving_Account;
    public double transactions;

    // constructor
    public login(String initCustomerName, String initPassword, double ch_acc, double sv_acc, double initTransactions) {
        customerName = initCustomerName;
        password = initPassword;
        checking_Account = ch_acc;
        saving_Account = sv_acc;
        transactions = initTransactions;
    }

    public void currentAccount(){
        String UserName = "John";
        String Password = "Password123";
        Scanner obj = new Scanner(System.in);
        System.out.println("what is the user name: ");
        String userInputName = obj.nextLine();
        System.out.println("you Entered: " + userInputName);

        if (userInputName == UserName) {
            System.out.println("user name verified");
            //Scanner obj = new Scanner(System.in);
            System.out.println("Enter your password: ");
            String userInputPassword = obj.next();
            System.out.println("you Entered: " + userInputPassword);
            if (userInputPassword == Password) {
                System.out.println("you have successfully logged in.");
            }
            else {
                System.out.println("incorrect password");
            }
        }
        else {
            System.out.println("incorrect user name");
        }
        //return displayAccount();
    }

   /* private String[] displayAccount() {
        return checking_Account();
    }*/

   /* private String[] checking_Account() {
    }*/

    /*public static String current_Password() {
        // current password
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your password: ");
        String userInput = obj.next();
        System.out.println("you Entered: " + userInput);
        return userInput;
    }*/
   /* public static String checkName() {
        char[] name = new char[current_User_Name().length()];
        return current_User_Name();
    }*/
    public String getPassword() {return password;}
    public void setPassword(String password){this.password = password;}
    public double getCheckingAccount() {
        return checking_Account;
    }
    public void setChecking_Account(double checking_Account) {
        this.checking_Account = checking_Account;
    }
    public double getSaving_Account(){
        return saving_Account;
    }
    public void setSaving_Account(double saving_Account){
        this.saving_Account = saving_Account;
    }
}
