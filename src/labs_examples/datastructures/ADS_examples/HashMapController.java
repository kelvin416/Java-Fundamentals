package labs_examples.datastructures.ADS_examples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapController {
    public static void main(String[] args) {
        //creating a Hashmap which stores the users objects

        HashMap<String, User> userHashMap = new HashMap<>();

        User kelvin = new User("Kelvin", "Rotich", "kelvin@gmai.com", 27);
        User ryan = new User("Ryan", "Desmond", "ryan@codingnomads.co", 28);
        User kim = new User("Kim", "Desmond", "kim@codingnomads.co", 30);
        User martin = new User("Martin", "Breuss", "martin@codingnomads.co", 40);
        User caden = new User("Caden", "Mackenzie", "caden@codingnomads.co", 55);

        userHashMap.put(kelvin.getEmail(), kelvin);
        userHashMap.put(ryan.getEmail(), ryan);
        userHashMap.put(kim.getEmail(), kim);
        userHashMap.put(martin.getEmail(), martin);
        userHashMap.put(caden.getEmail(), caden);

        User gettingExe = userHashMap.get("kelvin@gmai.com");
//        System.out.println(gettingExe.toString());

        Set entries = userHashMap.entrySet();
        Iterator iterator = entries.iterator();

        //looping through the entries
        while (iterator.hasNext()){
            Map.Entry user = (Map.Entry)iterator.next();
            System.out.println("The key is: " + user.getKey() + " and the value is: " + user.getValue().toString());
        }
    }
}

class User{
    private String firstName;
    private String lastName;
    private String email;
    private int age;

    public User(String firstName, String lastName, String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
