package Try;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Try {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        System.out.println(date.getDayOfMonth());
    }
}
