package labs_examples.lambdas.my_examples;

import java.util.ArrayList;

public class LambdaExpressionExamples {
    private int operate(int x, int y, GoodFunctionalInterface fobj){
        return fobj.abstractFunction(x, y);
    }
    public static void main(String[] args) {
        GoodFunctionalInterface add = (int a, int b) -> a + b;
        GoodFunctionalInterface multiply = (int a, int b) -> a * b;
        LambdaExpressionExamples obj = new LambdaExpressionExamples();

        System.out.println("Addition is: " + obj.operate(5, 7, add));
        System.out.println("Multiply is: " + obj.operate(5, 8, multiply));

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(78);
        numbers.add(58);
        numbers.add(3);
        numbers.add(34);
        numbers.add(90);
        numbers.add(41);
        numbers.add(12);

        // lambda to print out all numbers
        System.out.println("All numbers: ");
        numbers.forEach(nums -> System.out.println(nums));
        // lambda to print out odd numbers
        System.out.println("Odd numbers");
        numbers.forEach(nums -> {
            if (nums%2 != 0){
                System.out.println(nums);
            }
        });
        // lambda to print out even numbers
        System.out.println("Even Numbers: ");
        numbers.forEach(nums -> {
            if (nums%2 == 0){
                System.out.println(nums);
            }
        });
    }
}

@FunctionalInterface
interface GoodFunctionalInterface{
    int abstractFunction(int x, int y);
}
