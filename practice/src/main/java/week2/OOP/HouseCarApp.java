package week2.OOP;

public class HouseCarApp {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.name= "Mazda3";
        myCar.color="White";
        myCar.numberOfWindows= 4;
        myCar.seats = 5;
        myCar.topSpeed = 150;
        myCar.isFast =true;

        House myHouse = new House();
        myHouse.color ="Red";
        myHouse.nrOfWindows= 14;
        myHouse.nrOfRooms = 6;
        myHouse.isBig = true;
        myHouse.nrOfPeople = 3;

        myHouse.hasGarden();
        myCar.hasTurbo();

    }

}
