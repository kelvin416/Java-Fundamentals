package labs_examples.static_nonstatic.labs;

public class ClassA {

    //Ex1
    public static void methodA1(){
        System.out.println("This print message is for MethodA1");
    }

    public static void methodA2(){
        //methodA2 can call methodA1 directly because they are in the same class
        methodA1();

    }

    //Ex2
    public static void methodA3(){
        // methodA2 can call methodA3 through a reference of an object.
        ClassA obj = new ClassA();
        obj.methodA4();
    }
    public void methodA4(){
        // this is a non-static method
    }

    //Ex3
    public static void methodA5(){
        //to call another static method in another class. We just use the class name with the dot notation.
        ClassB.methodB1();
    }

    //Ex4
    public static void methodA6(){
        // to call another non-static method in another class we create an object
        ClassB obj = new ClassB();
        obj.methodB2();
    }

    //Ex5
    public void methodA7(){
        //A non static method can call another non static method directly.
        methodA8();
    }
    public void methodA8(){
        System.out.println("We are non-static and in the same class");
    }

    //Ex6
    public void methodA9(){
        // to call another non static method, we need to create an object first.
        ClassB obj = new ClassB();
        obj.methodB3();
    }

    //Ex7
    public void methodA10(){
        // To call a static method in the same class we just need to invoke the method name.
        methodA11();
    }
    public static void methodA11(){
        System.out.println("static methods are also awesome.");
    }

    //Ex8
    public void methodA12(){
        //A non static method to call a static method in another class, you just have to start with class name
        // then dot notation followed by method name
        ClassB.methodB4();
    }
}
