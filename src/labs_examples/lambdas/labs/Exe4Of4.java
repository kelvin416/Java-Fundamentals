package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.List;

public class Exe4Of4 {
    public static void main(String[] args) {
        List<Integer> average = Arrays.asList(34, 88, -56, -78, 22, -34, 53, -21);
        Arrays.stream(new int[] {34, 88, -56, -78, 22, -34, 53, -21})
                .filter(x -> x > 0)
                .average()
                .ifPresent(System.out::println);
    }
}
