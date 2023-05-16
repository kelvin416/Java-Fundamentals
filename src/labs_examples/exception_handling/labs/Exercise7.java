package labs_examples.exception_handling.labs;

class Exercise7 {
    public static void main(String[] args) {
        try {
            Vehicle vehicle = new Vehicle();
            formula1(vehicle.name);
        } catch (VehicleException exc1){
            System.out.println("This is not a f1 Vehicle");
        }
    }

    public static void formula1(String name) throws VehicleException {
        formula2("F1");
    }

    public static void formula2(String name) throws VehicleException{
        if (name == "F2"){
            throw new VehicleException();
        }
    }
}

class VehicleException extends Exception{
    @Override
    public String toString() {
        return "This is not an F1 car.";
    }
}

class Vehicle{
    public String name = "";
}
