package week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MoodLogger {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        boolean continueLogging = true;

        System.out.println("HELLO THERE!");

        while (continueLogging) {
         LocalDateTime currentDateTime = LocalDateTime.now();

         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
         String formattedDate = currentDateTime.format(dtf);


         System.out.println("How are you feeling today?");
         String feeling = scanner.nextLine().toUpperCase();

         try (FileWriter fw = new FileWriter("User_Feelings_Input.txt", true)) {
             fw.write("You felt " + feeling + " on this date [" + formattedDate + "]" + "\n");
             System.out.println("You were feeling " + feeling + " on this date [ " + formattedDate + " ]");
             System.out.println("What you felt on this date and time has been saved.");
         } catch (IOException e) {
             System.out.println(e.getMessage());
         }
         System.out.println("Would you like to read the logs? (yes/no): ");
         String readLogChoice = scanner.nextLine().toLowerCase();


         if (readLogChoice.equals("yes")) {
             try (BufferedReader reader = new BufferedReader(new FileReader("User_Feelings_Input.txt"))) {
                 String line;
                 System.out.println("--Here are your Mood Logs--");
                 while ((line = reader.readLine()) != null) {
                     System.out.println(line);
                 }
             } catch (IOException e) {
                 System.out.println(e.getMessage());
             }
         }
         System.out.println("Do you want to log another feeling(yes/no)?");
         String anotherLog = scanner.nextLine().trim().toLowerCase();
         if (!anotherLog.equals("yes")) {
             continueLogging =false;
             System.out.println("Thank you for using the mood logger \n See you next time!");
         }
     }
    }
}
