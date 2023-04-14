package labs_examples.fundamentals.examples.variables;

public class Person {
    // String name and int age are instance variables
    String name;
    int age;
    //static int is a static variable, it is a variable that all objects in that memory will have access to,
    // therefore all the objects will show the same value.
    static int numPersonsCreated;


    public Person(String name, int age){
        this.name = name;
        this.age = age;
        numPersonsCreated++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", numPersonCreated=" + numPersonsCreated +
                '}';
    }
}
