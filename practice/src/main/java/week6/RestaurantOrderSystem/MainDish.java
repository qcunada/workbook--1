package week6.RestaurantOrderSystem;

public class MainDish extends MenuItem {
       private int spiceLevel;
       private String cuisine;

    public MainDish(String name, double price, int calories, int spiceLevel, String cuisine) {
        super(name, price, calories);
        this.spiceLevel = spiceLevel;
        this.cuisine = cuisine;
    }

    public int getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(int spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
