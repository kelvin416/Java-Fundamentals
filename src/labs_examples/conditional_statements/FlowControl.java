package labs_examples.conditional_statements;

public class FlowControl {
    public static void main(String[] args) {
        // FLOW CONTROL comprises continue, break, and return Keywords.
        //in nested for loops, continue keyword forces an early iteration of the loop only where it is found.
        for (int i = 0; i <= 4; i++){
            for (int x = 0; x <= 5; x++){
                if (x == 2){
                    continue;
                }
                //System.out.println("X is: " + x);
            }
            //System.out.println("I = " + i);
        }

        //break keyword
        for (int i = 0; i <= 5; i++){
            if (i == 3){
                //the break keyword exists from the nearest loop
                break;
            }
            //System.out.println("I is: " + i);
        }

        someMethod(9);


    }
    //return keyword --> exits the method it's currently in.
    // However, if you hit the return keyword early in the method you will exit from the method since the result has been met.
    // exist the method and returns a value if the method requires it.
    public static int someMethod(int val){
        if (val == 0){
            System.out.println("0) This will print");
            return 0;
        } else if (val == 1) {
            System.out.println("1) This will print.");
            return 1;
        } else {
            System.out.println(val + ") This will print");
            return val;
        }
    }
}
