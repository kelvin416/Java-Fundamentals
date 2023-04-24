package labs_examples.methods.pass_by_value;

public class CallingReturnTypes {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int z = ReturnTypes.multiply(a, b);
        int d = ReturnTypes.divide(b, a);

        String reverse = ReturnTypes.reverse("Enemy");// reversing word enemy using method reverse.
        System.out.println("The reverse of enemy is: " + reverse);
        System.out.println("The result of multiplication is: " + z);
        System.out.println("The result of division is: " + d);
        int isodd = ReturnTypes.isOdd(80);

        System.out.println("This is for MethodOverloading");
        int  j = MethodOverloading.multiply(44, 34);
        int  k = MethodOverloading.multiply(44, 34, 10);
        double  m = MethodOverloading.multiply(10.23, 33.33);

        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }
}
