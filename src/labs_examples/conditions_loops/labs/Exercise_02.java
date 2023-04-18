package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {
    
        // write completed here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type in a number from 1 to 7:  ");
        int number = scanner.nextInt();

        if (number == 1){
            System.out.println("Today is Monday.");
        } else if (number == 2) {
            System.out.println("Today is Tuesday.");
        } else if (number == 3) {
            System.out.println("Today is Wednesday.");
        } else if (number == 4) {
            System.out.println("Today is Thursday.");
        } else if (number == 5) {
            System.out.println("Today is Friday.");
        } else if (number == 6) {
            System.out.println("Today is Saturday.");
        } else if (number == 7) {
            System.out.println("Today is Sunday.");
        } else {
            System.out.println("That is not a day.");
        }

        scanner.close();

    }
}
