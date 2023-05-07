package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class Banana implements EdibleFruits{
    String color;
    int numberOfBanana;
    public Banana(){}

    public Banana(String color, int numberOfBanana) {
        this.color = color;
        this.numberOfBanana = numberOfBanana;
    }

    @Override
    public boolean isEdible() {
        System.out.println("Purchasing Banana");
        return true;
    }
    @Override
    public void eat() {
        System.out.println("Starting to eat");
    }
    @Override
    public void amountOf(int amount) {
        System.out.println(4);
    }
    @Override
    public void priceOf(double price) {
        System.out.println(40);
    }
}
