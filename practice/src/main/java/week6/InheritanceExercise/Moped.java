package week6.InheritanceExercise;

public class Moped extends Vehicle {
    private boolean hasPedalStart;

    public Moped() {
        super();
    }

    public Moped(String brand,String color, int nrOfPassengers, int cargoCapacity, int fuelCapacity, boolean hasPedalStart) {
        super();
        this.hasPedalStart = hasPedalStart;
    }

    public boolean isHasPedalStart() {
        return hasPedalStart;
    }

    public void setHasPedalStart(boolean hasPedalStart) {
        this.hasPedalStart = hasPedalStart;
    }

    public void pedalStart() {
        if (hasPedalStart) {
            System.out.println("Pedaling to start the moped...");
        } else {
            System.out.println("This moped does not support pedal start.");
        }
    }

}
