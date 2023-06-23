package labs_examples.lambdas.labs;

/**
 * Lambdas Exercise 1:
 *
 *      1) Demonstrate creating a functional interface with an abstract method that takes no parameters and returns void
 *      2) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      3) Demonstrate creating a functional interface with an abstract method that takes 1 parameter and returns a
 *          value of the same type as the parameter
 *      4) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      5) Demonstrate creating a functional interface with an abstract method that takes 2 parameters and returns a
 *          value
 *      6) Implement the previous functional interface with a lambda expression and use it. Also demonstrate creating
 *          an anonymous inner class from this interface.
 *
 *      7) Demonstrate the use of at least two built-in functional interfaces from the java.util.function package.
 *
 *
 *
 *
 */
@FunctionalInterface
public interface Exercise_01 {
    //1 functional interface with an abstract method returning a void.
    public void greetings();
}

class Exercise_01_Class{
    public static void main(String[] args) {
        //Implementing a lambda expression in Exercise_01 interface
        Exercise_01 lambdaGreet = () -> System.out.println("Hello There. I am lambda interface");
        lambdaGreet.greetings();
        // Implementing anonymous inner class in Exercise_01 interface.
        Exercise_01 anonGreet = new Exercise_01() {
            @Override
            public void greetings() {
                System.out.println("Hello there. I am anonymous inner class");
            }
        };
        anonGreet.greetings();
    }
}