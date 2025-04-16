package lab9_1;

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

    public BankAccount getAccount(String accountNumber) {
        for (BankAccount a : accounts) {
            if(a.getAccountNumber().equals(accountNumber)) {
               return a;
            }
        }
        return null;
    }
    public ArrayList<String> getAccountNumbers()  {
        ArrayList<String> result = new ArrayList<>();
        for (BankAccount a : accounts) {
            result.add(a.getAccountNumber());
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(id + ":" + firstName + " " + lastName + "accounts:\n");
        if(getNumAccount()==0) result.append("\tno accounts"); //append==vegere helyezi!!!!!!!!
        else {
            for(BankAccount a : accounts) {
                result.append("\t*").append(a).append("\n");
            }
        }
        return result.toString();
    }
}
