package workshops.CarDealership;

import java.io.FileWriter;
import java.io.IOException;

public class ContractDataManager {
    public static void saveContract(Contract contract) {
        try (FileWriter fw = new FileWriter("contracts.csv", true)) {
            Vehicle vehicle = contract.getVehicleSold();


        } catch (IOException e) {
            System.out.println( e.getMessage());
        }
    }
}
