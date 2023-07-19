package labs_examples.lambdas.my_examples.stream_API;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMaps {
    public static void main(String[] args) throws IOException {
        String link = "src/labs_examples/lambdas/my_examples/stream_API/data.txt";
        Stream<String> hashMapping = Files.lines(Paths.get(link));
        Map<String, Integer> map = new HashMap<>();
        map = hashMapping
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0], //key
                        x -> Integer.parseInt(x[1]) //value
                ));
        hashMapping.close();
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

    }
}
