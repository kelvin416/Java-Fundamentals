package labs_examples.exception_handling.labs;

public class Exercise4 {
    public static void main(String[] args) {
        int a = 30;
        int b = 2;
        int c = 0;
        try {
            int x = a / b;
            try {
                int y = x / 0;
            } catch (ArithmeticException exe2){
                System.out.println("Cannot divide x by 0");
            }
        } catch (ArithmeticException exc1){
            System.out.println("Cannot divide a by 0");
        }
    }
}
