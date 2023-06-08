package labs_examples.generics.my_examples;

public class GenericMethodController {
    public static void main(String[] args) {
        // creating generic arrays of Integer, Double and Character

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7};
        Double[] doubleArray = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7, 7.8};
        Character[] charArray = {'A', 'S', 'D', 'F', 'G', 'H', 'J'};

        System.out.println("Array Integer contains");
        GenericMethod1.printArray(intArray);

        System.out.println("Array Double contains");
        GenericMethod1.printArray(doubleArray);
        
        System.out.println("Array Character contains");
        GenericMethod1.printArray(charArray);
    }
}

//non-generic class with a generic method
class GenericMethod1{
    public static <E> void printArray(E[] inputArray){
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
