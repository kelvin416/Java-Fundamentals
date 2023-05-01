package labs_examples.classes;

public class MyCar {
    VehicleEngine engine;
    VehicleStereo stereo;
    String color;
    String model;

    public  MyCar(VehicleEngine engine, VehicleStereo stereo, String color, String model){
        this.engine = engine;
        this.stereo = stereo;
        this.color = color;
        this.model = model;
    }
}
