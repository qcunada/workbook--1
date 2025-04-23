package week3.oop1;

public class BookApp {      //This is your main class that runs the program.
    public static void main(String[] args) { // This is the main method — the entry point for any Java program. It gets called when you run your app.

        Book myBook = new Book();
        myBook.setName("Coding Experts"); //Calls the setName() method from the Book class. It assigns "Coding Experts" to the name variable of the Book object.
        myBook.setColor("Blue"); //Sets the color field to "Blue" using the setter method.
        myBook.setPages(-1); //Here you're trying to set a negative number of pages, which should not be allowed.

        System.out.println("Title: " + myBook.getName());
        System.out.println("Color of the Book: " + myBook.getColor());
        System.out.println("Pages: " + myBook.getPages());
    }
}
