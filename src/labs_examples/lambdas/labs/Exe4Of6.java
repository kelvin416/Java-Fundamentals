package labs_examples.lambdas.labs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exe4Of6 {
    public static void main(String[] args) throws IOException {
        String txtFile = "src/labs_examples/lambdas/labs/hello.txt";
        Stream<String> textFile = Files.lines(Paths.get(txtFile));
        textFile.forEach(System.out::println);
        textFile.close();
    }
}
