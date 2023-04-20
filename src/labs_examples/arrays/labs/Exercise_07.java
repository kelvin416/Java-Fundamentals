package labs_examples.arrays.labs;

import java.util.ArrayList;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
public class Exercise_07 {
    public static void main(String[] args) {
        //creating an arraylist
        ArrayList<String> months = new ArrayList<>();
        //populating the arraylist below
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");

        //This will print out the size of the array.
        System.out.println("The Size of the array is: " + months.size());

        //I have used a foreach loop to access the data within the ArrayList
        for (String m : months) {
            System.out.println(m);
        }

        //The index of the array starts at 0 and ends at size of array - 1.
        System.out.println(months.indexOf("April"));
        //the dot operator has a lot of methods like .size(), .

    }
}
