package labs_examples.input_output.my_examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderAvgNums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        int n;
        double sum = 0.0;
        double avg, t;

        System.out.println("How many numbers will you enter:");
        str = br.readLine();
        try {
            n = Integer.parseInt(str);
        } catch (NumberFormatException exc){
            System.out.println("Invalid Formart");
            n = 0;
        }

        System.out.println("Enter " + n + " values.");
        for (int i = 0; i < n; i++) {
            System.out.print(": ");
            str = br.readLine();
            try {
                t = Double.parseDouble(str);
            } catch (NumberFormatException exc){
                System.out.println("Invalid Format");
                t = 0.0;
            } finally {
                br.close();
            }
            sum += t;
        }

        avg = sum / n;
        System.out.println("Average is: " + avg);
    }
}
