package labs_examples.lambdas.my_examples;

public interface LambdaAsMethod {
    int operation(int a, int b);
}

class LambdaMethodController{
    private int operate(int a, int b, LambdaAsMethod lObj){
        return lObj.operation(a, b);
    }
    public static void main(String[] args) {
        LambdaAsMethod add = (int x, int y) -> x + y;
        LambdaAsMethod multiply = (int x, int y) -> x * y;
        LambdaMethodController obj = new LambdaMethodController();

        //adding new number using lambda expression
        System.out.println("Addition is " + obj.operate(5, 6, add));

        //Multiplying two numbers using lambda expression
        System.out.println("Multiplication is : " + obj.operate(8, 8, multiply));
    }
}
