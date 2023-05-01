package labs_examples.object_composition;

public class Sink {

    private boolean isDualSink;
    private String brand;
    private String basinType;

    public Sink(boolean isDualSink, String brand, String basinType){
        this.isDualSink = isDualSink;
        this.brand = brand;
        this.basinType = basinType;
    }

    public boolean isDualSink() {
        return isDualSink;
    }
    public void setDualSink(boolean isDualSink){
        this.isDualSink = isDualSink;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBasinType (){
        return basinType;
    }
    public void setBasinType(String basinType){
        this.basinType = basinType;
    }

    @Override
    public String toString() {
        return "Sink{" +
                "isDualSink=" + isDualSink +
                ", brand='" + brand + '\'' +
                ", basinType='" + basinType + '\'' +
                '}';
    }
}
