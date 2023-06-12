package labs_examples.lambdas.my_examples;

public interface Anonymus_Class {
    double calculate(double a, double b);
}

class AnonymousController{
    public static void main(String[] args) {
        Anonymus_Class anonymusClass = new Anonymus_Class() {
            @Override
            public double calculate(double a, double b) {
                if (a > b){
                    return a;
                } else {
                    return b;
                }
            }
        };

        double largerNUmber = anonymusClass.calculate(5, 7);
        System.out.println("The larger number is " + largerNUmber);
    }
}
