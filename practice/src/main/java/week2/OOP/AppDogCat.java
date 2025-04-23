package week2.OOP;

public class AppDogCat {
    public static void main(String[] args) {
        System.out.println(Dog.nickName);
        System.out.println(Cat.nickName);

        Dog myDog = new Dog(); //NameOfObject nameOfVariable = new NameOfObject
        myDog.name = "Zion";
        myDog.breed = "chihuahua";
        myDog.age = 3;
        myDog.isGoodBoy = true;

        Cat myCat = new Cat(); //NameOfObject nameOfVariable = new NameOfObject
        myCat.name = "Totoro";
        myCat.color = "Gray";
        myCat.age = 4;
        myCat.isFluffy = true;

        myDog.bark();
        myCat.meow();


    }


}
