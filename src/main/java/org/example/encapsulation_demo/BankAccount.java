package org.example.encapsulation_demo;

public class BankAccount {
    private double accountBalance;
    private final String BANK_NAME="RBB";
    private String accountNumber;
    private String socilaSecurityNumber;


    public void setAccountBalance(double accountBalance){
        this.accountBalance=accountBalance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }

    public void setSocilaSecurityNumber(String socilaSecurityNumber){
        this.socilaSecurityNumber=socilaSecurityNumber;
    }

    public double getAccountBalance(){
        return this.accountBalance;
    }

    public String getBANK_NAME(){
       return this.BANK_NAME;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String getSocilaSecurityNumber(){
        return this.socilaSecurityNumber;
    }



}
