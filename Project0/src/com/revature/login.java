package com.revature;

public class login {
    public String userName;
    private String password;
    // view balance
    private double checking_Account;
    private double saving_Account;
    public double transactions;

    /**
     * needs constructor
     */

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
