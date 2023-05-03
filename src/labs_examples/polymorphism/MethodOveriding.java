package labs_examples.polymorphism;

class MethodOverriding {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(220, 60, "Jeep-Car");
        Vehicle moto = new Motorcycle(80, 20, "BMW-Bike");

        vehicle.start();
        moto.start();

        System.out.println(vehicle.toString());
        System.out.println(moto.toString());

    }
}

class Vehicle{
    int kpl;
    int fuelCapacity;
    String type;

    public Vehicle(int kpl, int fuelCapacity, String type) {
        this.kpl = kpl;
        this.fuelCapacity = fuelCapacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "kpl=" + kpl +
                ", fuelCapacity=" + fuelCapacity +
                ", type='" + type + '\'' +
                '}';
    }

    public void start(){
        System.out.println("Start Engine using push to start ignition.");
    }
}
class Motorcycle extends Vehicle{

    public Motorcycle(int kpl, int fuelCapacity, String type){
        super(kpl, fuelCapacity, type);
    }

    @Override
    public void start(){
        System.out.println("The motorbike is started using  kick method");
    }

}
