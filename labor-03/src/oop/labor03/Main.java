package oop.labor03;

import lab3_1.BankAccount;
import lab3_1.Customer;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer("John","BLACK");
        System.out.println(customer1);
        customer1.setAccount(new BankAccount("OTP0001"));
        customer1.getAccount().deposit(1000);
        System.out.println(customer1);
        Customer customer2 = new Customer("Mary","WHITE");
        customer2.setAccount(new BankAccount("OTP00002"));
        System.out.println(customer2);
        customer2.getAccount().deposit(4000);
        System.out.println(customer2);
        customer2.closeAccount();
        customer2.setAccount(customer1.getAccount());
        System.out.println(customer1);
        System.out.println(customer2);
    }
}
