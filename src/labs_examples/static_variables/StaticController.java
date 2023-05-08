package labs_examples.static_variables;

public class StaticController {
    public static void main(String[] args) {
        House house1 = new House(1000, "123 B Street");
        House house2 = new House(4000, "13 C Street");
        House house3 = new House(900, "35 A Street");

        System.out.println(house1.toString());
        System.out.println(house2.toString());
        System.out.println(house3.toString());

        // Static variables are shared by al instances of a class while non-static variables are not shared.
        // every instances / object of the class will get their own copy of non instance variables
        // but share a reference to a single static variable
    }
}
