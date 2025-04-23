package week3;

public class LoopsAndArrays {
    public static void main(String[] args) {

        //1. Print numbers with a for loop
        int[] num = {1, 2, 3, 4, 5};
        for (int index1 = 0; index1 < num.length; index1++) {
            System.out.println(num[index1]);
        } //We use i to loop through each position in the array (index). Arrays in Java start at index 0, so this prints every number one by one.

        //2. Count backwards with a while loop
        int index2 = 5;
        while (index2 > 0) {
            System.out.println(index2);
            index2--;
        }

        //3. Greet each person
        String[] names = {"Alice", "Bob", "Charlie"};
        for (int index3 = 0; index3 < names.length; index3++) {
            System.out.println("Hello, " + names[index3] + "!");
        }

        //4. Calculate the total
        int[] nr = {3, 5, 7, 2, 8};
        int sum = 0;
        for (int index4 = 0; index4 < nr.length; index4++) {
            sum += nr[index4];
        }
        System.out.println("Total: " + sum);

        //5. Print only even numbers
        int[] numbers = {4, 7, 10, 15, 18};
        for (int index5 = 0; index5 < numbers.length; index5++) {
            if (numbers[index5] % 2 == 0) {
                System.out.println(numbers[index5]);
            }
        }

        int x = 50;

        if (x == 50) {

            System.out.println("x is equal to 50");

        } else {

            System.out.println("x is not equal to 50");

            int i = 10;

            while (i > 0) {

                System.out.print(i + " ");

                i -= 2;

            }

        }

    }
}
