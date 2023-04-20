package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //since the size of the array is known, it is initialized to i then its value is decrease in every iteration.
        for (int i = 6; i < days.length; i--){
            System.out.println(days[i]);
            //we provide an if statement so that when the value of i equals 0, we break out of the loop.
            if (i == 0){
                break;
            }
        }
    }

}
