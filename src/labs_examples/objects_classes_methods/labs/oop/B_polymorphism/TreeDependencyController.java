package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class TreeDependencyController {
    public static void main(String[] args) {
        WhislingPine whislingPine = new WhislingPine(60, 50);
        Pine pine = new Pine(80, 50);

        TreeDependency dependency = new TreeDependency(pine);
        dependency.treeMethod();
        dependency.setTrees(pine);

        dependency.treeMethod();
        dependency.setTrees(whislingPine);
    }
}
