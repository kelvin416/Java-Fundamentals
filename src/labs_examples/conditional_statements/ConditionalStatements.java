package labs_examples.conditional_statements;

public class ConditionalStatements {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        boolean bool1 = true;
        boolean bool2 = false;

        // the statement below is if-else-if ladder.

        if (a < b && a <=0){
            System.out.println("a is less than b");
        } else if (b > 30) {
            System.out.println("b is greater than 30");
        } else if (b < 30) {
            System.out.println("b is less than 30");
        } else {
            System.out.println("a is not less than b and b is not greater than 30");
        }
    }
}
