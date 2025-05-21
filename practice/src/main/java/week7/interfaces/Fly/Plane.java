package week7.interfaces.Fly;

public class Plane implements Flyable{
    private String name;
    private int passengers;
    private double maxAltitude;

    public Plane(String name, int passengers, double maxAltitude) {
        this.name = name;
        this.passengers = passengers;
        this.maxAltitude = maxAltitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getMaxAltitude() {
        return maxAltitude;
    }

    public void setMaxAltitude(double maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    @Override
    public void fly() {
        System.out.println("The aircraft, " + name + ", can fly at " + maxAltitude + " feet and can seat " + passengers + " passengers in one trip");
    }
}
