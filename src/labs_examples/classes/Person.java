package labs_examples.classes;

public class Person {
    //instance variables
    // any objects created will get their own copy of the instance variables from this class
    public int age;
    public double height;
    public String name;

    public Person(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    //Constructors
    //..


    //Methods
    // ...


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
