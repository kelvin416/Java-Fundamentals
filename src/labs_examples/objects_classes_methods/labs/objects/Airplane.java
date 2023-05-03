package labs_examples.objects_classes_methods.labs.objects;
//Exercise 01, 02

class AirplaneController {
    public static void main(String[] args) {
        LandingGear landingGear = new LandingGear(4, true, "GoodYear");
        Wing wing = new Wing("Dihedral Wing Configuration", 130);
        Cockpit cockpit = new Cockpit("Tesla", 7, true);
        EngineSystem engineSystem = new EngineSystem(4, "Aston Martin");
        Airplane airplane = new Airplane(landingGear, cockpit, engineSystem, wing, 2002, 1000);

        System.out.println("The airplane decribed above has an engine system from " + airplane.engineSystem.getEngineCreators() +
                " and have a cabin crew of " + airplane.cockpit.getCockpitCapacity() + " members available.");
        System.out.println(airplane.toString());
    }
}
class Airplane {
    LandingGear landingGear;
    Cockpit cockpit;
    EngineSystem engineSystem;
    Wing wing;
    double fuelCapacity;
    double currentFuelLevel;

    public Airplane(LandingGear landingGear, Cockpit cockpit, EngineSystem engineSystem, Wing wing, double fuelCapacity, double currentFuelLevel){
        this.landingGear = landingGear;
        this.cockpit = cockpit;
        this.engineSystem = engineSystem;
        this.wing = wing;
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }

    public LandingGear getLandingGear() {
        return landingGear;
    }
    public void setLandingGear(LandingGear landingGear) {
        this.landingGear = landingGear;
    }

    public Cockpit getCockpit() {
        return cockpit;
    }
    public void setCockpit(Cockpit cockpit) {
        this.cockpit = cockpit;
    }

    public EngineSystem getEngineSystem() {
        return engineSystem;
    }
    public void setEngineSystem(EngineSystem engineSystem) {
        this.engineSystem = engineSystem;
    }

    public Wing getWing() {
        return wing;
    }
    public void setWing(Wing wing) {
        this.wing = wing;
    }

    public double getFuelCapacity() {
        return fuelCapacity;
    }
    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }
    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "landingGear:" + landingGear +
                ", \ncockpit:" + cockpit +
                ", \nengineSystem:" + engineSystem +
                ", \nwing:" + wing +
                ", \nfuelCapacity:" + fuelCapacity +
                ", \ncurrentFuelLevel:" + currentFuelLevel +
                '}';
    }
}
class LandingGear{
    private int wheelCount;
    private boolean isThreaded;
    private String brand;

    public LandingGear(int wheelCount, boolean isThreaded, String brand) {
        this.wheelCount = wheelCount;
        this.isThreaded = isThreaded;
        this.brand = brand;
    }

    public int getWheelCount() {
        return wheelCount;
    }
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public boolean isThreaded() {
        return isThreaded;
    }
    public void setThreaded(boolean threaded) {
        isThreaded = threaded;
    }

    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "\nLandingGear{" +
                "wheelCount=" + wheelCount +
                ", isThreaded=" + isThreaded +
                ", brand='" + brand + '\'' +
                '}';
    }
}
class Cockpit{
    private String deignedBy;
    private int cockpitCapacity;
    private boolean isDigital;

    public Cockpit(String deignedBy, int cockpitCapacity, boolean isDigital){
        this.deignedBy = deignedBy;
        this.cockpitCapacity = cockpitCapacity;
        this.isDigital = isDigital;
    }

    public String getDeignedBy(){
        return deignedBy;
    }
    public void setDeignedBy(String deignedBy){
        this.deignedBy = deignedBy;
    }

    public int getCockpitCapacity(){
        return cockpitCapacity;
    }
    public void setCockpitCapacity(int cockpitCapacity){
        this.cockpitCapacity = cockpitCapacity;
    }

    public boolean isDigital(){
        return isDigital;
    }
    public void setDigital(boolean isDigital){
        this.isDigital = isDigital;
    }

    @Override
    public String toString() {
        return "\nCockpit{" +
                "deignedBy='" + deignedBy + '\'' +
                ", cockpitCapacity=" + cockpitCapacity +
                ", isDigital=" + isDigital +
                '}';
    }
}
class EngineSystem{
    private int numberOfEngines;
    private String engineCreators;

    public EngineSystem(int numberOfEngines, String engineCreators) {
        this.numberOfEngines = numberOfEngines;
        this.engineCreators = engineCreators;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }
    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }

    public String getEngineCreators() {
        return engineCreators;
    }
    public void setEngineCreators(String engineCreators) {
        this.engineCreators = engineCreators;
    }

    @Override
    public String toString() {
        return "\nEngineSystem{" +
                "numberOfEngines=" + numberOfEngines +
                ", engineCreators='" + engineCreators + '\'' +
                '}';
    }
}
class Wing{
    private String wingType;
    private int wingSpan;

    public Wing(String wingType, int wingSpan) {
        this.wingType = wingType;
        this.wingSpan = wingSpan;
    }

    public String getWingType() {
        return wingType;
    }
    public void setWingType(String wingType) {
        this.wingType = wingType;
    }

    public int getWingSpan() {
        return wingSpan;
    }
    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "\nWing{" +
                "wingType='" + wingType + '\'' +
                ", wingSpan=" + wingSpan +
                '}';
    }
}

