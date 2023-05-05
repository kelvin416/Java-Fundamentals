package labs_examples.oop_inheritance;

public class CarController {
    public static void main(String[] args) {
        Truck truck = new Truck("Renault", "1500", 200, 5000, 3);
        Sedan sedan = new Sedan("Honda", "CRV", 60, 1000, 5);

        System.out.println(truck.getMake() + " " + truck.getType() + " " + truck.getWeight());
        System.out.println(sedan.getMake() + " " + sedan.getType() + " " + sedan.getWeight());
    }
}
