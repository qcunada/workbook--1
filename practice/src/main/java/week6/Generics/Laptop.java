package week6.Generics;

public class Laptop {
    private String brand;

    public Laptop(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop: " + brand;
    }
}
