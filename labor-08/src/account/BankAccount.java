package account;

public class BankAccount {
    protected final String accountNumber;
    protected static int numAccounts = 0;
    protected double balance;

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
