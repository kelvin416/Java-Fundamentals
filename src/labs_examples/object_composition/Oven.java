package labs_examples.object_composition;

public class Oven {

    private boolean isGassefficient;
    private String brand;
    private int maxTemp;

    public Oven(boolean isGassefficient, String brand, int maxTemp) {
        this.isGassefficient = isGassefficient;
        this.brand = brand;
        this.maxTemp = maxTemp;
    }

    public boolean isGassefficient() {
        return isGassefficient;
    }

    public void setGassefficient(boolean gassefficient) {
        isGassefficient = gassefficient;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public String toString() {
        return "Oven{" +
                "isGassefficient=" + isGassefficient +
                ", brand='" + brand + '\'' +
                ", maxTemp=" + maxTemp +
                '}';
    }
}
