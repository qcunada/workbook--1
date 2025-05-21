package week7.interfaces.FixedAssets;

public class CreditCard implements Valuable {
    private String cardHolder;
    private double balanceOwed;

    public CreditCard(double balanceOwed, String cardHolder) {
        this.balanceOwed = balanceOwed;
        this.cardHolder = cardHolder;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public double getBalanceOwed() {
        return balanceOwed;
    }

    public void setBalanceOwed(double balanceOwed) {
        this.balanceOwed = balanceOwed;
    }
    public void charge(double amount){
        if (amount > 0){
            balanceOwed += amount;
        }
    }
    public void pay(double amount){
        if (amount > 0 && amount <= balanceOwed){
            balanceOwed -= amount;
        }
    }

    @Override
    public double getValue() {
        return balanceOwed;
    }
    @Override
    public String toString() {
        return "Credit Card - " + cardHolder + ", Amount Owed: $" + balanceOwed;
    }

}
