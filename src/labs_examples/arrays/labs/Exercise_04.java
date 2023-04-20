package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {
    public static void main(String[] args) {
        String[][] irregulaArray= {
                {"Blue", "Subaru"},
                {"Arrays", "Are", "Very", "Fun"},
                {"To", "Work", "With"}
        };

        for (String[] outer : irregulaArray) {
            for (String inner : outer) {
                System.out.print(inner + "  ");
            }
            System.out.println();
        }
    }

}
