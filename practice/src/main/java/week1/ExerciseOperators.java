package week1;

public class ExerciseOperators {
    public static void main(String[] args) {

        int  nr = 4;
        double dblNr = 3.2;
        char letter = 'a';

        System.out.println(nr);      //problem 1
        System.out.println(dblNr);
        System.out.println(letter);

        int nrOfTomato = 4;
        int nrOfApples = 2;
        System.out.println(nrOfTomato);
        System.out.println(nrOfApples);

       int sum = (nrOfTomato + nrOfApples);  // problem 2
        System.out.println("Sum:" + sum);


        int result = nrOfTomato / nrOfApples;  // problem 3
        System.out.println("Result:" + result);


        int nr1 = 55;  // problem 4
        double nr2 = 2.5;
        System.out.println(nr1 / nr2);


        int age = 28; // problem 5
        System.out.println("In 10 years I will be:" + (age + 10));



       byte byteNr = 100;  // problem 6
       int intByteNr = (int) byteNr;
        System.out.println("Byte Number:" + byteNr);
        System.out.println("Int Number:" + intByteNr);


        double doubleNr = 5.7;  // problem 7
        int intNr = (int) doubleNr;
        System.out.println("Double value:" + doubleNr);
        System.out.println("Int value:" + intNr);


        float floatNr = 2.30F;  // problem 8
        int number = 43;
        double floatintresult = (floatNr * number);
        System.out.println("Float times int:" + floatintresult);


        char status = 'A';   // problem 9
        System.out.println("task 9:" + ++status);


        int a = 9;  //problem 10
        int b = 2;
        System.out.println("Divide a and b:" + a / b);
        System.out.println("Remainder of a and b:" + a % b);


        double weight = 66.0;  //problem 11
        double height = 1.73;
        double BMI = weight / (height * height);
        System.out.println("BMI:" + BMI);


        double number1 = 32.0;  // problem 12
        double number2 = 45.0;
        double number3 = 11.0;
        double avg = (number1 + number2 + number3) / 3;
        System.out.println("Average:" + avg);

        int x = 12;

        System.out.println("initial value:" + x);
        x += 4;

        int h = (x -= 10);
        int i = (x *= 2);
        System.out.println("value after adding 4");
        System.out.println("value after subtracting 10" +  h);
        System.out.println("value after multiplying 2" +  i);

        short s = 30000;   // problem 14
        short newShort = (short)(s * 2);
        System.out.println(newShort);

        double price = 10.99;  // problem 15
        int quantity = 5;
        int totalCost = (int)(price * quantity);
        System.out.println(totalCost);


        char letter1 = 'z'; // problem 17
        char newLetter = (char) (letter - 2);
        System.out.println(newLetter);

        long value = 2000000000;  //problem 18
        long newValue = value + 1000000000;
        System.out.println(newValue);

        double radius = 4.5;
        double area = Math.PI * radius * radius;
        System.out.println(area);

        int totalMinutes = 350;
        int fullHours = 350 / 60;
        int remainingMinutes = 350 % 60;



        double electricityCost = 2.75;







        }
    }
