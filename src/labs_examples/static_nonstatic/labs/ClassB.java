package labs_examples.static_nonstatic.labs;

public class ClassB {
    //Ex3
    public static void methodB1(){
        System.out.println("Static methods are very awesome.");
    }

    //Ex4
    public void methodB2(){
        System.out.println("Non-static methods are also awesome.");
    }

    //Ex6
    public void methodB3(){
        System.out.println("Non-static methods being called in another class.");
    }

    //Ex8
    public static void methodB4(){
        System.out.println("To be called from a non static method.");
    }
}
