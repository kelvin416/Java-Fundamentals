package labs_examples.conditional_statements;

public class ForLoop {
    public static void main(String[] args) {
        // for loop iterates over a range of values to repeat a sequence of code.
        // for loops has three components --> initialization, condition, and iteration.


        for (int i = 0; i < 10; i++){
//            System.out.println("I count is : " + i);
            // for loops can also be nested. However, its value can grow exponentially and is used when it's a must.
            for (int x = 0; x <= 3; x++){
//                System.out.println("--x-- is: " + x);
            }
        }

        //loop for printing numbers 0 - 100
        for (int x = 0; x <= 100; x++){
            //System.out.println("This is : " + x);
        }

        System.out.println("Counting down to the new year starts now!!");
        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }
    }
}
