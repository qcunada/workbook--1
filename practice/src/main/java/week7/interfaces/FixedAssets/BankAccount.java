package week7.interfaces.FixedAssets;

public class BankAccount implements Valuable {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){
        if (amount > 0) {
            balance += amount;
        }

    }
    public void deposit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    @Override
    public double getValue() {
        return balance;
    }
    @Override
    public String toString() {
        return "Bank Account - " + accountHolder + ", Balance: $" + balance;
    }

}
