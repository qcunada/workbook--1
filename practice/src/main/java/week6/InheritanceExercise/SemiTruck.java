package week6.InheritanceExercise;

public class SemiTruck extends Vehicle {
    private double cargoCapacityTons; // capacity in tons

    public SemiTruck() {
        super();
    }

    public SemiTruck(String brand, String color, int nrOfPassengers, int cargoCapacity, int fuelCapacity, double cargoCapacityTons) {
        super();
        this.cargoCapacityTons = cargoCapacityTons;
    }

    public double getCargoCapacityTons() {
        return cargoCapacityTons;
    }

    public void setCargoCapacityTons(double cargoCapacityTons) {
        this.cargoCapacityTons = cargoCapacityTons;
    }


    public void carryHeavyLoad() {
        System.out.println(getCargoCapacity() + "can carry heavy loads");

    }
}

