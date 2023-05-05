package labs_examples.oop_inheritance;

public class Vehicle {
    protected String make;
    protected String type;
    protected double fuelCapacity;
    protected double weight;


    public Vehicle(String make, String type, double fuelCapacity, double weight) {
        this.make = make;
        this.type = type;
        this.fuelCapacity = fuelCapacity;
        this.weight = weight;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
