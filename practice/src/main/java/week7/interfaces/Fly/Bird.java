package week7.interfaces.Fly;

public class Bird implements Flyable {
        private String name;
        private String color;
        private double wingSize;

    public Bird(String name, String color, double wingSize) {
        this.name = name;
        this.color = color;
        this.wingSize = wingSize;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWingSize() {
        return wingSize;
    }

    public void setWingSize(double wingSize) {
        this.wingSize = wingSize;
    }

    @Override
    public void fly() {
        System.out.println(name + " flies high, with a wingspan of " + wingSize + " and its color is " + color);

    }
}
