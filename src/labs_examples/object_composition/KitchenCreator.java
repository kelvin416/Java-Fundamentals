package labs_examples.object_composition;

public class KitchenCreator {
    public static void main(String[] args) {
        //The below objects are POJOs.
        Sink sink = new Sink(true, "Sawa", "Cyremic");
        Fridge fridge = new Fridge(true, "LG", 100);
        Oven oven = new Oven(false, "Ramtoms", 800);
        Dishwasher dishwasher = new Dishwasher(true, "LG", 4);
        Kitchen myKitchen = new Kitchen(sink, fridge, oven, dishwasher);

//        System.out.println("My kitchen contains a fridge " + myKitchen.getFridge().getBrand());
        System.out.println(myKitchen.toString());
    }
}
