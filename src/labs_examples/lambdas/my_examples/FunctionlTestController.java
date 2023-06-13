package labs_examples.lambdas.my_examples;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FunctionlTestController {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");

        Predicate<String> p = (s) -> s.startsWith("G");

        for (String n : name) {
            if (p.test(n))
                System.out.println(n);
        }
    }
}
