package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Example2{
    public static void main(String[] args) throws IOException{
        String readFile = "src/labs_examples/input_output/labs/example2_data.txt";
        String writeFile = "src/labs_examples/input_output/labs/example2_data_write.txt";
        int eachChar = 0;

        BufferedReader br = new BufferedReader(new FileReader(readFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(writeFile));

        while ((eachChar = br.read()) != -1){
            bw.write(eachChar);
        }

        br.close();
        bw.close();

    }
}

