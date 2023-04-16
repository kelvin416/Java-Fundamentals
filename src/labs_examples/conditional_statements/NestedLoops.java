package labs_examples.conditional_statements;

public class NestedLoops {
    public static void main(String[] args) {
        // The issue with nested loops is that they grow exponentially.
        int innerCount = 0;
        int outerCount = 0;

        while (outerCount < 10){
            while (innerCount < 10){
                System.out.println("Outer count is " + outerCount + " and inner count is " + innerCount);
                innerCount++;
            }
            innerCount = 0;
            outerCount++;
        }
        System.out.println("All DONE! with nested while loop.");
    }
}
