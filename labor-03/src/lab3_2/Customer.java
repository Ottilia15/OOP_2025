package lab3_2;

import lab3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    // constant
    public static final int MAX_ACCOUNTS = 10;
    // number of accounts
    private int numAccounts;
    // an array for the accounts
    private BankAccount accounts[] = new BankAccount[MAX_ACCOUNTS];

    public void addAccount(BankAccount account) {
        if (numAccounts < MAX_ACCOUNTS) {
            accounts[numAccounts++] = account;
        } else {
            System.out.println("You reached the maximum limit of accounts");
        }
    }

    public Customer(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public BankAccount getAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if (accountNumber.equals(accounts[i].getAccountNumber())) {  //egyik.equals(masik)
                return accounts[i];
            }
        }
        //ide csak akkor jut el a program ha nem talalta meg
        return null;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append(firstName + ' ' + lastName + " accounts:\n"); //append-hozzafuz dolgokat
        for (int i = 0; i < numAccounts; ++i) {
            result.append("\t" + accounts[i] + "\n"); // \t --> egy tabbal bennebb.
        }
        return result.toString();
    }

    public void closeAccount(String accountNumber) {
        for (int i = 0; i < numAccounts; i++) {
            if(accountNumber.equals(accounts[i].getAccountNumber())) {
                for(int j = i;j < numAccounts-1 ; j++ ){
                    accounts[j] = accounts[j+1];
                }
               accounts[numAccounts-1] = null;
               numAccounts --;
               break;
            }
        }
    }
    public int getNumAccounts(){
        return numAccounts;
    }
}