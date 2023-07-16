package labs_examples.lambdas.labs;

import java.util.function.BiFunction;

/**
 * Lambdas Exercise 3:
 *
 *      1) Demonstrate the use of a static method reference
 *      2) Demonstrate the use of an instance method reference
 *      3) Demonstrate the use of a constructor reference
 *
 */

//1
class MethodReference {
    public static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> fruitDivision = MethodReference::divide;
        int oranges = fruitDivision.apply(30, 20);
        System.out.println("If you divide 30 fruits equally between 20 students you get a remainder of: " + oranges + " oranges");
    }
}

//2

class InstanceReference {
    public int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addition = new InstanceReference()::add;
        int result = addition.apply(20, 89);
        System.out.println("The result of the addition is: " + result);
    }
}

//3
interface CreateUser{
    Customer createCustomer(String firstName, String lastName);
}

class ConstructorReference{
    public static void main(String[] args) {
        CreateUser createUser = Customer :: new;
        Customer kelvin = createUser.createCustomer("Kelvin", "Rotich");
        System.out.println(kelvin.toString());
    }
}

class Customer{
    String firstName;
    String lastName;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}