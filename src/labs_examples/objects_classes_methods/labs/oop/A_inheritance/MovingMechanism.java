package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

class Controller{
    public static void main(String[] args) {
        Car car = new Car("Shelby", "Benz", "V4-Engines", "Bass-TEchnologies",
                "sedan", "model-X", 50, 4);
        car.engines();

        System.out.println(car.toString());

        Vehicle vehicle = new Vehicle();
        vehicle.engines();
    }
}

class MovingMechanism {
    // The Instance Variables
    String company;

    public MovingMechanism(){}

    public MovingMechanism(String company) {
        this.company = company;
    }
}
class AutoMotiveIndustry extends MovingMechanism{
    String enginesFrom;
    String engineTypes;

    public AutoMotiveIndustry(){}

    public AutoMotiveIndustry(String company, String enginesFrom, String engineTypes) {
        super(company);
        this.enginesFrom = enginesFrom;
        this.engineTypes = engineTypes;
    }

    public void engines(){
        System.out.println("System type is V4 engines");
    }
}
class AutoMobileEngineering extends AutoMotiveIndustry{
    String electronicsBy;
    public AutoMobileEngineering(){}

    public AutoMobileEngineering(String company, String enginesFrom, String engineTypes, String electronicsBy) {
        super(company, enginesFrom, engineTypes);
        this.electronicsBy = electronicsBy;
    }
    @Override
    public void engines(){
        System.out.println("Systems type is V6 engines for more speed");
    }
}
class Vehicle extends AutoMobileEngineering{
    String typeOfVehicle;
    String model;
    public Vehicle(){}

    public Vehicle(String company, String enginesFrom, String engineTypes, String electronicsBy, String typeOfVehicle, String model) {
        super(company, enginesFrom, engineTypes, electronicsBy);
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
    }
}
class Car extends Vehicle{
    double fuelCapacity;
    int wheels;
    public Car(){}
    public Car(String company, String enginesFrom, String engineTypes, String electronicsBy, String typeOfVehicle, String model, double fuelCapacity, int wheels) {
        super(company, enginesFrom, engineTypes, electronicsBy, typeOfVehicle, model);
        this.fuelCapacity = fuelCapacity;
        this.wheels = wheels;
    }

    @Override
    public void engines(){
        System.out.println("System type is V8 engine because of its weight and capacity to carry");
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuelCapacity=" + fuelCapacity +
                ", wheels=" + wheels +
                ", typeOfVehicle='" + typeOfVehicle + '\'' +
                ", model='" + model + '\'' +
                ", electronicsBy='" + electronicsBy + '\'' +
                ", enginesFrom='" + enginesFrom + '\'' +
                ", engineTypes='" + engineTypes + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
