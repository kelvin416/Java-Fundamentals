package labs_examples.object_composition;

public class Fridge {

    private boolean isDoubleWide;
    private String brand;
    private int volume;

    public Fridge(boolean isDoubleWide, String brand, int volume) {
        this.isDoubleWide = isDoubleWide;
        this.brand = brand;
        this.volume = volume;
    }

    public boolean isDoubleWide() {
        return isDoubleWide;
    }

    public void setDoubleWide(boolean doubleWide) {
        isDoubleWide = doubleWide;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Fridge{" +
                "isDoubleWide=" + isDoubleWide +
                ", brand='" + brand + '\'' +
                ", volume=" + volume +
                '}';
    }
}
