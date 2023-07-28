package labs_examples.datastructures.ADS_examples;

import labs_examples.classes.Person;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExamples {
    public static void main(String[] args) {
        LinkedList<String> words = new LinkedList<>();

        words.add("Are");
        words.add("Cool!");

        //push elements onto the top(front) of the list
        words.push("Linked");
        words.push("Lists");
        System.out.print(words.pop() + " ");
        System.out.print(words.pop() + " ");

        //get elements by Index
        System.out.print(words.get(0) + " ");
        System.out.print(words.get(1) + "\n\n");

        //remove elements by index
        words.remove(0);
        words.remove(0);

        words.add("Java's ");
        words.add("LinkedList");
        words.add(" class ");
        words.add("has many additional methods ");
        words.add("we can use ");
        words.add("which almost make it appear as an ArrayList ");
        words.add("but behind the scenes the data structure being ");
        words.add("used ");
        words.add("is a ");
        words.add("LinkedList");

        //iterate through the list forwards
        Iterator iterator = words.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
        System.out.println();
        iterator = words.descendingIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //check to see if the list contains the word "LinkedList"
        boolean hashWord = words.contains("LinkedList");
        System.out.println("\n\nList contains \"LinkedList\" is " + hashWord);

        // get the first index of the word "LinkedList"
        int first = words.indexOf("LinkedList");
        System.out.println("\nThe first index of the word \"LinkedList\" is " + first);


        // get the last index of the word "LinkedList"
        int last = words.lastIndexOf("LinkedList");
        System.out.println("\nThe last index of the word \"LinkedList\" is " + last);


        // clear the list (remove all elements)
        words.clear();

    }
}

