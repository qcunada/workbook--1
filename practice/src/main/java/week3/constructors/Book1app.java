package week3.constructors;

public class Book1app {
    public static void main(String[] args) {
        Book1 smallBook = new Book1("Small Book","Quincy", 120);
        Book1 mediumBook = new Book1("Medium Book","Darryl", 300);
        Book1 bigBook = new Book1("Big Book","Cy", 550);
        System.out.println(smallBook.getTitle());
        System.out.println(mediumBook.getTitle());
        System.out.println(bigBook.getTitle());


        smallBook.describe();
        mediumBook.describe();
        bigBook.describe();

        Book1 mysteryBook = new Book1();
        mysteryBook.describe();


    }

}
