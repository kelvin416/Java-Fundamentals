package labs_examples.lambdas.my_examples;

import java.util.function.Function;
import java.util.function.Predicate;

public class BuiltInFunctionalInterfaces {
    public static void main(String[] args) {
        demonstratePredicate();
        demonstrateFunction();
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
        
    }
}
