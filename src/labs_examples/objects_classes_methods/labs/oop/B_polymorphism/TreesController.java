package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class TreesController {
    public static void main(String[] args) {
        WhislingPine whislingPine = new WhislingPine(60, 50);
        Pine pine = new Pine(80, 50);


        System.out.println("Pine:");
        pine.typeOfLeaves();
        pine.height();
        pine.hasLeaves();
        pine.age();
        System.out.println("Whistling Pine");
        whislingPine.typeOfLeaves();
        whislingPine.height();
        whislingPine.age();
    }
}
