package week7.interfaces.FixedAssets;

public class House extends FixedAsset {
    private int yearBuilt;
    private int squareFeet;
    private int nrOfBedrooms;

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getNrOfBedrooms() {
        return nrOfBedrooms;
    }

    public void setNrOfBedrooms(int nrOfBedrooms) {
        this.nrOfBedrooms = nrOfBedrooms;
    }

    public House(String name, double marketValue, int yearBuilt, int squareFeet, int nrOfBedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.nrOfBedrooms = nrOfBedrooms;


    }

    @Override
    public double getValue() {
        return getMarketValue() + (squareFeet * 10) ;
    }

    @Override
    public String toString() {
        return "House: " + getName() + "Value: $" + getMarketValue();
    }
}
