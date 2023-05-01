package labs_examples.object_composition;

public class Kitchen {

    Sink sink;
    Fridge fridge;
    Oven oven;
    Dishwasher dishwasher;

    public Kitchen(Sink sink, Fridge fridge, Oven oven, Dishwasher dishwasher){
        this.sink = sink;
        this.fridge = fridge;
        this.oven = oven;
        this.dishwasher = dishwasher;
    }

    public Sink getSink(){
        return sink;
    }
    public void setSink(Sink sink){
        this.sink = sink;
    }

    public Fridge getFridge(){
        return fridge;
    }
    public void setFridge(Fridge fridge){
        this.fridge = fridge;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "\nsink=" + sink +
                ", \nfridge=" + fridge +
                ", \noven=" + oven +
                ", \ndishwasher=" + dishwasher +
                '}';
    }
}
