package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {
        int counter = 1;
        int[][] multiply = new int[5][5];

        for (int i = 0; i < multiply.length; i++){
            for (int j = 0; j < multiply[i].length; j++){
                multiply[i][j] = (counter * 3);
                counter++;
            }
        }
//        for (int i = 0; i < multiply.length; i++){
//            for (int j = 0; j < multiply[i].length; j++){
//                System.out.print(start + " ");
//            }
//            System.out.println();
//        }

        for (int[] x : multiply) {
            for (int z : x) {
                System.out.print(z + " ");
            }
            System.out.println();
        }
        
    }
}
