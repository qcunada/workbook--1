package week7.StreamExercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {

        //Create List of integers
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);

        //Filter out even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(input -> input % 2 != 1) //keep only even numbers
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evenNumbers);

        // Square the even numbers
        List<Integer> squareEven = numbers.stream()
                .filter(input -> input % 2 != 1) //keep only even number
                .map(input -> input * input) // Square them
                .collect(Collectors.toList()); //collect results
        System.out.println("Squared Even Numbers: " + squareEven);
    }
}
