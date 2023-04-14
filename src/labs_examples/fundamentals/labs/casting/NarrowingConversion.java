package labs_examples.fundamentals.labs.casting;

public class NarrowingConversion {
    public static void main(String[] args) {
        // Narrowing Conversion / Explicit Casting
        // The downside to explicit casting is information loss as you reduce the size of data type.
        double d = 127.2321;
        //double d is being cast to float f below - explicit casting required
        float f = (float) d;
        //float f is being cast to long l below - explicit casting required
        long l = (long) f;
        //long l is being cast to int i below - explicit casting required
        int i = (int) l;
        //int 'i' is being cast to short s below - explicit casting required
        short s = (short) i;
        //short s is being cast to byte b below - explicit casting required
        byte b = (byte) s;

        System.out.println("Double value: " + d);
        System.out.println("Float value: " + f);
        System.out.println("Long value: " + l);
        System.out.println("Int value: " + i);
        System.out.println("Short value: " + s);
        System.out.println("Byte value: " + b);

    }
}
