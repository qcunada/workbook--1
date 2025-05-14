package week6.AssetManager;

import java.util.ArrayList;

public class AssetManager {
    public static void main(String[] args) {
        ArrayList<Asset> assetList = new ArrayList<>();

        assetList.add(new House("Mansion","5/13/2025",20000000,"1233 Rain st",1, 10000,25000));
        assetList.add(new House("Wooden Shack","1/15/2000",1,"1999 Dirt road",4,50,100));
        assetList.add(new Vehicle("Electric Car","4/01/2025", 60000,"Tesla Model 3",2024,50000));
        assetList.add(new Vehicle("Truck","3/05/2024",50000,"Honda Ridgeline",2018,100000));

        for (Asset asset : assetList) {
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: " + "$" + String.format("%.2f",asset.getOriginalCost()));


            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
                switch (house.getCondition()){
                    case 1:
                        System.out.println("Condition: Excellent");
                        break;
                    case 2:
                        System.out.println("Condition: Good");
                        break;
                    case 3:
                        System.out.println("Condition: Fair");
                        break;
                    case 4:
                        System.out.println("Condition: Poor");
                        break;
                }
                System.out.println("Square feet: " + house.getSquareFoot());
                System.out.println("Lot Size: " + house.getLotSize());
                System.out.println("Current Value: " + "$" + String.format("%.2f",house.getValue()) + "\n" + "═════════════════════════════════════════════════");

            }
            else if (asset instanceof Vehicle){
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Make and Model: " + vehicle.getMakeModel());
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Mileage: " + vehicle.getOdometer());
                System.out.println("Current Value: " + "$" + String.format("%.2f",vehicle.getValue()) + "\n" + "═════════════════════════════════════════════════");
            }

        }


    }
}
