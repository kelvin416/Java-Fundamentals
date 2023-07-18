package labs_examples.lambdas.my_examples.stream_API;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamWorkFlow {
    public static void main(String[] args) {
        Integer[] numbers = {23, 98, -9, 0, 22, -12, -18};
        Stream<Integer> stream = Arrays.stream(numbers);

        int addition = stream.filter(x -> x > 0).reduce(0, (Integer a, Integer b) -> a + b);
        System.out.println("The sum is: " + addition);

        Stream.of("Ava", "Aneri", "Alberto").sorted().forEach(System.out::println);

    }
}
