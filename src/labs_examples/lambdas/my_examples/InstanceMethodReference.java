package labs_examples.lambdas.my_examples;

import java.util.Arrays;

@FunctionalInterface
interface MyInterface{
    void display();
}

public class InstanceMethodReference {
    public void myMethod(){
        System.out.println("Instance Method.");
    }

    public static void main(String[] args) {
        InstanceMethodReference obj = new InstanceMethodReference();
        MyInterface ref = obj :: myMethod;
        ref.display();
    }
}

class ArbitraryObjectExe{
    public static void main(String[] args) {
        String [] names = {"Kelvin", "Cain", "Abel", "Lisa", "Marry"};

        Arrays.sort(names, String :: compareToIgnoreCase);
        for (String name : names) {
            System.out.println(name);
        }
     }
}
