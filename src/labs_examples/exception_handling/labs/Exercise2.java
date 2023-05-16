package labs_examples.exception_handling.labs;

public class Exercise2 {
    public static void main(String[] args) {

        int [] marks = {44, 34, 55, 70, 87, 90, 100};
        try {
            int NoOfStudents = marks[20];
        } catch (ArrayIndexOutOfBoundsException exc1){
            System.out.println("Array out of bound");
        } catch (IndexOutOfBoundsException exc2){
            System.out.println("Index out of bound");
        } catch (Exception exc){
            System.out.println("Exception found");
        }
    }
}
