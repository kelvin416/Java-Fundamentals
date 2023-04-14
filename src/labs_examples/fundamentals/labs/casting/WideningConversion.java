package labs_examples.fundamentals.labs.casting;

public class WideningConversion {
    public static void main(String[] args) {
        //widening casting / implicit casting /auto conversion of values
        // variables are converted automatically as long as the data type is able to store the value of converted value.
        int i = 99;
        //conversion of int i to long j - no explicit type casting required.
        long j = i;
        //conversion of long j to float f - no explicit type casting required.
        float f = j;
        //conversion of float f to double d - no explicit type casting required.
        double d = f;

        System.out.println("Int Value is: " + i);
        System.out.println("Long value is: " + j);
        System.out.println("Float value is: " + f);
        System.out.println("Double value is: " + d);

    }
}
