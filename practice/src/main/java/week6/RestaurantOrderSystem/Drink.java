package week6.RestaurantOrderSystem;

public class Drink extends MenuItem{
    private boolean isHot;
    private boolean isAlcoholic;





    public Drink(String name, double price, int calories, boolean isHot, boolean isAlcoholic) {
        super(name, price, calories);
        this.isHot = isHot;
        this.isAlcoholic = isAlcoholic;


    }

    public boolean isHot() {
        return isHot;
    }

    public void setHot(boolean hot) {
        isHot = hot;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    @Override
    public String getDescription() {
        return  "Drink: " + getName() + "\n Calories :" + getCalories() + "\n Cold/Hot : " + (isHot ? "Hot" : "Cold") + "\n Alcoholic: " + (isAlcoholic ? "Alcoholic" : "Non Alcoholic");
    }
}
