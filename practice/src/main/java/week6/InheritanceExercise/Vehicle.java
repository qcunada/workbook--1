package week6.InheritanceExercise;

public class Vehicle {
    private String brand;
    private String color;
    private int nrOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;


    public Vehicle(){

    }

    public Vehicle(String Brand,String color, int nrOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.brand = brand;
        this.color = color;
        this.nrOfPassengers = nrOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNrOfPassengers() {
        return nrOfPassengers;
    }

    public void setNrOfPassengers(int nrOfPassengers) {
        this.nrOfPassengers = nrOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
    public void moveForward(){
        System.out.println("vehicle can move forward in the speed of " + getFuelCapacity());
    }
    public void startEngine(){

    }
}
