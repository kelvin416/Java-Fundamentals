package labs_examples.classes;

public class ObjectAssociation {
    public static void main(String[] args) {
        //This method will bring together two classes
        PersonAssociation person = new PersonAssociation("Kimutai");
        VehicleAssociation vehicle = new VehicleAssociation("Jeep");

        System.out.println(person + " drives a " + vehicle + " kind of car");
    }
}

