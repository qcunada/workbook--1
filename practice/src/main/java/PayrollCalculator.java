import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //my calculator

        System.out.println("name:  ");
        String name = scanner.nextLine();
        System.out.println("hours worked per week(max 40):  ");
        double hoursWorked = scanner.nextDouble();
        System.out.println("pay rate:  ");
        double payRate = scanner.nextDouble();
        double grossPay = (hoursWorked * payRate);

        System.out.println("Name: " + name + "'s " +"Gross pay is " + "$"+ grossPay);

        System.out.println("OT hours: ");
        double otHours = scanner.nextDouble();
        double otPay = ((otHours * payRate) * 1.5);
        System.out.println("overtime pay: " + otPay);

        System.out.println("total weekly income: " + "$"+(grossPay + otPay));





        // maaike's payroll calculator

        // get name
        System.out.println("Please enter your name: ");
        String name1 = scanner.nextLine();

        // hours worked
        System.out.println("Enter hours worked, please: ");
        double hrsWorked = scanner.nextDouble();

        // pay rate
        System.out.println("Please enter pay rate: ");
        double payRate1 = scanner.nextDouble();

        //calc gross pay include overtime for 1.5x pay
        double grossPay1 = 0;
        //check for OT
        if(hrsWorked > 40) {
            // if there is OT >> those hours have a special rate
            grossPay1 += (hrsWorked - 40) * payRate1 * 1.5;
            grossPay1 += 40 * payRate1;
        }else {
            //everything under 40 hours is normal rate
            grossPay1 += hrsWorked * payRate1;
        }
        //display name + pay
        System.out.println(name + "has " + "$"+grossPay1 + "as a salary");



    }
}
