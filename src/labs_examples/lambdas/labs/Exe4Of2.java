package labs_examples.lambdas.labs;

import java.util.stream.IntStream;

public class Exe4Of2 {
    public static void main(String[] args) {
        //sum function
        int sum = IntStream.range(1, 9).sum();
        System.out.println(sum);
    }
}
