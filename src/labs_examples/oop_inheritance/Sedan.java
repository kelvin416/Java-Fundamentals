package labs_examples.oop_inheritance;

public class Sedan extends Vehicle {

    protected double seatCapacity;

    public Sedan(String make, String type, double fuelCapacity, double weight, double seatCapacity) {
        super(make, type, fuelCapacity, weight);
        this.seatCapacity = seatCapacity;
    }

    public double getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(double seatCapacity) {
        this.seatCapacity = seatCapacity;
    }
}
