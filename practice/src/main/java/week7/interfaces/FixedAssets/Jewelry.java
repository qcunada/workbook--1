package week7.interfaces.FixedAssets;

public class Jewelry extends FixedAsset {
    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;

    }

    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return getMarketValue() * (karat/24.0);
    }
    public String toString() {
        return "Jewelry: " + getName() + ", Value: $" + getMarketValue();
    }
}
