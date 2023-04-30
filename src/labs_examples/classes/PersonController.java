package labs_examples.classes;

public class PersonController {
    public static void main(String[] args) {
        Person somePerson = new Person(33, 80, "Blues");// We have created a person object.
        Person secondPerson = new Person(20, 100, "Stacy");
//        somePerson.name = "kelvin";
//        somePerson.age = 36;
//        somePerson.height = 77;
//
//        secondPerson.height = 200;
//        secondPerson.age = 21;
//        secondPerson.name = "Wonderful";

        System.out.println("The first person is " + somePerson.name + " and is " + somePerson.age + " years old and " +
                somePerson.height + "cm tall.");
        System.out.println("The first person is " + secondPerson.name + " and is " + secondPerson.age + " years old and " +
                secondPerson.height + "cm tall.");
    }
}
