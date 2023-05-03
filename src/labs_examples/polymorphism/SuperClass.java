package labs_examples.polymorphism;

class RunClasses{
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.someOtherMessage();
    }
}
class SuperClass {
    public void printMessage(){
        System.out.println("This is a message from superclass");
    }
}
class SubClass extends SuperClass{
    @Override
    public void printMessage(){
        System.out.println("This is a message from subclass");
    }

    public void someOtherMessage(){
        super.printMessage();
        this.printMessage();
    }

}
