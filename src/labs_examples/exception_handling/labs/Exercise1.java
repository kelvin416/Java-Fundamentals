package labs_examples.exception_handling.labs;

public class Exercise1 {
    public static void main(String[] args) {
        int a = 20;
        int b = 0;

        try {
            int c = b / 0;
            System.out.println(c);
        } catch (ArithmeticException exc){
            System.out.println("Cannot divide number by 0");
        }
    }
}
