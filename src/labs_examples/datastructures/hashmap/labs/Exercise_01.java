package labs_examples.datastructures.hashmap.labs;

import java.util.HashMap;
import java.util.Map;

/**
 *  HashMaps Exercise_01
 *
 *  Demonstrate your mastery of using Java's built-in HashMap class below.
 *
 *  Using a HashMap demonstrate the use of the following methods:
 *
 *  put()
 *  get()
 *  putAll()
 *  size()
 *  contains()
 *  keySet()
 *  entrySet()
 *  putIfAbsent()
 *  remove()
 *  replace()
 *  forEach()
 *  clear()
 *
 */

class HashMapController {
    public static void main(String[] args) {

        HashMap<String, Integer> peopleMap = new HashMap<>();
        HashMap<String, Integer> peopleMap2 = new HashMap<>();
        //put method
        peopleMap.put("Kelvin", 27);
        peopleMap.put("Beva", 22);
        peopleMap.put("John", 40);
        peopleMap.put("Alfred", 55);

        //get method
        String value1 = String.valueOf(peopleMap.get("Kelvin"));
        System.out.println("Kelvin is key and value is: " + value1);
        String value2 = String.valueOf(peopleMap.get("Beva"));
        System.out.println("Beva is key and value is: " + value2);
        String value3 = String.valueOf(peopleMap.get("John"));
        System.out.println("John is key and value is: " + value3);
        String value4 = String.valueOf(peopleMap.get("Alfred"));
        System.out.println("Alfred is key and value is: " + value4);

        //putAll method
         peopleMap2.putAll(peopleMap);
        System.out.println(peopleMap2);

        //size method
        System.out.println( peopleMap.size());

        //contains method
        System.out.println(peopleMap.containsKey("Kelvin"));

        //keySet method
        System.out.println(peopleMap.keySet());

        //entrySet method
        System.out.println(peopleMap.entrySet());

        //putIfAbsent method
        peopleMap.putIfAbsent("Tracy", 22);
        System.out.println(peopleMap);

        //remove
        peopleMap.remove("John");
        System.out.println(peopleMap);

        //replace
        peopleMap.replace("Tracy", 24);
        System.out.println(peopleMap);

        //forEach
        for (Map.Entry<String, Integer> entry : peopleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " and value is: " + entry.getValue());
        }

        //clear

        peopleMap.clear();
        System.out.println(peopleMap);



    }
}
