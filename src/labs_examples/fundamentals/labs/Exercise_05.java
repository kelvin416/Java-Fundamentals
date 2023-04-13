package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int length = str.length();
        System.out.println("The length of str is: " +length);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean equal = str.equalsIgnoreCase(str2);
        System.out.println("str and str2 are the same? : " +equal);

        // please concatenate str & str2 and set the result to a new String variable below
        String newString = str + " " +str2;
        System.out.println("The two strings combined/concatenated makes: " + newString);

        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replace(), substring(), contains(), indexOf() etc
        System.out.println("ALL UPPERCASE" + str.toUpperCase());
        System.out.println("all lowercase" + str.toLowerCase());


    }


}