package week2.OOP;

public class Car {
    String name;
    String color;
    int numberOfWindows;
    int seats;
    double topSpeed;
    boolean isFast;

    public void hasTurbo() {
        System.out.println("This " + name + " is " + color +", has " + seats + " seats, and has a top Speed of " + topSpeed);
    }

}
