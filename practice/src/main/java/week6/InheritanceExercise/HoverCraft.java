package week6.InheritanceExercise;

public class HoverCraft extends Vehicle {
    private String currentTerrain;

    public HoverCraft(String currentTerrain) {
        super();
        this.currentTerrain = currentTerrain;
    }

    public HoverCraft(String brand,String color, int nrOfPassengers, int cargoCapacity, int fuelCapacity, String currentTerrain) {
        super();
        this.currentTerrain = currentTerrain;
    }

    public void setCurrentTerrain(String currentTerrain) {
        this.currentTerrain = currentTerrain;
    }

    public String getCurrentTerrain() {
        return currentTerrain;
    }

    public void switchTerrain(String terrain) {
        if (terrain.equalsIgnoreCase("land") || terrain.equalsIgnoreCase("water")) {
            currentTerrain = terrain.toLowerCase();
            System.out.println("Hovercraft switched to " + currentTerrain + " mode.");
        } else {
            System.out.println("Invalid terrain. Please choose 'land' or 'water'.");
        }
    }
}
