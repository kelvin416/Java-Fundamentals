package labs_examples.exception_handling.labs;

public class Exercise6 {
    public static void main(String[] args) {
        try {
            divide2();
        } catch (ArithmeticException exc){
            System.out.println("Cannot divide number by 0.");
        }
    }

    public static void divide2() throws ArithmeticException{
        divide();
    }

    public static void divide() throws ArithmeticException{
        int x = 3;
        int y = 0;

        if (x == 0 || y == 0){
            throw new ArithmeticException();
        }
    }
}
