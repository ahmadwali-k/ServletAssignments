package com.revature;

public class Deposit extends login {
    private double Amount;
    public double depositTo;
    public String check;
    public String cash;


    /**
     * where should the money go
     * checking or saving
     * inherit variable members from newAccount
     *
     * is it a check or cash
     */




    // getter method
    public Double getAmount(){
        return Amount;
    }
    // setter method
    public void setAmount(double Amount){
        this.Amount = Amount;
    }
}


/**
 * show transactions ??
 */