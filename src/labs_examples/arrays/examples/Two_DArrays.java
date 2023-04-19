package labs_examples.arrays.examples;

public class Two_DArrays {
    public static void main(String[] args) {
        // declare a two-dimensional array,
        // Nested loops to populate every index in the 2-D array.
        // Nested loops to print reach element in the 2-D array.

        int[][] twoDArray = new int[4][5];
        int populate = 0;
        int i;
        int x;

        for (i = 0; i < twoDArray.length; i++){
            for ( x = 0; x < twoDArray[i].length; x++){
                twoDArray[i][x] = populate;
                populate++;
            }
        }
        for (i = 0; i < twoDArray.length; i++){
            for ( x = 0; x < twoDArray[i].length; x++){
                System.out.print(twoDArray[i][x] + " | ");
            }
            System.out.println();
            System.out.println("----------------------------------");
        }
    }
}
