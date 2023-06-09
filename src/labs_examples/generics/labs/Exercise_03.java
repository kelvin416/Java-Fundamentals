package labs_examples.generics.labs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static labs_examples.methods.pass_by_value.ReturnTypes.reverse;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Exercise3Controller{
    public static void main(String[] args) {
        //1.
        int a = 20;
        float b = 30.14f;
        double c = Exercise3.sumNum(a, b);
        System.out.println(c);
        System.out.println();

        //2
        String[] names = {"maam", "civic", "dad", "radar"};
        List<Object> aList = new ArrayList<Object>(Arrays.asList(names));
        Exercise3.checkPalindrome(aList);
        System.out.println();

        //3
        String[] name = {"Kyle", "Jenner", "Chris", "Brown", "Jack"};
        Exercise3.exchangeElements(name, 0, 4);
        System.out.println(Arrays.toString(name));
        System.out.println();

        //4
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(Exercise3.largestElement(ints, 3, 8));
    }
}

class Exercise3{

    //1
    public static <N extends Number, U extends Number> double sumNum(N n, U u){
        return n.doubleValue() + u.doubleValue();
    }

    //2

    public static <T> void checkPalindrome(List<T> tNames){
        String names = "";

        for (T elem : tNames) {
            if (elem.toString().equals(reverse(elem.toString())));{
                System.out.println(elem.toString() + " is a palindrome");
            }
        }
    }

    //3
    public static <N> void exchangeElements(N[] arrayString, int i, int j){
        N element = arrayString[i];
        arrayString[i] = arrayString[j];
        arrayString[j] = element;
    }

    //4

    public static <T extends Object & Comparable<? super T >> T largestElement(List<? extends T> list, int begin, int end){
        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin) {
            if (maxElem.compareTo(list.get(begin)) < 0) maxElem = list.get(begin);
        }
        return maxElem;
    }
}