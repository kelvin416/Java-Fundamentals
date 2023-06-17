package labs_examples.lambdas.my_examples;

import java.util.List;
import java.util.function.*;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        demonstratePredicate();
        demonstrateFunction();
        demonstrateBiFunction();
    }

    public static void demonstratePredicate(){
        Predicate<Integer> lessThan = i -> (i < 10);
        System.out.println(lessThan.test(8));
    }

    public static void demonstrateFunction(){
        Function<Long, Double> length = b -> b / 2.3443;
        System.out.println(length.apply(77987979879l));
    }

    public static void demonstrateBiFunction(){
        // In BiFunction, there is three parameters passed in the function.
        // first is type of parameter, then type of second parameter, then type of the return type.
        BiFunction<String, String, String > function = (url, postfix) -> {
            String fullUrl = url + postfix;
            return fullUrl;
        };

        System.out.println(function.apply("Codding nomads", ".co"));

        //additional info
        BiFunction<Integer, Integer, String> function2 = (val1, val2) -> {
            if (val1 > val2){
                return val1 + " is larger than " + val2;
            } else {
                return val2 + " is larger than " + val1;
            }
        };

        System.out.println(function2.apply(233, 4556));
    }

    public static void demonstrateSupplier(){
        //This function returns a random value
        Supplier<Double> removeVal = () -> Math.random();

        //Print this random value using the get() method on the Supplier.
        System.out.println(removeVal.get());
    }

//    public static void demonstrateConsumer(){
//        List<String> names = Arrays.asList("Kim", "Martin");
//    }


}
