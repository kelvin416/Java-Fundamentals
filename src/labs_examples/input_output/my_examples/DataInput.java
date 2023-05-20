package labs_examples.input_output.my_examples;

import java.io.*;

public class DataInput {
    public static void main(String[] args) {
        //Always have to create a filePath
        // first i have to have an file to write the data
//        create a try-with-resource that takes in Data and print it out

        String filePath = "src/labs_examples/input_output/my_examples/RWData2";

        double weight = 67;
        char sign = '@';
        boolean hasCopyright = false;

        try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream(filePath))){
            System.out.println("Writing weight: " + weight + "kgs");
            dataOut.writeDouble(weight);
            System.out.println("Writing sign: " + sign);
            dataOut.writeChar(sign);
            System.out.println("Writing copy right issue: " + hasCopyright);
            dataOut.writeBoolean(hasCopyright);
        } catch (IOException exc){
            System.out.println("Writing Error!");
            return;
        }

        System.out.println();

        try(DataInputStream dataIn = new DataInputStream(new FileInputStream(filePath))){
            weight = dataIn.readDouble();
            System.out.println("Reading weight: " + weight);
            sign = dataIn.readChar();
            System.out.println("Reading sign: " + sign);
            hasCopyright = dataIn.readBoolean();
            System.out.println("Reading copy right issue: " + hasCopyright);
        } catch (IOException exc){
            System.out.println("Reading Error!");
        }
    }
}
