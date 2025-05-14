package workshops.CarDealership;

import java.io.*;

public class DealershipFileManager {


    public static Dealership getDealership(){
        Dealership dealership = null;

        try {
            File file = new File("carInventory.csv");

            BufferedReader reader = new BufferedReader(new FileReader(file));

            String dealershipLine = reader.readLine();
            if (dealershipLine != null){
                String[] dealershipInfo = dealershipLine.split("\\|");
                String name = dealershipInfo[0];
                String address = dealershipInfo[1];
                String phone = dealershipInfo[2];

                dealership = new Dealership(name, address, phone);

                String carLine;
                while ((carLine = reader.readLine()) != null) {
                    String[] carInfo = carLine.split("\\|");

                 String vin = carInfo[0];
                 int year = Integer.parseInt(carInfo[1]);
                 String make = carInfo[2];
                 String model = carInfo[3];
                 String vehicleType = carInfo[4];
                 String color = carInfo[5];
                 int odometer = Integer.parseInt(carInfo[6]);
                 double price = Double.parseDouble(carInfo[7]);

                 Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
                    dealership.addVehicle(vehicle);
                }

            } reader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            return dealership;
    }

    public static void saveDealership(Dealership dealership){
        try {
            FileWriter fw = new FileWriter("carInventory.csv");
                fw.write(dealership.getName() + "|" + dealership.getAddress()+ "|" + dealership.getPhone() + "\n");

            for (Vehicle vehicle : dealership.getAllVehicles()){
                fw.write(vehicle.getVin() + "|" + vehicle.getYear() + "|" + vehicle.getMake() + "|" + vehicle.getModel() + "|" + vehicle.getVehicleType() + "|" + vehicle.getColor() + "|" + vehicle.getMileage() + "|" + vehicle.getPrice() + "\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
