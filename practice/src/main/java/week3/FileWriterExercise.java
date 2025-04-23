package week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; //This brings in the tools needed to work with files — things like FileWriter, FileReader, and BufferedReader.
import java.util.Scanner;

public class FileWriterExercise {  //In Java, all code must be inside a class. This is just the container for your program.
                 static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        //1.Write a single line to a file. Create a file named output.txt and write: "Hello, file world!"

        try (FileWriter fileWriter = new FileWriter("output.txt")) { //Creates a FileWriter to write to a file named output.txt. The try (...) part makes sure the file is closed automatically afterward.

            fileWriter.write("Hello, File world!"); //Writes the string "Hello, file world!" to the file.

        } catch (IOException e) {
            System.out.println(e.getMessage()); //Catches any file-related errors (like if the file can't be written).e.printStackTrace() prints details about what went wrong — helpful for debugging.
        }


        //2.Read that line back. Read from output.txt and print the line to the console.

        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) { //Creates a BufferedReader to read from the same file (output.txt).We wrap a FileReader with BufferedReader so we can easily read lines of text.

            String line = reader.readLine(); //Reads the first line from the file and stores it in the variable line.

            System.out.println("Read from file: " + line);  //Prints the line we just read from the file to the console.

        } catch (IOException e) {
            System.out.println(e.getMessage()); //Handles errors again for the reading part and then closes the class and method.
        }



        //3.Write multiple lines from an array.Create a String[] with lines of text like a short poem.Write all lines to a file, one per line.

        String[] poemLines = {"Roses are red","Violets are blue","sugar is sweet", "and so are you!"}; //Creates a String[] (array) called poemLines. Each item in the array is one line of your short poem. This array has 4 strings.

        try (FileWriter fileWriter = new FileWriter("poem.txt")) { //Opens a file named poem.txt for writing. This uses FileWriter inside a try-with-resources, which means the file will be automatically closed after the block finishes. This helps avoid memory leaks or file-locking issues.

            for (String line : poemLines) { //Loops through each line in the poemLines array. This is an enhanced for loop (also called a “for-each” loop) — it goes through each string one by one.

                fileWriter.write(line + "\n");  //Writes the current line to the file. The + "\n" part adds a newline character, so each string appears on its own line in the file.
            }
        } catch (IOException e) {
            System.out.println(e.getMessage()); //Catches any exceptions that might happen while writing the file (e.g. if the file can’t be created). If something goes wrong, it prints an error message.
        }



        //4.Read file line-by-line and print. Use BufferedReader to read your poem back, line by line.

        try (BufferedReader reader = new BufferedReader(new FileReader("poem.txt"))){ //Opens poem.txt for reading. BufferedReader lets you read lines easily. try-with-resources automatically closes the file when done
            String line; //Declares a variable to hold each line as we read it
            while ((line = reader.readLine()) != null) { //Reads one line at a time. .readLine() returns null when it hits the end of the file
                System.out.println(line); //Prints each line to the console
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());; //Handles any issues if the file doesn't exist or can't be read
        }



        //5. Ask the user for lines and save to a file. Use Scanner to let the user type 3 lines. Write each line to a file.

        try (FileWriter fileWriter = new FileWriter("user_input.txt")) { //This line opens user_input.txt for writing using a try-with-resources block. It auto-closes the FileWriter and creates the file if it doesn't exist, or overwrites it if it does.
            for (int i = 1; i <= 3; i++) { // A for loop that runs 3 times. i starts at 1, and increases by 1 each loop, until it reaches 3. You use i to show the line number in the user prompt.
                System.out.println("Enter line " + i + ":"); //Displays a prompt to the user:, "Enter line 1:", then "Enter line 2:", and so on. i is used to show the current line number.
                String userInput = scanner.nextLine(); // The text is stored in the variable userInput. Waits for the user to type a line of text and hit Enter.
                fileWriter.write(userInput + "\n"); //Writes the user's input to the file, followed by a newline (\n) so each line appears on its own line in the file.
            }
            System.out.println("Your lines have been saved to 'user_input.txt'.");
            //Informs the user that the lines were successfully written to the file.
        } catch (Exception e) { //If any error happens (like problems writing to the file), this block catches it.
            System.out.println(e.getMessage());
        }


        //6. Count how many times a word appears. Ask the user for a word, then read a file and count how often that word appears. Focus: Looping through lines, using .contains()

        System.out.println("Please enter a word");
        String wordToFind = scanner.nextLine();

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("user_input.txt"))){
            String line;

            while ((line = reader.readLine()) != null) {
                if (line.contains(wordToFind)) {
                    count++;
                }

            }
            System.out.println("The word \"" + wordToFind + "\" appears " + count +" time(s).");
        } catch (IOException e) {
            System.out.println("Could not read the file.");
            System.out.println(e.getMessage());
        }



    }

}
