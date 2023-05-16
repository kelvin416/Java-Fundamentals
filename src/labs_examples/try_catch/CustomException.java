package labs_examples.try_catch;

import labs_examples.classes.Person;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        try {
            buyWine();
        } catch (UnderAgeException e) {
            System.out.println(e.toString());
        }
    }
    public static void buyWine() throws UnderAgeException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to kelvin's liquor store.");
        System.out.println("Are your over 21 years?y/n");
        String response = scanner.next();

        if (response.equalsIgnoreCase("n")){
            throw new UnderAgeException();
        }

        System.out.println("Great we can get for you.");
    }
}
