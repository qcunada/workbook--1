package week5.HotelOperations;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(2,250,false,true);
        Room room2 = new Room(3,400,false,false);
        Room room3 = new Room(1,100,true,true);

        System.out.println("Room 1 has " + room1.getNumberOfBeds() + " beds, is priced at $" + room1.getPrice() + " and its availability: " + room1.isAvailable());
        System.out.println("Room 2 has " + room2.getNumberOfBeds() + " beds, is priced at $" + room2.getPrice() + " and its availability: " + room2.isAvailable());
        System.out.println("Room 3 has " + room3.getNumberOfBeds() + " bed, is priced at $" + room3.getPrice() + " and its availability: " + room3.isAvailable());
    }

}
