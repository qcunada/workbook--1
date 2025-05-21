package week7.interfaces.FixedAssets;

import java.util.ArrayList;

public class FinanceApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", 3424);
        Valuable account2 = new BankAccount("Gary", 122421);
// try to deposit money into both accounts
        account1.deposit(100);
        ((BankAccount) account2).deposit(100);

     Portfolio portfolio = new Portfolio("Portfolio","Jin");
        portfolio.add(new House("Mansion",200000,2028,22321,6));
        portfolio.add(new BankAccount("Alice", 5000));
        portfolio.add(new CreditCard(3342, "joma"));
        System.out.println("Assets in Portfolio:");
        for (Valuable asset : portfolio.getValuables()) {
            System.out.println(asset);

        }
    }
}
