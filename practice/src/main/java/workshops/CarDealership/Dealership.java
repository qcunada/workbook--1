package workshops.CarDealership;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String name;
    private String address;
    private String phone;
    private List<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    public List<Vehicle> getAllVehicles() {
        return inventory;
    }

    public ArrayList<Vehicle> getVehicleByPrice(double min,double max){
        ArrayList<Vehicle> matchingVehicles = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getPrice() >= min && vehicle.getPrice() <= max) {
                matchingVehicles.add(vehicle);
            }
        }
        return matchingVehicles;
    }

    public ArrayList<Vehicle> getVehicleByMakeAndModel(String make, String model){
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMake().equalsIgnoreCase(make) && vehicle.getModel().equalsIgnoreCase(model)){
                result.add(vehicle);
            }
        }

        return result;
    }
    public ArrayList<Vehicle> getVehicleByYear(int min,int max){
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getYear() >= min && vehicle.getYear() <= max){
                result.add(vehicle);
            }
        }

        return result;
    }
    public ArrayList<Vehicle> getVehicleByColor(String color){
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getColor().equalsIgnoreCase(color)){
                result.add(vehicle);
            }
        }

        return result;

    }
    public ArrayList<Vehicle> getVehicleByMileage(double min,double max){
        ArrayList<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : inventory) {
            if (vehicle.getMileage() >= min && vehicle.getMileage() <= max){
                result.add(vehicle);
            }
        }

        return result;
    }
    public ArrayList<Vehicle> getVehicleByType(String vehicleType){
       ArrayList<Vehicle> result = new ArrayList<>();
       for (Vehicle vehicle : inventory){
           if (vehicle.getVehicleType().equalsIgnoreCase(vehicleType)){
               result.add(vehicle);
           }
       }

        return result;

    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
        DealershipFileManager.saveDealership(this);
    }
    public void removeVehicle(Vehicle vehicle){
        inventory.remove(vehicle);
        DealershipFileManager.saveDealership(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
