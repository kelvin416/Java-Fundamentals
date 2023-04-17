package labs_examples.conditional_statements;

public class NestedForLoop {
    public static void main(String[] args) {
        for (int x = 0; x <= 3; x++){
            System.out.println("Loop" + x + ":");
            for (int i = 0; i < 3; i++){
                System.out.println("x + i = " + (i + x));
            }

            System.out.println("--------------");
        }
    }
}
