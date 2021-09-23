package com.revature;

public class Withdraw extends login {
    private double Amount;
    public double withdrawalFrom;


    /**
     * where should the money be taken from
     * checking or saving
     * inherit variable member from newAccount
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
 * show transaction history
 */
