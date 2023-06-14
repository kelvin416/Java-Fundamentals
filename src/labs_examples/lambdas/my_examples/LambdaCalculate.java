package labs_examples.lambdas.my_examples;

@FunctionalInterface
public interface LambdaCalculate {
    public double calculate(double x, double y);
}

class LambdaControllerCalculate{
    public static void main(String[] args) {
        LambdaCalculate obj = (double a, double b) -> {
            return a * b;
        };

        double mult = obj.calculate(5, 6);
        System.out.println(mult);

        //redefining lambda expression
        obj = (double a, double b) -> {
            return (a * a) * (b * b);
        };
        double square = obj.calculate(10, 20);
        System.out.println(square);
    }
}
