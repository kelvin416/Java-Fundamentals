package labs_examples.fundamentals.labs.variables;

public class Variables {
    //int z is a global variable and can be used anywhere within the same class.
    static int z = 99;
    public static void main(String[] args) {

        Person person1 = new Person("Kelvin", 26);
        Person person2 = new Person("John", 78);
        Person person3 = new Person("Milly", 19);

        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());

//        int x = multiply(z, z);
    }
    //in the method multiply, int a and int b are method parameters.
    public static int multiply(int a, int b){
        // in a and b are declared as local variables only accessible within the closest opening and closing curly braces.
        int result = a * b;
        printNum(result);
        return result;
    }
    public static void printNum(int numToPrint){
        System.out.println(numToPrint);
        System.out.println(z);
    }
}
