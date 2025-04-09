package oop.labor06;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
     for (int i =0; i<10; i++) {
         Customer c = new Customer("FirstName"+i,"LastName"+i);
         System.out.println(c);

     }
     for (int i =0; i<10; i++) {
         BankAccount ba = new BankAccount();
         System.out.println(ba);
     }
     try(PrintStream output = new PrintStream("kimenet.txt")){
        output.println("hello");
     }catch (FileNotFoundException e) {
         System.out.println("error");
     }
    }
}
