package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        System.out.println("Hello there help me out. Type in a word which contains a lot of vowels.");
        System.out.println("I will single out the first vowel in your chosen world.");
        System.out.print("Type in your word: ");

        Scanner scanner = new Scanner(System.in);

        String vowel = scanner.nextLine().toLowerCase();

//        String vowelNum = String.valueOf(vowel.length());
        int vowelNum = vowel.length();
        int vowelChar = vowel.charAt(0);
        int vowelCount = 0;

        while (vowelCount <= vowelNum){
            char char1 = vowel.charAt(vowelCount);
            if (char1 == 'a'){
                System.out.println("And the vowel is: " + char1);
                System.out.println("The name is: " + vowel);
                break;
            } else if (char1 == 'e') {
                System.out.println("And the vowel is: " + char1);
                System.out.println("The name is: " + vowel);
                break;
            } else if (char1 == 'i') {
                System.out.println("And the vowel is: " + char1);
                System.out.println("The name is: " + vowel);
                break;
            } else if (char1 == 'o') {
                System.out.println("And the vowel is: " + char1);
                System.out.println("The name is: " + vowel);
                break;
            } else if (char1 == 'u') {
                System.out.println("And the vowel is: " + char1);
                System.out.println("The name is: " + vowel);
                break;
            }
            vowelCount++;

        }


    }
}
