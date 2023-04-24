package labs_examples.methods.pass_by_reference;

import labs_examples.classes.Person;

public class passByReference {
    public static void main(String[] args) {
        Person kelvin = new Person(45, 88, "Kelvin");
        System.out.println(kelvin.toString());

        addYearToPerson(kelvin);

        System.out.println(kelvin.toString());
    }

    public static void addYearToPerson(Person person){
        person.age = 30;
    }
}
