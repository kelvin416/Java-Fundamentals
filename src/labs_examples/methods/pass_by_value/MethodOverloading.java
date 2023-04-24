package labs_examples.methods.pass_by_value;

public class MethodOverloading {
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int multiply(int a, int b, int c){
        return a * b * c;
    }
    public static double multiply(double a, double b){
        return (int)(a * b);
    }

}
