package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int sumNumbers = 0;
        int[] array = new int[10];

        System.out.println("Enter the number of elements to be stored. 10 numbers.");
        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();

        for (int i = 0; i < array.length - 1; i++){
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++){
            sumNumbers += array[i];
        }

        System.out.println("The sum of the numbers is: " + sumNumbers);
        int averageOfNumbers = sumNumbers / 2;
        System.out.println("The average of the numbers is: " + averageOfNumbers);

    }

}