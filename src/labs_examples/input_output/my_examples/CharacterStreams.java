package labs_examples.input_output.my_examples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CharacterStreams {
    public static void main(String[] args) {
        String filePath = "src/labs_examples/input_output/files/char_data.txt";

        try {
            readCharacterByCharacter(filePath);
            System.out.println("\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            readLineByLine(filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readCharacterByCharacter(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        int i;

        while ((i = fileReader.read()) != -1){
            System.out.print((char) i);
        }
    }

    public static void readLineByLine(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String st;

        while ((st = bufferedReader.readLine()) != null){
            System.out.println(st);
        }
    }
}
