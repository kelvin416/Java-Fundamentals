package labs_examples.packages.labs.animals;

//here the Cars class needs to be imported before its used in this package
import labs_examples.packages.labs.cars.Cars;

public class Animals {
    public static void main(String[] args) {
        Cars cars = new Cars();
        // I can only access the public accelerate method and not a protected start() method from the Car class in a different package.
//        cars.start();
        cars.accelerate();
    }
    String name;


    protected void speak(){
        System.out.println("Animal talks");
    }

    public void run(){
        System.out.println("Animal runs.");
    }

}
