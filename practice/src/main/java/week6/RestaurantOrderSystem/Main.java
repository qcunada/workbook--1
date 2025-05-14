package week6.RestaurantOrderSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MenuItem> menuItemList = new ArrayList<>();

        menuItemList.add(new Drink("Margarita",15.00, 120, false,true));

        for (MenuItem item : menuItemList) {
            System.out.println(item.getDescription());
            System.out.println("-------------------------");
        }



    }
}
