package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 3: Months of the year
 *
 *      Take in a number from the user and print "January", "February", ... "December", or "Other"
 *      if the number from the user is 1, 2,... 12, or other respectively. Use a "switch" statement.
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        // First we create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello there. The numbers you will type represents months of the year. Jan to Feb.");
        System.out.print("Enter a number from 1 to 12: ");

        int month = scanner.nextInt();

        switch (month){
            case 1:
                System.out.println("Welcome to January.");
                break;
            case 2:
                System.out.println("Welcome to February.");
                break;
            case 3:
                System.out.println("Welcome to March.");
                break;
            case 4:
                System.out.println("Welcome to April.");
                break;
            case 5:
                System.out.println("Welcome to May.");
                break;
            case 6:
                System.out.println("Welcome to June.");
                break;
            case 7:
                System.out.println("Welcome to July.");
                break;
            case 8:
                System.out.println("Welcome to August.");
                break;
            case 9:
                System.out.println("Welcome to September.");
                break;
            case 10:
                System.out.println("Welcome to October.");
                break;
            case 11:
                System.out.println("Welcome to November.");
                break;
            case 12:
                System.out.println("Welcome to December.");
                break;
            default:
                System.out.println("This is not a month.");
                break;
        }
    }

}
