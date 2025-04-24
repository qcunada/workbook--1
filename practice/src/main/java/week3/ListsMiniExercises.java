package week3;

import week3.oop1.Book;

import java.util.ArrayList;
import java.util.List;

public class ListsMiniExercises {
    public static void main(String[] args) {

        //Create a list of your favorite artists (or book or animals) - type String
        //Add 3 items to it
        //Print all of them with a loop
        //Remove your least favorite
        //Add a new one
        //Print all of them with a loop

        ArrayList<String> animals = new ArrayList<>();

        animals.add("cat");
        animals.add("capybara");
        animals.add("dog");

        for (int i = 0; i < animals.size(); i++) {
            System.out.println((i+1) + "." + animals.get(i));
        }

        animals.remove(2);
        System.out.println("--removed dog--");
        for (int i = 0; i < animals.size(); i++) {
            System.out.println((i+1) + "." + animals.get(i));
        }

        animals.add("eagle");
        System.out.println("--added eagle--");
        for(int i = 0; i < animals.size(); i++){
            System.out.println((i+1)+ "." + animals.get(i));
        }

        //Create a list of your favorite numbers - type Integer
        //Add your favorite numbers
        //Print all of them with a loop
        //Remove your least favorite
        //Add a new one
        //Print all of them with a loop
        //Sum all of the numbers and print the total

        ArrayList <Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println((i + 1) + ". " + numbers.get(i));
        }
        numbers.remove(1);
        System.out.println("--removing #2 on the list --");
        for (int i = 0; i < numbers.size(); i++){
            System.out.println((i+1) + ". " + numbers.get(i));
        }
        numbers.add(10);
        System.out.println("--adding #10 on the list--");
        for (int i = 0; i < numbers.size(); i++){
            System.out.println((i+1) + ". " + numbers.get(i));
        }
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        System.out.println("Sum of lists: " + sum);

        //Create a list of Book objects - type Book
        //Add three book objects
        //Print the title of all of them
        //Remove the last one
        //Add a new one
        //Print title and author for each of them

        List <Book> books = new ArrayList<>();

      books.add(new Book("Book a", "quincy"));
      books.add(new Book("Book b", "darryl"));
      books.add(new Book("Book c", "cy"));

      for (Book book : books) { // Object variable : list name
          System.out.println(book.title + " by " + book.author);
      }

      books.remove(1);
        System.out.println("--removed book b--");
      for (Book book : books){
          System.out.println(book.title + " by " + book.author);

      }

      books.add(new Book("Book d","quincyyy"));
        System.out.println("--added book d--");
        for (Book book : books) {
            System.out.println(book.title + " by " + book.author);
        }





    }
}
