package lab9_1;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Customer arraylist letrehozasa
        ArrayList<Customer> customers = new ArrayList<>();
        //customerek letrehozasa
        customers.add(new Customer("Timi" , "Gheorghita"));
        customers.add(new Customer("Ottilia" , "Szekely"));
        customers.add(new Customer("Tunde" , "Komives"));
        customers.add(new Customer("Joco" , "Takacs"));
//customerek kiirasa
        for(Customer c : customers){
            System.out.println(c);
        }
        //minden customerhez savings account es egu cheching account
        for(Customer c : customers){
           c.addAccount(new SavingsAccount(0.5));
           c.addAccount(new CheckingAccount(500));
        }
        System.out.println();
        //kiiras szamlak hozzaadasa utan
        for(Customer c : customers){
            System.out.println(c);
        }
        //deposit
      Random rand = new Random();
        for(Customer c : customers){
            for (String s : c.getAccountNumbers()) {
                c.getAccount(s).deposit(rand.nextDouble(100,1000));
            }
        }
        System.out.println("\nDEPOSIT\n");
        //kiiras deposit utan
        for(Customer c : customers){
            System.out.println(c);
        }
        //withdraw
        for(Customer c : customers){
            for (String s : c.getAccountNumbers()) {
              double random = rand.nextDouble(500,1500);
                System.out.println("megprobaltunk kivenni" + c.getFirstName() + "szamlajarol" + String.format("%.2f", random) + "osszeget");
                c.getAccount(s).withdraw(random);
            }
        }
        //withdraw utan kiiras utan
        for(Customer c : customers){
            System.out.println(c);
        }
    }

}
