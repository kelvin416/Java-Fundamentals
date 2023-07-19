package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exe4Of8 {
    public static void main(String[] args) throws IOException {
        double add;
        String csvFile = "src/labs_examples/lambdas/labs/stream_text_lab.csv";
        Stream<String> sumOfStrings = Files.lines(Paths.get(csvFile));
        sumOfStrings
                .map(x -> x.split(","))
                .filter(x -> Double.parseDouble(x[2]) > 0)
                .forEach(x -> System.out.println(x[2]));
    }
}
