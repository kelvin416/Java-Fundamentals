package labs_examples.lambdas.my_examples;

@FunctionalInterface
public interface LambdaNoParameter {
    public String sayHello();
}

class LambdaController{
    public static void main(String[] args) {
        LambdaNoParameter msg = () -> {
            return "Hello";
        };
        System.out.println(msg.sayHello());

        //lambda expression with single parameter
        FunctionalLambda flambda = (num) -> num + 5;
        System.out.println(flambda.incrementByFive(27));
    }
}
