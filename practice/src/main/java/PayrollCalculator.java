import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("name:  ");
        String name = scanner.nextLine();
        System.out.println("hours worked:  ");
        double hoursWorked = scanner.nextDouble();
        System.out.println("pay rate:  ");
        double payRate = scanner.nextDouble();

        System.out.println("Name: " + name + "'s " +"Gross pay is " + "$"+hoursWorked * payRate);


    }
}
