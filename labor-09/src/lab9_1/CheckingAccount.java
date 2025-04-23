package lab9_1;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }
      @Override
    public boolean withdraw (double amount){

        if( amount> this.balance + this.overdraftLimit){
            return false;
        }
        if(amount <0){
            return false;
        }
        this.balance -= amount;
        return true;
    }


}
