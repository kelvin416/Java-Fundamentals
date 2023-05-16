package labs_examples.exception_handling.labs;

public class Exercise3 {
    public static void main(String[] args) {

        int [] marks = {44, 34, 70, 87};
        try {
            int mark = marks[6];
        } catch (Exception exc){
            System.out.println("Exception found");
        }
        finally {
            System.out.println("The number of students are: " + marks.length);
        }
    }
}
