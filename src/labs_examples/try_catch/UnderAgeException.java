package labs_examples.try_catch;

public class UnderAgeException extends Exception{
    @Override
    public String toString() {
        return "UnderAgeException{ Must be 21 and above to purchase alcohol in the US.}";
    }
}
