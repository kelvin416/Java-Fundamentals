package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;

public class Exe4Of3 {
    public static void main(String[] args) {
        int sum = 0;
        List<Integer> numbers = Arrays.asList(34, 56, 78, 22, 34, 53, 21);
        System.out.println(numbers.stream().map(x -> x / 2).mapToInt(Integer :: valueOf).sum());

    }
}
