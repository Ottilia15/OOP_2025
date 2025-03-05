package lab3_1;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;
    public void setAccount(BankAccount account){
        this.account=account;
    }
    public Customer(String firstName,String lastName){
        this.lastName=lastName;
        this.firstName=firstName;
    }
    public BankAccount getAccount(){
        return account;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    @Override
    public String toString(){
        return firstName+" "+lastName+" "+account;
    }
    public void closeAccount(){
        account=null;
    }
}
