package labs_examples.javas_contracts_interfaces;

public interface MotorizedVehicle {
    public boolean start();
    public void stop();
    public void accelerate (int kph);
    public void decelerate (int kph);
}

class Vehicle implements MotorizedVehicle{

    @Override
    public boolean start() {
        return false;
    }

    @Override
    public void stop() {

    }

    @Override
    public void accelerate(int kph) {

    }

    @Override
    public void decelerate(int kph) {

    }
}

class InterPhaseExample{
    MotorizedVehicle vehicle;

    public InterPhaseExample(MotorizedVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setVehicle(MotorizedVehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void testVehicle(){
        vehicle.start();
        vehicle.accelerate(80);
        vehicle.decelerate(20);
        vehicle.stop();
    }
}
