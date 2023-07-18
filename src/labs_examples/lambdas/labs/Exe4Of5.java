package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;

public class Exe4Of5 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 23, 43, 89, 99, 8);
        int sum = list.stream().reduce(0, (a, b) -> a + b);

        System.out.println(sum);
    }
}
