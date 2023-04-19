package labs_examples.arrays.examples;

public class ArrayExample {
    public static void main(String[] args) {
        int[] intArray = new int[5];

//        intArray[0] = 88;
//        intArray[1] = 8;
//        intArray[2] = 80;
//        intArray[3] = 20;
//        intArray[4] = 24;

        System.out.println("The length of the array is " + intArray.length);

        for (int i = 0; i < intArray.length; i++){
            // population of each index of the array with the value of "i".
            intArray[i] = i;
        }

        //for each int in intArray
        for (int i : intArray) {
            System.out.print(i);
        }

        char[] letters = {'k', 'd', 'm', 'i', 'e', 'f', 'g', 'h'};
        System.out.println(letters[letters.length - 1]);
    }
}
