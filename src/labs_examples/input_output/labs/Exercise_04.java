package labs_examples.input_output.labs;

import java.io.*;
import java.util.ArrayList;

/**
 *
 *      Following the video examples and source code found in the src/labs_examples/input_output/examples/csv_parser
 *      package, create a new application that will parse a custom CSV file that you created and map each line of the
 *      csv to a custom POJO that you create.
 *
 *      Then add that object to an arraylist. After you have mapped each row of the csv to objects
 *      and added each object to an arraylist, print out each object using the objects custom toString() method.
 *
 *      Then, write the arraylist of objects back out to a new .csv file. Ensure that the resulting csv file is valid.
 *
 */

class CSV_Gym{
    public static void main(String[] args) {
        String filePath = "src/labs_examples/input_output/labs/gymMembers.csv";
        String filePath2 = "src/labs_examples/input_output/labs/gymMembers2.csv";

        ArrayList<GymAttendant> gymAttendants= new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
           String line;
           String line2;

           while ((line = br.readLine()) != null){
               String[] values = line.split(",");
               gymAttendants.add(mapValuesToMembers(values));
           }
        } catch (FileNotFoundException exc){
            exc.printStackTrace();
        } catch (IOException exc){
            exc.printStackTrace();
        }

        for (GymAttendant members : gymAttendants){
            System.out.println(members.toString());

        }

        try (BufferedWriter br2 = new BufferedWriter(new FileWriter(filePath2))){
            br2.write(filePath2);
            br2.newLine();
            for (int i = 0; i < gymAttendants.size(); i++){
                br2.write(String.valueOf(gymAttendants.get(i)));
                br2.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static GymAttendant mapValuesToMembers(String[] values){
        GymAttendant gymAttendant = new GymAttendant();

        gymAttendant.setId(Integer.parseInt(values[0]));
        gymAttendant.setFirstName(values[1]);
        gymAttendant.setSecondName(values[2]);
        gymAttendant.setStartingWeight(Double.parseDouble(values[3]));

        return gymAttendant;
    }

}
