package labs_examples.methods.pass_by_value;

public class CallingTime {
    public static void main(String[] args) {
        String time = UnderstandingMethods.getCurrentTime();
        System.out.println("The current time is: " + time);

        int sum = Parameters.addNum(34, 45);
        System.out.println(sum);

    }
}
