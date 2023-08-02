package labs_examples.datastructures.linkedlist.labs;

import javafx.print.Collation;

import java.util.*;

public class Exe01LinkedLists {
    public static void main(String[] args) {
        //1
        LinkedList<String> languages = new LinkedList<>();
        //2 add()
        languages.add("Java");
        languages.add("Python");
        languages.add("GoLang");
        languages.add("Ruby");
        languages.add("JS");
        //3 addAll()
        Collection<String> food = Arrays.asList("Apples", "Bananas");
        languages.addAll(food);
        //4 addFirst()
        languages.addFirst("First");
        languages.addFirst("At");

        //5 getFirst()
        System.out.println("The first element in the LinkedList is: " +  languages.getFirst());
        //6 getLast()
        System.out.println("The last element in the LinkedList is: " +  languages.getLast());
        //7 get()
        System.out.println("The third element in the LinkedList is: " +  languages.get(2));
        //8 set()
        System.out.println("The replaced element in the LinkedList is: " +  languages.set(6, "Physics"));
        //9 push()
        languages.push("Codding Nomads");
        //10 pop()
        String s = languages.poll();
        System.out.println(s);
        // 11 remove()
        languages.remove(6);
        //12 contains()
        System.out.println("Does the list contain ' Ruby': " + languages.contains("Ruby"));
        //13 listIterator()
        ListIterator listIterator = languages.listIterator(2);
        while (listIterator.hasNext()){
            System.out.print(listIterator.next());
            System.out.print(" ");
        }
        System.out.println();
        //14 clear()
        System.out.print("Before Clearing The List "  + languages);
        System.out.println();
        languages.clear();
        System.out.print("After Clearing the List " + languages);
    }
}
