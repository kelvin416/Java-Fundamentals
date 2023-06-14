package labs_examples.lambdas.my_examples;

import java.util.ArrayList;

public class LambdaForEach {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(44);
        numbers.add(5);
        numbers.add(455);
        numbers.add(36);

        numbers.forEach(n -> System.out.println(n));
        //lambda to print odd elements

        numbers.forEach(n -> {
            if (n%2 != 0 ){
                System.out.println(n + " is odd.");
            }
        });
    }
}
