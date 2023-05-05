package labs_examples.oop_inheritance;

public class Truck extends Vehicle {
    protected int bedCapacity;

    public Truck(String make, String type, double fuelCapacity, double weight, int bedCapacity) {
        super(make, type, fuelCapacity, weight);
        this.bedCapacity = bedCapacity;
    }

    public int getBedCapacity() {
        return bedCapacity;
    }

    public void setBedCapacity(int bedCapacity) {
        this.bedCapacity = bedCapacity;
    }
}
