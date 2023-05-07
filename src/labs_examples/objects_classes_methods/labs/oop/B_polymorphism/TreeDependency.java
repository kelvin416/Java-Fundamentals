package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class TreeDependency {
    Trees trees;

    public TreeDependency(Trees trees) {
        this.trees = trees;
    }

    public void treeMethod(){
        trees.height();
        trees.age();
        System.out.println("------------------");
    }

    public Trees getTrees() {
        return trees;
    }

    public void setTrees(Trees trees) {
        this.trees = trees;
    }
}
