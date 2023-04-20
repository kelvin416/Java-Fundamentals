package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10;");
        int number = scanner.nextInt();

        for (int i = 0; i < array.length; i++){
            // the .equals method helps in finding if the number is in the array.
            array.equals(number);
        }
        // then we print out the array position number
        System.out.println("The number is at index: " + array[number]);
    }
}