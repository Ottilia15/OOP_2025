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
    }
}
//hazi feladat befejezni :)