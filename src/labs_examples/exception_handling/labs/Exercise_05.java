package labs_examples.exception_handling.labs;

import java.util.Arrays;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class Example {

    public static void main(String[] args) {
        try {
            alcoholSale1();
        } catch (SaleOfAlcohol exc){
            System.out.println(exc.toString());
        }
    }

    public static void alcoholSale1() throws SaleOfAlcohol{
        alcoholSale2();
    }

    public static void alcoholSale2() throws SaleOfAlcohol {
        int age = 17;
        if (age < 18){
            throw new SaleOfAlcohol();
        } else {
            System.out.println("You can have some Alcohol.");
        }
    }

}

class SaleOfAlcohol extends Exception {
    @Override
    public String toString() {
        return "SaleOfAlcohol{ Is illegal to persons under age of 18.}";
    }
}
