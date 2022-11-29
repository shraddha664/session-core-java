package org.example.day1.encapsulation_demo;

public class AccountHolders {
    public static void main(String[] args) {
        BankAccount saruAccount=new BankAccount();
        BankAccount ramAccount=new BankAccount();

        saruAccount.setAccountBalance(1231.5);
        saruAccount.setAccountNumber("1273839281223");
        saruAccount.setSocilaSecurityNumber("2366238");

        ramAccount.setAccountBalance(123134.5);
        ramAccount.setAccountNumber("738392812323");
        ramAccount.setSocilaSecurityNumber("66238123");

        System.out.println("Information of Saru's account");
        System.out.println("Total balance is:"+saruAccount.getAccountBalance());
        System.out.println("Account Number is:"+saruAccount.getAccountNumber());
        System.out.println("Social Security Number is:"+saruAccount.getSocilaSecurityNumber());
        System.out.println("Bank name is:"+saruAccount.getBANK_NAME());

        System.out.println("Information of Ram's account");
        System.out.println("Total balance is:"+ramAccount.getAccountBalance());
        System.out.println("Account Number is:"+ramAccount.getAccountNumber());
        System.out.println("Social Security Number is:"+ramAccount.getSocilaSecurityNumber());
        System.out.println("Bank name is:"+ramAccount.getBANK_NAME());

    }
}
