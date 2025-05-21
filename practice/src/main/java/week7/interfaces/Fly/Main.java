package week7.interfaces.Fly;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird baldEagle = new Bird("Bald Eagle", "Brown with white", 7.5);

        baldEagle.fly();

        Plane boeing747 = new Plane("Boing 747", 416,45000);

        boeing747.fly();
        System.out.println("----------------------");
        List<Flyable> flyersList = new ArrayList<>();
        flyersList.add(baldEagle);
        flyersList.add(boeing747);

        flyerList(flyersList);
    }
    public static void flyerList (List<Flyable> flyableList){
        for (Flyable f : flyableList){
            f.fly();
        }
    }
}
