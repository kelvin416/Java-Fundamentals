package labs_examples.input_output.labs;

import java.io.*;

/**
 * Input/Output Exercise 3: variety
 *
 *    1) Demonstrate the usage of at least two additional Byte Streams
 *    2) Demonstrate the usage of at least two additional Character Streams
 *    3) Demonstrate using a buffer on one of the Byte Streams and one of the Character Streams
 *    4) Demonstrate the use of the DataInputStream and DataOutputStream
 *
 */

class Exercise3{
    public static void main(String[] args) {

        String filePath = "src/labs_examples/input_output/labs/example1_data.txt";
        String copyPath = "src/labs_examples/input_output/labs/example3_data.txt";
        String filePath3 = "src/labs_examples/input_output/labs/example1_data.txt";
        String filePath4 = "src/labs_examples/input_output/labs/example3_data2.txt";
        String filePath2 = "src/labs_examples/input_output/labs/example3_data2.txt";
        String filePath6 = "src/labs_examples/input_output/labs/RWDataIO.dat";

        try {
            copyingFiles(filePath, copyPath);
        } catch (IOException e) {
            System.out.println("There is no such file");
        }

        try {
            comparingFiles(filePath4, filePath3);
        } catch (IOException e) {
            System.out.println("There is no such file");
        }

        try {
            readingLineByLine(filePath2);
        } catch (IOException e) {
            System.out.println("There is no such file");
        }

        try {
            readingFile(filePath2);
        } catch (IOException e) {
            System.out.println("There is no such file");
        }

        try {
            dataIO(filePath6);
        } catch (IOException e) {
            System.out.println("Could Not Write");
        }

    }

    // 1. Byte Streams
    //a
    public static void copyingFiles(String filePath, String copyPath) throws IOException {
        int i;
        FileInputStream fileInputStream = new FileInputStream(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(copyPath);

        do {
            i = fileInputStream.read();
            if (i != -1){
                fileOutputStream.write(i);
            }
        }while (i != -1);
    }


    //b / 3. Using Buffere
    public static void comparingFiles(String filePath4, String filePath3) throws IOException{
        int i = 0;
        int j = 0;

        BufferedInputStream bis4 = new BufferedInputStream(new FileInputStream(filePath4));
        BufferedInputStream bis3 = new BufferedInputStream(new FileInputStream(filePath3));

        //checking out the components of each file.

        do {
            i = bis4.read();
            j = bis3.read();

            if (i != j){
                break;
            }
        } while (i != -1 && j != -1);

        if (i != j){
            System.out.println("Files Deffer.");
        } else {
            System.out.println("The files are a match");
        }

    }
    //2. Character Streams
    //a / 3. Using Buffer

    public static void readingLineByLine(String filePath2) throws IOException {
        String st;

        BufferedReader br = new BufferedReader(new FileReader(filePath2));

        do {
            st = br.readLine();
        } while (st != null);
    }

    //b

    public static void readingFile(String filePath2) throws IOException{
        int charRead;

        FileReader freader = new FileReader(filePath2);

        while ((charRead = freader.read()) != -1){
            System.out.print((char) charRead);
        }

        System.out.println("\n");
    }

    // 4. DataInput and DataOutput streams

    public static void dataIO(String filepath6) throws IOException{
        int age = 13;
        double height = 6.12;//in feet
        double weight = 100.11;//in kgs

        DataOutputStream doutput = new DataOutputStream(new FileOutputStream(filepath6));
        System.out.println("Recording age: " + age + " years old");
        doutput.writeInt(age);
        System.out.println("Recording height: " + height + " feet");
        doutput.writeDouble(height);
        System.out.println("Recording weight: " + weight + " kgs");
        doutput.writeDouble(weight);

        System.out.println();

        DataInputStream dinput = new DataInputStream(new FileInputStream(filepath6));
        age = dinput.readInt();
        System.out.println("Reading age: " + age + " years old");
        height = dinput.readDouble();
        System.out.println("Reading height: " + height + " feet");
        weight = dinput.readDouble();
        System.out.println("Reading weight: " + weight + " kgs");
    }
}
