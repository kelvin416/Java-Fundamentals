package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class Exercise1 <E, T>{
    private E element;
    private T type;

    public Exercise1() {
    }

    public Exercise1(E element, T type) {
        this.element = element;
        this.type = type;
    }

    public E getElement() {
        return element;
    }
    public void setElement(E element) {
        this.element = element;
    }

    public T getType() {
        return type;
    }
    public void setType(T type) {
        this.type = type;
    }
}

class Exercise1Controller{
    public static void main(String[] args) {
        Exercise1<String, String> car = new Exercise1<>("Mazda", "Demio");
        Exercise1<String, Integer> person = new Exercise1<>("Kelvin", 26);

        System.out.println(car.getElement() + " " + car.getType());
        System.out.println(person.getElement() + " " + person.getType());

//        car.setElement("Mazda");
//        car.setType("Demio");
//        String getCar = car.getElement();
//        String getCarType = car.getType();
//        System.out.println(getCar + " " + getCarType);
//
//        person.setElement("Kelvin");
//        person.setType(27);
//        String personName = person.getElement();
//        int personAge = person.getType();
//        System.out.println(personName + " is " + personAge + " years.");

    }
}

