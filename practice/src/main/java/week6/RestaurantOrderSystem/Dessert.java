package week6.RestaurantOrderSystem;

public class Dessert extends MenuItem{
    private int sweetnessLevel;
    private boolean isCold;


    public Dessert(String name, double price, int calories, int sweetnessLevel, boolean isCold) {
        super(name, price, calories);
        this.sweetnessLevel = sweetnessLevel;
        this.isCold = isCold;
    }

    public int getSweetnessLevel() {
        return sweetnessLevel;
    }

    public void setSweetnessLevel(int sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }

    public boolean isCold() {
        return isCold;
    }

    public void setCold(boolean cold) {
        isCold = cold;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
