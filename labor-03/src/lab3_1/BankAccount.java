package lab3_1;

public class BankAccount {
    private String accountNumber;
    private double balance;
    public BankAccount(String szamlaszam){
        accountNumber = szamlaszam;
        balance = 0;

    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
        }
        else{
            System.out.println("Amount must be positive");
        }
    }
    @Override
    public String toString(){
        return accountNumber+" "+balance;
    }
}