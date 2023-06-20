package labs_examples.lambdas.my_examples;

import java.util.function.BiFunction;

public class MethodReferences {
    public static void main(String[] args) {
        //Lambda calling a static method
        BiFunction<Integer, Integer, Integer> lambdaResult = (a, b) -> MethodReferences.multiply(a, b);
        int x = lambdaResult.apply(11, 5);
        System.out.println("Lambda product of a given number is: " + x);

        //Method reference to a static method
        BiFunction<Integer, Integer, Integer> referenceResult = MethodReferences::multiply;
        int y = referenceResult.apply(10, 5);
        System.out.println("Method reference product of a given number is: " + y);
    }
    public static int multiply(int a, int b){
        return a * b;
    }
}
