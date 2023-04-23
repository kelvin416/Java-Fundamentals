package labs_examples.access_modifiers;

public class ClassOne {
    /*
    Access modifiers --> affect class, instance variable and methods.
                        they play a large role in Encapsulation(One of the primary tenants of OOP)

    Public --> any class, instance variables or method that is marked as public can be openly accessible from
                anywhere in the application.
                it can also be access externally by external applications that are using this application.
    Private --> only accessible from within the class where the private variable or method is declared.
                there is no such thing as a private class.
    Protected --> only accessible by classes (and their members) that are declared in the same package as the
                    variable or method that is declared "protected". In addition, subclasses whether they are
                    in the same package or not, can access protected members.
    Default --> there is no access modifier applied. Similar to protected modifier but not accessible by subclasses.

     */

    public int publicVar;
    private int privateVar;
    protected int protectedVar;

    //private var is only accissible within this class. Hence it is placed within a public method to restrict
    // other consumers from changing altering the private values.

    public void changePrivateVar(int val){
        if (val >= 0 && val <= 100){

        }
        privateVar = val;
    }
}
