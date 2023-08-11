package labs_examples.datastructures.queue.labs;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *      Demonstrate your mastery of Java's (sun's) built-in Queue class (as seen in the import statement
 *      above) by completing the following:
 *
 *      1) instantiate a new Queue
 *      2) demonstrate the use of EVERY method in the Queue class - there are 7
 */

class QueueController{
    public static void main(String[] args) {
        Queue<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("Python");
        languages.add("GoLang");
        languages.add("Ruby");
        languages.add("PHP");

        System.out.println("The first language to learn is: " + languages.peek());

        String element = languages.element();
        System.out.println("Element is: " + element);

        String removeElement = languages.remove();
        System.out.println("Element that has been removed is: " + removeElement);

        System.out.println("Current available languages: " +languages);

        String pollElement = languages.poll();
        System.out.println(pollElement);
        System.out.println("Available languages after poll method: " + languages);

        languages.offer("CSS");
        System.out.println("Languages after additional add: " + languages);

        System.out.println("The number of languages to be studied is: " + languages.size());

    }
}
