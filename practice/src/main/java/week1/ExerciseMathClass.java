package week1;

public class ExerciseMathClass {
    public static void main (String[] args) {

        int number = -45; //exercise 1

        System.out.println(Math.abs(number));

        double num1 = 3.5; //exercise 2
        double num2 = 7.8;
        System.out.println(Math.max(num1, num2));

        int int1 = 99; //exercise 3
        int int2 = 23;

        System.out.println(Math.min(int1, int2));

        double dbl = 8.9; // exercise 4
        System.out.println(Math.floor(dbl));

        double dbl1 = 5.2; //exercise 5
        System.out.println(Math.ceil(dbl1));

        double dbl2 = 9.6; // exercise 6
        System.out.println(Math.round(dbl2));

        double morningTemp = -3.7;  // exercise 7
        double afternoonNap = 12.4;
        System.out.println(Math.abs(morningTemp - afternoonNap));
        System.out.println(Math.max(morningTemp,afternoonNap));
        System.out.println(Math.min(morningTemp, afternoonNap));
        System.out.println(Math.round(afternoonNap));
        System.out.println(Math.floor(morningTemp));

        double price = 10.876; //bonus 1
        double roundedNr = (double) Math.round(price * 100) / 100;
        System.out.println ("bonus 1 = " + roundedNr);

        double duration = 320; //bonus 2
        System.out.println("real minutes:" + duration / 60);
        System.out.println("show as:" + Math.ceil(duration/ 60));

        double price1 = 3.87; // bonus 3
        System.out.println("No pennies : " + Math.round(price1 / 0.05) * 0.05);
        System.out.println("No pennies: " + (float)Math.floor(price1 / 0.05) * 0.05);

        double x = 5.9; //bonus 4
        int y = (int)x + 3;
        System.out.println(y);

        int z = (int)(x + 3);
        System.out.println(z);

        int a = 17; // bonus 5
        int b = 42;
        int c = 9;
        int maxOfValue = Math.max(a, (Math.max(b,c)));
        System.out.println(maxOfValue);

        double total = 17.23; // bonus 6
        int pay = (int) Math.ceil(total);
        System.out.println("pay euro: " + pay + "euros");

        int x2 = 150; // bonus 7
        byte y2 = (byte)x2;
        System.out.println(y2);

        double start = -12.8; //bonus 8
        double end = 7.3;

        double absDistance = Math.abs(start - end);
        System.out.println(absDistance);
        System.out.println(Math.ceil(absDistance));
        System.out.println((int) absDistance);









    }

}

