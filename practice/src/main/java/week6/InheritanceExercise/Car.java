package week6.InheritanceExercise;

public class Car extends Vehicle {
    private boolean isTrunkOpen;

    public Car(){
        super();
    }


    public Car(String brand, String color, int nrOfPassengers, int cargoCapacity, int fuelCapacity, boolean isTrunkOpen) {
        super();
        this.isTrunkOpen = isTrunkOpen;
    }

    public boolean isTrunkOpen() {
        return isTrunkOpen;
    }

    public void openTrunk() {
        if (!isTrunkOpen) {
            isTrunkOpen = true;
            System.out.println("Car trunk is now open.");
        } else {
            System.out.println("Trunk is already open.");
        }
    }

    public void closeTrunk() {
        if (isTrunkOpen) {
            isTrunkOpen = false;
            System.out.println("Car trunk is now closed.");
        } else {
            System.out.println("Trunk is already closed.");
        }
    }
        
     public void drive(){
            if (!isTrunkOpen) {
                isTrunkOpen = true;
                System.out.println("Go ahead and drive!");
            }else {
                System.out.println("can't drive with trunk open!");
            }
        }


}
