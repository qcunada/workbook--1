package week3.constructors;

public class Book1 {
    private String title;
    private String author;

    public Book1(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }
    //2.Add a method that uses the fields
    public void describe() {
        System.out.println("This book is named " + title
                + " by " + author + ". This books has " + pages + " pages.");
    }
    //3.Add a third field
    int pages;

    //5.Create a constructor with default values
    public Book1() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.pages = 0;
    }



}
