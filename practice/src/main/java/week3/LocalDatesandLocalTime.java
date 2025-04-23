package week3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDatesandLocalTime {
    public static void main(String[] args) {

        //1. Print today's date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // 2. Print a specific date
        LocalDate ld2 = LocalDate.of(2025,6,14);
        System.out.println(ld2);

        //3. Get parts of a date
        LocalDate date = LocalDate.of(2025, 5,21);
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);

        //4. Print the current time
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        //5.Create a specific time
        LocalTime time = LocalTime.of(15,30);
        System.out.println(time);

        //6. Print parts of a time
        LocalTime lt1 = LocalTime.of(22,22);
        int hour = lt1.getHour();
        int minute = lt1.getMinute();
        System.out.println("hour: " + hour);
        System.out.println("minute: " + minute);

        //7. Create a LocalDateTime from date and time
        LocalDateTime ldt = LocalDateTime.of(ld,lt);
        System.out.println(ldt);

        //8. Print the current date and time
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println(ldt1);

        //9.Add 1 week to today’s date
        LocalDate ld9 = ld.plusWeeks(1);
        System.out.println(ld9);

        //10. Subtract 3 days from a specific date
        LocalDate ld10 = ld.minusDays(3);
        System.out.println(ld10);

        //11. Add 2 hours and 15 minutes to a LocalTime
        LocalTime lth11 = lt.plusHours(2).plusMinutes(15);
        System.out.println(lth11);

        //12. Calculate tomorrow's datetime
        LocalDateTime ltd12 = LocalDateTime.now().plusDays(1);
        System.out.println(ltd12);

        

    }
}
