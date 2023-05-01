package labs_examples.classes;

public class ObjectComposition {
    public static void main(String[] args) {
        VehicleEngine engine = new VehicleEngine("V8-Engine");
        VehicleStereo stereo = new VehicleStereo("Bass");
        MyCar myCar = new MyCar(engine, stereo, "Blue", "Toyota Tx");

        System.out.println(myCar.color);
    }
}
