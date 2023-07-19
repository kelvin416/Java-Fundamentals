package labs_examples.lambdas.labs;

import java.util.stream.Stream;

public class Exe4Of10 {
    public static void main(String[] args) {
        Stream<String> cars = Stream.of("BMW", "Tesla", "Bughatti", "Toyota");
        boolean answer = cars.allMatch(s -> s.length() > 2);

        System.out.println(answer);
    }

}
