package labs_examples.conditional_statements;

public class DoWhile {
    public static void main(String[] args) {
        // The do while loop runs the code in the body of the loop one time before checking the boolean expression.
        int count = 0;

        do {
            System.out.println("Count is " + count);
            count++;
        } while (count < 10);

        System.out.println("All DONE! In do-while loop.");
    }
}
