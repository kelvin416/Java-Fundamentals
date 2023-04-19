package labs_examples.arrays.examples;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();// no length needed because array list are dynamic.

        arrayList.add("Hello");
        arrayList.add("World");
        arrayList.add("I");
        arrayList.add("Love");
        arrayList.add("Programming");
        arrayList.add("In");
        arrayList.add("Java");

        //System.out.println(arrayList.size());
        // Array list is mostly used more than Arrays because its dynamic. When you add values to an array its size increases
        // to accommodate the added values.

        for (String array : arrayList) {
            System.out.println(array);
        }

        ArrayList<String> add = new ArrayList<>(10);
        add.add("Ana");

        add.add("Bob");
        add.add("Cathy");
        add.add(0, "Eric");// the add method add the name eric to the top of the array push the other arrays.
        // thus the indexes of the other names changes.

        for (String i : add) {
            System.out.println(i);
        }
    }
}
