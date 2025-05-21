package week6.Generics;

import java.util.ArrayList;
import java.util.List;

public class LaptopBag {

    private List<Laptop> items = new ArrayList<>();  //Field: List<Laptop> items

    public void add(Laptop laptop){    //Method: add(Laptop laptop)
        items.add(laptop);
    }

    public void printContents(){  //Method: printContents() – prints all laptops in the bag
        for (Laptop laptop : items) {
            System.out.println(laptop);
        }

    }
}
