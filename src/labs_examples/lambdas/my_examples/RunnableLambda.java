package labs_examples.lambdas.my_examples;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class RunnableLambda {
    public static void main(String[] args) {
        //Functional Interface class using anonymous inner class

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("New Thread Runnable Created.");
            }
        }).start();

        new Thread(() -> {
            System.out.println("New Thread Lambda Created.");
        }).start();


        List<String> peps = Arrays.asList("Kelvin", "Joy", "Kyle", "Phoebe", "Kris");
        Predicate<String> predicate = (s) -> s.startsWith("K");

        //Iterate through the list
        for (String t : peps) {
            if (predicate.test(t)){
                System.out.println(t);
            }
        }
    }
}
