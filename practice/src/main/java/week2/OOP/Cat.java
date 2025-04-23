package week2.OOP;

public class Cat {
    static String nickName ="Catto";
    String name;
    String color;
    int age;
    boolean isFluffy;

    public void meow() {
        System.out.println(name + " says: Meow! (in a " + color + " coat)");
    }
}
