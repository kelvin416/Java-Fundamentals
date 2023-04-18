package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 10: continue
 *
 *      Demonstrate the use of the "continue" statement to skip to the next iteration of a loop.
 *
 */

public class Exercise_10 {
    public static void main(String[] args) {
        for (int x = 0; x <= 10; x++){
            if (x == 7){
                continue;
            }
            //number 7 will not be printed since the loop will is forced to iterate earlier before this print line.
            System.out.println("X is: " + x);
        }
    }
}
