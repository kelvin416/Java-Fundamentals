package labs_examples.lambdas.my_examples;

import java.util.ArrayList;

@FunctionalInterface
public interface StringConcatination {
    public String concatination(String a, String b);
}

class ConcController{
    public static void main(String[] args) {
        StringConcatination sconc = (str1, str2) -> str1 + str2;
        System.out.println(sconc.concatination("Hello ", "World"));

        ArrayList<String> names = new ArrayList<>();
        names.add("Beva");
        names.add("Kelvin");
        names.add("Jane");
        names.add("Doe");
        names.add("Jason");
        names.add("Angelina");
        names.add("Faith");
        names.forEach((name) -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name);
        });
    }
}
