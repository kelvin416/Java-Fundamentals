package labs_examples.lambdas.labs;

import java.util.function.BiFunction;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

//1
class Fruits {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> fruitDivision = Fruits::divide;
        int oranges = fruitDivision.apply(30, 20);
        System.out.println("If you divide 30 fruits equally between 20 students you get a remainder of: " + oranges + " oranges");
    }
}