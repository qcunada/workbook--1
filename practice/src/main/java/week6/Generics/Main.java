package week6.Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bag<Laptop> laptopBag = new Bag<>();
        laptopBag.add(new Laptop("apple"));
        laptopBag.add(new Laptop(("hp")));
        laptopBag.add(new Laptop("msi"));
        laptopBag.printContents();

        System.out.println("+++++++++++++++");

        Bag<Chihuahua> chihuahuaBag = new Bag<>();
        chihuahuaBag.add(new Chihuahua("roro"));
        chihuahuaBag.add(new Chihuahua("mimi"));
        chihuahuaBag.add(new Chihuahua("popo"));
        chihuahuaBag.printContents();



    }
}
