package labs_examples.methods.pass_by_value;

public class Recursion {
    public static void main(String[] args) {
        int x = getRectangle(6);
        System.out.println("TN: " + x);
    }

    public static int getRectangle(int number){
        int total;
        System.out.println("Method " + number);
        if (number == 1){
            System.out.println("Returned 1");
            return 1;
        } else {
            total = number + getRectangle(number - 1); // number + method calling back to itself.
            System.out.print("Returned " + total);
            System.out.println(" : " + number + " + getfactorial(" + number + " -1)");
            return total;
        }
    }
}
