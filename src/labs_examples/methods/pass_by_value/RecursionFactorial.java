package labs_examples.methods.pass_by_value;

public class RecursionFactorial {
    public static void main(String[] args) {

        int x = factorial(5);
        System.out.println(x);

    }
    //factorial is: 1 * 2 * 3 * 4 * 5
    static int factorial(int x){
        int total;
        //The if statement below is a base case --> used to end the recursive calls
        if (x == 1)
            return 1;

        total = x * factorial(x - 1);

        return total;
    }
}
