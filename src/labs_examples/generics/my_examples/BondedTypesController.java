package labs_examples.generics.my_examples;

public class BondedTypesController <T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());

    }

    public <U extends Number> double square(U u){
        return u.doubleValue() * u.doubleValue();
    }

    public static void main(String[] args) {
        BondedTypesController<Integer> integer = new BondedTypesController<>();
        integer.setT(new Integer(10));
        integer.inspect(20);
        System.out.println(integer.square(20));
    }
}
