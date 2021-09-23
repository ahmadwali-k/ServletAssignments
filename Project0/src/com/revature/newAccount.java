package com.revature;

public class newAccount {
    //access modifiers
    private String new_userName;
    private String new_password;




    /**
     * having problem with calling constructor from main method.
     * add the rest of the parameters in
     */
    // parameterized constructor
//    public newAccount(String userName) {
//        this.userName = userName;
//    }



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
