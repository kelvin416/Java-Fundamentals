package labs_examples.methods.pass_by_value;

public class VarArgs2 {
    public static void main(String[] args) {

        int x = addNumbers(10, 10, 10, 10, 10);
        int y = addNumbers(10, 10, 10);
        int z = addNumbers(10, 10);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }

    public static int addNumbers(int a, int b, int... args){
        int count = 0;
        for (int i : args){
            count+=i;
        }

        int sum = a + b + count;

        return sum;
    }
}
