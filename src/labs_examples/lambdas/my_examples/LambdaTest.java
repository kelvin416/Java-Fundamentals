package labs_examples.lambdas.my_examples;

public interface LambdaTest {
    public void abstractFunction(int x);
}

class LambdaSyntaxController {
    public static void main(String[] args) {
        LambdaTest lambda1 = (int x) -> System.out.println(x * 2);
        lambda1.abstractFunction(4);

        lambda1 = (int x) -> System.out.println(x * x);

        lambda1.abstractFunction(5);
    }
}
