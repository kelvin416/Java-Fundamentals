package labs_examples.conditional_statements;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] values = {"This", "is", "very", "fun", "to", "do."};

        for (String name: values) {
            System.out.println("1. " + name);
        }
    }
}
