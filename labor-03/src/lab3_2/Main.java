package lab3_2;

import lab3_1.BankAccount;

import java.sql.SQLOutput;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Customer customer1 = new Customer("Robin","Hood");
        Customer customer2 = new Customer("Tamas","Nagy");
        //System.out.println(customer1);
        //System.out.println(customer2);
        for(int i=0;i<=4;i++){
            customer1.addAccount(new BankAccount("OTP1" + i));
        }
        System.out.println(customer1);
        for(int i=0; i<=8 ;i++){
            customer2.addAccount(new BankAccount("BT1" + i));
        }
        System.out.println(customer2);
        for(int i =0 ; i <= 4; i++){
            customer1.getAccount("OTP1"+i).deposit(rand.nextDouble(1,100));
        }
        System.out.println(customer1);
        for(int i=0 ; i<=8;i++){
            customer2.getAccount("BT1"+i).deposit(rand.nextDouble(1,100));
        }
        System.out.println(customer2);
        customer1.closeAccount("OTP10");
        System.out.println(customer1);
        customer2.closeAccount("BT18");
        System.out.println(customer2);
    }
}
