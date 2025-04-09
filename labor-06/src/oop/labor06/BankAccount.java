package oop.labor06;

public class BankAccount {

        private final String accountNumber;
        private static int numAccounts = 0;
        private double balance;

        public BankAccount() {
            this.accountNumber = ++numAccounts + "";
            this.balance = 0;

        }

        public String getAccountNumber(){
            return accountNumber;
        }
        public double getBalance(){
            return balance;

        }
        public boolean withdraw (double amount){

            if( amount> this.balance){
                return false;
            }
            if(amount <0){
                return false;
            }
            this.balance -= amount;
            return true;
        }

        public void deposit(double amount){
            //beteves
            if(amount<0){
                return;
            }
            this.balance += amount;
        }

        @Override
        public String toString() {
            return "oop.labor06.BankAccount{" +
                    "accountNumber='" + accountNumber + '\'' +
                    ", balance=" + balance +
                    '}';
        }

}
