package oop.labor02;

import oop.labor02.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
     BankAccount account1 = new BankAccount("BT68264818");
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getBalance());
        account1.deposit(100);
        account1.deposit(-200);
        System.out.println("New balance: ");
        System.out.println(account1.getBalance());
    }
}
