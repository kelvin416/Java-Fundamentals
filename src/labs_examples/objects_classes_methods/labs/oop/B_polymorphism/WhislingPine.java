package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class WhislingPine implements Trees{
    int growthInHeight;
    int maxAge;

    public WhislingPine() {}

    public WhislingPine(int growthInHeight, int maxAge) {
        this.growthInHeight = growthInHeight;
        this.maxAge = maxAge;
    }

    @Override
    public boolean hasLeaves() {
        System.out.println("This tree has leaves");
        return true;
    }

    @Override
    public void typeOfLeaves() {
        System.out.println("Rings of Scales like");
    }

    @Override
    public void height() {
        System.out.println("Grows upto 30 m");
    }

    @Override
    public void age() {
        System.out.println("Matures in 20 years lives upto 50 years");
    }
}
