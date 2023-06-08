package labs_examples.generics.my_examples;

public class GenericsController {
    public static void main(String[] args) {
        GenericsClass<String> obj1 = new GenericsClass<>();
        obj1.setVal("This is a generic string");
        String string1 = obj1.getVal();
        System.out.println(string1);

        GenericsClass<Integer> obj2 = new GenericsClass<>();
        obj2.setVal(1996);
        int int1 = obj2.getVal();
        System.out.println(int1);
    }
}

class GenericsClass <T> {
    private T val;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}
