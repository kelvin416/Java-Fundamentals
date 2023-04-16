package labs_examples.conditional_statements;

public class WhileLoop {
    public static void main(String[] args) {

        // a traditional while loop checks the boolean value of the condition before running the loop.
        int count = 0;

        while (count < 10){
            System.out.println("Count is " + count);
            count++;
        }
        System.out.println("All DONE!");
    }
}
