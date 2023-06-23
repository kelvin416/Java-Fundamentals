package labs_examples.lambdas.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * Lambdas Exercise 2:
 *
 *      1) Demonstrate the use of 10 pre-built Functional Interfaces from the java.util.functions package. That's right,
 *      10 of them! You can do it! You'll know so much about them when you're done!
 *
 */

public class Exercise_02 {
    public static void main(String[] args) {
        demonstrateFunction();
        demonstrateSupplier();
        demonstrateConsumer();
        demonstrateBiFunction();
        demonstratePredicate();
        demonstrateBiPredicate();
    }

    public static void demonstrateFunction(){
        //Function interface has a  parameter type and return type
        Function<String, String> parentsName = (a) -> a + "..." + a;
        System.out.println("The child called their parent " + parentsName.apply("Dad"));
    }

    public static void demonstrateSupplier(){
        Supplier<Double> randomMath = () -> Math.random() * 20;

        System.out.println(randomMath.get());
    }

    public static void demonstrateConsumer(){
        List<String> kitchenEquipments = Arrays.asList("Oven", "Microwave", "Dishwasher", "GasCooker", "Fridge");

        kitchenEquipments.forEach((equipments) -> System.out.println(equipments + " is a kitchen equipment"));
    }

    public static void demonstrateBiFunction(){
        //BiFunction has two parameter types and return type
        BiFunction<Integer, Integer, String> quality = (pencilPrice, penPrice) -> {
            if (pencilPrice > penPrice){
                return pencilPrice + " is of higher quality than " + penPrice;
            } else {
                return pencilPrice + " is of lower quality than " + penPrice;
            }
        };

        System.out.println(quality.apply(30, 55));
    }

    public static void demonstratePredicate(){
        Predicate<String> lenghtOfWord = (a) -> {
            if (a.length() < 20){
                return true;
            } else {
                return false;
            }
        };

        System.out.println("Word less than 20 words?  " + lenghtOfWord.test("Instagram"));
    }

    public static void demonstrateBiPredicate(){
        BiPredicate<Integer, Integer> weight = (flightWeight, personWeight) -> {
            if (personWeight > flightWeight){
                return false;
            } else {
                return true;
            }
        };

        System.out.println("The passengers is allowed to board? " + weight.test(200, 99));
    }
}