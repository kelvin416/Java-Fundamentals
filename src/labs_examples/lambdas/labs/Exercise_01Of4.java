package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class Exercise_01Of4 {
    public static void main(String[] args) {
        demonstrateBiFunction();
        demonstrateConsumer();

    }
    public static void demonstrateBiFunction(){
        //The biFunction built in functional interface takes in two arguments and one return type
        BiFunction<Integer, Integer, String> electronics = (element1, element2) -> {
            int difference = element1 - element2;
            if (difference > 0){
                return element1 + " is more expensive than " + element2 + " by " + difference;
            } else {
                return element1 + " is less expensive than " + element2 + " by " + difference;
            }
        };

        System.out.println(electronics.apply(44, 50));
    }

    public static void demonstrateConsumer(){
        //To demonstrate a consumer built in functional interface, List<> is used.
        List<String> fastCars =Arrays.asList("Bugatti Veron", "Mazda-CX7", "Toyota Supra", "Audi-R8", "BMW-X7");
        fastCars.forEach((car) -> System.out.println(car + " is a very fast Car."));
    }
}
