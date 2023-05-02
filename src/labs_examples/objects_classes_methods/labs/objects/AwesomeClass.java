package labs_examples.objects_classes_methods.labs.objects;

// Exercise 03
class AwesomeController {
    public static void main(String[] args) {
        AwesomeVehicle vehicle = new AwesomeVehicle("Lexus", "Toyota", 100000);
        AwesomePerson person = new AwesomePerson("Kelvin", true);

        System.out.println(person.carOwner + " is " + person.isLicencedDriver + " who owns a " + vehicle.carName +
                " from "+ vehicle.carBrand + " at the price of "+ vehicle.price  + " $.");

    }

}

class AwesomeVehicle{
    String carName;
    String carBrand;
    int price;

    public AwesomeVehicle(String carName, String carBrand, int price) {
        this.carName = carName;
        this.carBrand = carBrand;
        this.price = price;
    }
}

class AwesomePerson{
    String carOwner;
    boolean isLicencedDriver;

    public AwesomePerson(String carOwner, boolean isLicencedDriver) {
        this.carOwner = carOwner;
        this.isLicencedDriver = isLicencedDriver;
    }
}

