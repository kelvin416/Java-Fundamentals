package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        // First we take the user numbers using a scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there lets use this calculator to get the sum and average of the numbers.");
        System.out.println("The first input is for a lower number and second is for a higher number.");

        System.out.print("Enter a low number: ");
        double lowerNum = scanner.nextDouble();
        System.out.print("Enter a high number: ");
        double  largerNum = scanner.nextDouble();

        double sum = 0;
        double average = (lowerNum + largerNum) / 2;

        for (double x = lowerNum; x <= largerNum; x += lowerNum){
            sum += x;
        }
        System.out.println("The sum is: " + (int)sum);
        System.out.println("The average is: " + average);
    }
}
