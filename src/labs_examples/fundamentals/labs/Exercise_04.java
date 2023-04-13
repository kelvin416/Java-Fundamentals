package labs_examples.fundamentals.labs;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        
        //below are the additional data types
        boolean isFull = true;
        char letter = 'A';
        short shortNum = 127;
        long longNum = 1233232254;
        float x = 234.9988f;
        double d = 312.123786477;

        System.out.println("The honey jar is full: " + isFull);
        System.out.println("I like the letter: " + letter);
        System.out.println("Very short number: " + shortNum);
        System.out.println("Very long number: " + longNum);
        System.out.println("This is a floating number: " + x);
        System.out.println("This is a double number: " + d);

    }

}
