package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 1: File input/output
 *
 *      Using the BufferedInputStream, read a text file 5 bytes at a time and write each byte to a new file.
 *      Make sure you close the connections to both files.
 *
 *
 */

class Example {
    public static void main(String[] args) {
        String readPath = "src/labs_examples/input_output/labs/example1_data.txt";
        String writePath = "src/labs_examples/input_output/labs/example1_write_data2.txt";
        int bytesRead = 0;
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(readPath));
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(writePath));

            byte[] charsBuffered = new byte[5];
            while ((bytesRead = bufferedInputStream.read(charsBuffered)) != -1){
                bufferedOutputStream.write(bytesRead);
            }
        } catch (IOException exc){
            System.out.println("I/O Error");
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                    bufferedInputStream.close();
                }
            } catch (IOException exc){
                System.out.println("Error closing the file");
            } try {
                if (outputStream != null) {
                    outputStream.close();
                    bufferedOutputStream.close();
                }
            } catch (IOException exc){
                System.out.println("Error closing the file");
            }
        }

    }
}