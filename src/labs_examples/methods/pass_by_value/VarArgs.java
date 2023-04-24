package labs_examples.methods.pass_by_value;

public class VarArgs {
    public static void main(String[] args) {
        int x = countArgs("one", "two", "three");
        int y = countArgs("one", "two");
        int z = countArgs("one");

        System.out.println("Count one is: " + x);
        System.out.println("Count two is: " + y);
        System.out.println("Count three is: " + z);
    }

    public static int countArgs(String... args){
        int count = 0;
        for (String s : args) {
            count++;
        }
        return count;
    }
}
