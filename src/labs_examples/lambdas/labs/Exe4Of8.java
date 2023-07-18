package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exe4Of8 {
    public static void main(String[] args) throws IOException {
        String csvFile = "src/labs_examples/lambdas/labs/stream_text_lab.csv";
        Stream<String> sumOfStrings = Files.lines(Paths.get(csvFile));
        double sum = sumOfStrings
                .map(x -> x.split(","))
                .filter(x -> x.length() == 2)
        System.out.println(sum);
    }
}
