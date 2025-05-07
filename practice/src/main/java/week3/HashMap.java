package week3;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String, String> itemDefinitions = new java.util.HashMap<>();

        itemDefinitions.put("Coffee", "a drink to make you stay awake");
        itemDefinitions.put("Cup", "to hold your coffee");
        itemDefinitions.put("Bed", "a place where you sleep");

        for (String item : itemDefinitions.keySet()) {
         String definition = itemDefinitions.get(item);

             System.out.println("Definition of " + item + " is " + definition);
         }
        //retrieve and print the meaning of one specific word
        System.out.println("meaning of coffee: " + itemDefinitions.get("Coffee"));

        //replace the meaning of one of the items
        itemDefinitions.put("Bed", "a place where you chill");
        System.out.println("updated meaning of bed: " + itemDefinitions.get("Bed"));

        //check if a certain word exist in the map
        String searchWord = "Cup";
        if (itemDefinitions.containsKey(searchWord)) {
            System.out.println(searchWord + " is in the dictionary");
        }else {
            System.out.println(searchWord + " is not in the dictionary");
        }

        for (String item : itemDefinitions.keySet()) {
            System.out.println(item);
        }
        for (String definitions : itemDefinitions.keySet()) {
            System.out.println(definitions);
        }


    }
}
