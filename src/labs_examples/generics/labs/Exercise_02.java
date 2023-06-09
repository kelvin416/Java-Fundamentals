package labs_examples.generics.labs;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */
import java.util.ArrayList;

class Exercise2Controller{
    public static void main(String[] args) {
        Integer[] sumOfNumbers = {23, 45, 22, 56, 99, 100};

        System.out.println(Exercise2.sumNumbers(sumOfNumbers));


    }
}

class Exercise2{
    public static <N extends Number> int sumNumbers(N[] sumArray){
        int sum = 0;

        for (N numbers : sumArray) {
            sum += numbers.intValue();
        }
        return sum;

    }
}