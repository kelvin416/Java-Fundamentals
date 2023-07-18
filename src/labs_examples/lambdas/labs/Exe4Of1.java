package labs_examples.lambdas.labs;

import java.util.stream.IntStream;

public class Exe4Of1 {
    public static void main(String[] args) {
        //#1 Range function inclusive
        IntStream.range(1, 16).forEach(System.out :: println);
    }
}
