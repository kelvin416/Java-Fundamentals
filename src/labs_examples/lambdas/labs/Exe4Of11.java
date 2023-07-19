package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exe4Of11 {
    public static void main(String[] args) throws IOException {
        String csvFile = "src/labs_examples/lambdas/labs/stream_text_lab.csv";
        List<String> collect = Files.lines(Paths.get(csvFile))
                .filter(x -> x.contains("o"))
                .collect(Collectors.toList());

        collect.forEach(x -> System.out.println(x));
    }
}
