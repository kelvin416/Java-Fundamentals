package labs_examples.encapsulation.animals;

public class Dog {
    //Encapsulation -->  all data and methods that act on this data will be encapsulated here within this class

    // Access modifiers are the next level of encapsulation
    private String breed;
    private String name;
    private int age;

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
