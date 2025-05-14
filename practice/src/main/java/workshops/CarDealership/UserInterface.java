package workshops.CarDealership;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;
    static Scanner scanner = new Scanner(System.in);

    public UserInterface(){

    }



    public void display(){
        init();
        displayMenu();


    }
    private void init(){

        this.dealership = DealershipFileManager.getDealership();
    }
    private void displayMenu(){


        boolean run = true;
        while (run) {

            System.out.println("----DEALERSHIP MAIN MENU-----");
            System.out.println("What do you want to do today?");
            System.out.println(" (1) List all Vehicles");
            System.out.println(" (2) Search Vehicle by price");
            System.out.println(" (3) Search Vehicle by make/model");
            System.out.println(" (4) Search Vehicle by year");
            System.out.println(" (5) Search Vehicle by color");
            System.out.println(" (6) Search Vehicle by car type");
            System.out.println(" (7) Search Vehicle by mileage");
            System.out.println(" (8) Add a Vehicle");
            System.out.println(" (9) Remove a Vehicle");

            System.out.println(" (0) Exit");
            System.out.println("Choose an option: ");


            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    displayVehicles(dealership.getAllVehicles());
                    break;
                case "2":
                    processGetVehicleByPrice();
                    break;
                case "3":
                    processGetVehicleByMakeModel();
                    break;
                case "4":
                    processGetVehicleByYear();
                    break;
                case "5":
                    processGetVehicleByColor();
                    break;
                case "6":
                    processGetVehicleByCarType();
                    break;
                case "7":
                    processGetVehicleByMileage();
                    break;
                case "8":
                    processAddVehicle();
                    break;
                case "9":
                    processRemoveVehicle();
                    break;

                case "0":
                    System.out.println("You chose to exit the app.");
                    run = false;
                    break;
                default:
                    System.out.println("Error. Choose between the options.");

            }
        }

    }
    private void displayVehicles(List<Vehicle> vehicleList) {
        for(Vehicle vehicle : vehicleList){
            System.out.println(vehicle.toFileString());
        }

    }
    public void processGetVehicleByPrice(){
        System.out.println("What is the min price?");
        double min = Double.parseDouble(scanner.nextLine());
        System.out.println("What is the max price?");
        double max = Double.parseDouble(scanner.nextLine());
        displayVehicles(dealership.getVehicleByPrice(min,max));

    }


    public void processGetVehicleByMakeModel(){
        System.out.println("What is the make?");
        String make = scanner.nextLine();
        System.out.println("What is the model?");
        String model = scanner.nextLine();
        displayVehicles(dealership.getVehicleByMakeAndModel(make, model));
    }
    public void processGetVehicleByYear(){
        System.out.println("What is the start year?");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the end year?");
        int max = Integer.parseInt(scanner.nextLine());
        displayVehicles(dealership.getVehicleByYear(min, max));
    }
    public void processGetVehicleByColor(){
        System.out.println("What is the color?");
        String color = scanner.nextLine();
        displayVehicles(dealership.getVehicleByColor(color));
    }
    public void processGetVehicleByCarType(){
        System.out.println("What is the type?");
        String color = scanner.nextLine();
        displayVehicles(dealership.getVehicleByType(color));
    }
    public void processGetVehicleByMileage(){
        System.out.println("What is the min mileage?");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("What is the max mileage?");
        int max = Integer.parseInt(scanner.nextLine());
        displayVehicles(dealership.getVehicleByMileage(min, max));
    }
    public void processAddVehicle(){
        System.out.println("Vin:");
        String vin = scanner.nextLine();
        System.out.println("Year: ");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Make: ");
        String make = scanner.nextLine();
        System.out.println("Model: ");
        String model = scanner.nextLine();
        System.out.println("Type: ");
        String type = scanner.nextLine();
        System.out.println("color: ");
        String color = scanner.nextLine();
        System.out.println("Odometer: ");
        int odometer = Integer.parseInt(scanner.nextLine());
        System.out.println("Price:");
        double price = Double.parseDouble(scanner.nextLine());
        Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);
        this.dealership.addVehicle(vehicle);


    }
    public void processRemoveVehicle(){
        System.out.println("Vin:");
        String vin = scanner.nextLine();
        Vehicle vehicle = new Vehicle(vin, 0, null, null, null, null, 0, 0);
        this.dealership.removeVehicle(vehicle);

    }
}
