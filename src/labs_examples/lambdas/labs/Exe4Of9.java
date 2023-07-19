package labs_examples.lambdas.labs;

import java.util.Arrays;
import java.util.stream.Stream;

public class Exe4Of9 {
    public static void main(String[] args) {
        Stream<String> languages = Stream.of("Java", "Kotlin", "C++", "Python");
        boolean match = languages.anyMatch(x -> x.contains("Python"));
        System.out.println(match);
    }
}
