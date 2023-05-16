package labs_examples.try_catch;

public class ThrowingExceptions {
    public static void main(String[] args) {
        try {
            methodOne();
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exception Caught.");
        }
    }

    //Method one immediately throws any exceptions that occur to the main method.
    public static void methodOne() throws ArrayIndexOutOfBoundsException{
        methodTwo();
    }

    public static void methodTwo() throws ArrayIndexOutOfBoundsException{
        int[] nums = {12, 22, 90};

        try {
            int x = nums[10];
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Exception Caught in Method Two.");
            System.out.println("Now manually throwing back to Method One.");
            //The below line re-throws the exception back to method one.
            throw exception;
        }
    }
}
