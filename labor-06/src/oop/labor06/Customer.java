package oop.labor06;

import java.util.ArrayList;

public class Customer {

        private String firstName;
        private String lastName;
        private final int id;
        private static int numCustomers=0;
        private ArrayList<BankAccount> accounts;



        public Customer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = numCustomers+1;
            this.accounts = new ArrayList<>();
            numCustomers++;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getNumAccount() {
            return accounts.size();
        }

        public void closeAccount(String account) {
            for (BankAccount a : accounts) {
                if(a.getAccountNumber().equals(account)) {
                    accounts.remove(a);
                    break;
                }
            }
        }

        public void addAccount(BankAccount account){
            accounts.add(account);
        }

        @Override
        public String toString() {
            return "oop.labor06.Customer{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", accounts=" + accounts +
                    '}';
        }


}
