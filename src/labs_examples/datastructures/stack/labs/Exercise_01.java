package labs_examples.datastructures.stack.labs;

import java.util.Stack;

/**
 *      Demonstrate your mastery of Java's built-in Stack class by completing the following:
 *
 *      1) instantiate a new Stack
 *      2) demonstrate the use of EVERY method in the Stack class - there are 5
 */

class NewStack{
    public static void main(String[] args) {
        Stack<String> months = new Stack<>();

        //push method
        months.push("January");
        months.push("Feb");
        months.push("March");
        months.push("April");
        months.push("May");
        months.push("June");
        months.push("July");
        months.push("August");
        months.push("September");

        System.out.println(months);

        //pop method
        months.pop();
        System.out.println(months);

        //peek method - shows the last month but does not remove from the list
        System.out.println(months.peek());
        System.out.println(months);

        //empty method
        System.out.println(months.empty());

        //search method
        System.out.println(months.search("January"));

    }
}
