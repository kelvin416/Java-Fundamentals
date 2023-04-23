package labs_examples.access_modifiers;

public class ClassTwo {
    //this class is for accessing instance variables from class one

    public static void main(String[] args) {
        ClassOne classOne = new ClassOne();

        classOne.protectedVar = 20;
        classOne.publicVar = 40;
        // However, private var cannot be access in another class.

        classOne.changePrivateVar(60);
    }
}
