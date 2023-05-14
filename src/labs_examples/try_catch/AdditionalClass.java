package labs_examples.try_catch;

public class AdditionalClass {
    public static void someMethod(int[] numbers){
        try {
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i] / numbers [i + 1]);
            }
        } catch (ArithmeticException aeExc){
            System.out.println("A number cannot be divided by 0");
        } catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Index array is out of bounds");
            exc.printStackTrace();
        } catch (Exception mainExc){
            System.out.println("This code has an error");
        }
    }
}
