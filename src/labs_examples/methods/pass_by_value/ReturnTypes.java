package labs_examples.methods.pass_by_value;

public class ReturnTypes {
    public static int multiply(int a, int b){
        int c = a * b;
        return c;
    }

    public static int divide(int a, int b){//method signature, what declares and defines a method.
        int c = a / b;
        return c;
    }

    public static String reverse(String words){
        String word = words;
        String rev = "";
        char cha;
        for (int i = 0; i < word.length(); i++){
            cha = word.charAt(i);// extracts each inner character;
            rev = cha + rev;
        }
        return rev;
    }

    public static int isOdd(int a){
        int num = a;
        if (num % 2 == 0){
            System.out.println("false");
        } else {
            System.out.println("true");
        }
        return num;

    }
}
