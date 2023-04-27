package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
        int multiply = multiply(10, 33);
        int division = divide(44, 22);
        int varArgs = length("Kelvin", "Jessica", "Paul", "Cynthia");
        int numOfYears = 3;
        long seconds = time(numOfYears);

        System.out.println("The result for multiplication is: " + multiply);
        System.out.println("The result for division is: " + division);
        joke();
        System.out.println("The length of the varArgs is: " + varArgs);
        System.out.println("There is: " + seconds + " seconds in " + numOfYears + " years");

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
    static int multiply(int a, int b){
        int result = a * b;
        return result;
    }


    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
    static int divide(int a, int b){
        int result = a / b;
        return result;
    }


    // 3) Create a static void method that will print of joke of your choice to the console
    static void joke(){
        System.out.print("What has four wheels and flies?");
        System.out.println(" A garbage truck.");
    }


    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    static int time(int years){
        int seconds = 365 * 24 * 60 * 60;
        int time = 0;

        if (years != 1){
            for (int i = 0; i < years; i++){
                time += seconds;
            }
        } else {
            time = seconds;
        }
        return time;


    }


    // 5) Create a varargs method that will return the length of the varargs array passed in

    static int length(String... args){
        int count = 0;
        for (String i : args) {
            count++;
        }
        return count;
    }






}
