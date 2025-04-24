package week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Products> inventory = getInventory();

        saveInventoryToFile(inventory);

        System.out.println("--We carry these products in our inventory.--");

        for (int i = 0; i < inventory.size(); i++) {
            Products p = inventory.get(i);
            System.out.println(" ID#: " + p.getId() + " Product: " + p.getName() + " - Price: $" + p.getPrice());
        }


        System.out.println("--Do you want to add more products to the inventory?--");
        String choice = scanner.nextLine().trim().toLowerCase();

        if (choice.equals("yes")) {
            addProductToFile();
        }

    }

    public static ArrayList<Products> getInventory() {
        ArrayList<Products> inventory = new ArrayList<Products>();

        inventory.add(new Products(0001, "Candy", 1.95));
        inventory.add(new Products(0002, "Juice", 7.95));
        inventory.add(new Products(0003, "Chicken", 10.50));
        inventory.add(new Products(0004, "Banana", 1.95));
        inventory.add(new Products(0005, "Soap", 4.95));

        return inventory;


    }

    public static void saveInventoryToFile(ArrayList<Products> inventory) {
        try (FileWriter fw = new FileWriter("inventory.txt", true)) {
            for (Products p : inventory) {
                fw.write(" ID#: " + p.getId() + " Product: " + p.getName() + " - Price: $" + p.getPrice() + "\n");
            }
            System.out.println("Initial inventory saved.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void addProductToFile() {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter fw = new FileWriter("inventory.txt", true)) {
            System.out.println("Enter product ID: ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter product name: ");
            String name = scanner.nextLine();

            System.out.println("Enter price: ");
            double price = Double.parseDouble(scanner.nextLine());

            fw.write(" ID#: " + id + " Product: " + name + " - Price: $" + price + "\n");
            System.out.println("ID #: " + id + " Product: " + name + " - Price: $" + price);
            System.out.println("New product saved.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            


        }

    }
}


