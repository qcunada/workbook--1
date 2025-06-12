package week7.Lambdas;

import java.util.Arrays;
import java.util.List;


public class LambdaExample {
    public static void main(String[] args) {

        // 2. create two lambda expression
        NumericOperator add = (a ,b) -> a + b;
        NumericOperator multiply = (a,b) -> a * b;

        System.out.println("2. ADD: " + add.operate(5,4));
        System.out.println("\nMULTIPLY: " + multiply.operate(5,4));



        // 3. find maximum of two integers
        NumericOperator maximumInt = (a, b) -> (a > b) ? a : b;
        int result = maximumInt.operate(11,23);
        System.out.println("\n3. MAX: " + result);



        // 5. In the LambdaExample class, create a lambda expression that implements the StringFormatter interface. Use the lambda expression to convert a string to uppercase.
        StringFormatter toUpperCase = input -> input.toUpperCase();
        String result1 = toUpperCase.format("hello there");
        System.out.println("\n5.UPPERCASE: " + result1);



        // 7. Use the lambda expression to compute and print the square of an integer.
        UnaryOperator square = input -> input * input;
        int input1 = 6;
        int result3 = square.apply(input1);
        System.out.println("\n7.Square of " + input1 + " is: " + result);


        // 9. In the LambdaDemo class, create a lambda expression that implements the TriFunction interface.
        //Use the lambda expression to compute and print the average of three integers.

        TriFunction average = (int a,int b,int c) -> (a + b + c) / 3.0;
        int a = 23;
        int b = 32;
        int c = 21;
        double result4 = average.apply(a,b,c);
        System.out.println("\n9.Average of " + a + ", " + b + ", and " + c + " is: " + result4);


        // 11. In the LambdaDemo class, create a lambda expression that implements the Printer interface.
        //Use the lambda expression to print a string to the console.

        Printer prints = input -> System.out.println(input);
        prints.print("\n11.Here is your print from the printer  ");

        //13. Use the lambda expression to test if a string is empty and print the result.

        Predicate<String> isEmpty = input -> input.isEmpty();
        String string1 = "";
        String string2 = "Hello";
        System.out.println("Is '" + string1 + "' empty? " + isEmpty.test(string1));
        System.out.println("Is '" + string2 + "' empty? " + isEmpty.test(string2));



        //14. n the main method, pass a lambda expression to processStrings that tests if a string starts with a specific letter.

        List<String> names = Arrays.asList("Alice", "Bob", "Anna", "Charlie", "Amanda");

        // Lambda expression: check if string starts with 'A'
        Predicate<String> startsWithA = input -> input.startsWith("A");

        // Call the method with the lambda and list
        System.out.println("Strings that start with 'A':");
        processStrings(startsWithA, names);
    }






    //14. In the LambdaDemo class, write a method named processStrings that takes a Predicate<String> and a List<String>.
    //Use the method to iterate over the list and print strings that satisfy the predicate.
    //In the main method, pass a lambda expression to processStrings that tests if a string starts with a specific letter.


    public static void processStrings(Predicate<String> predicate, List<String> strings) {
        for (String s : strings) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }
}
