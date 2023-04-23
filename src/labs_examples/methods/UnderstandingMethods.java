package labs_examples.methods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnderstandingMethods {
    // main method
    public static void main(String[] args) {
        //this is where every application begins by default.
        String time = getCurrentTime();// This will be the first line to run. which is a method.
        System.out.println(time);//Second line to run for printing out the time object.
    }

    public static String getCurrentTime(){
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());//First line in the main method for getting time.
        return  time;
    }
}
