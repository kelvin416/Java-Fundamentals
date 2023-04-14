package labs_examples.fundamentals.labs.variable_scope;

public class VariableScope {
    //The nearest opening and closing brackets defines a scope of a variable.
    static int globalVar = 10; //This Variable is accessible anywhere within this class variable scope

    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        myVehicle.name = "Mazda";
        myVehicle.make = "Demio";
        myVehicle.year = 2021;

        if (myVehicle.make.equalsIgnoreCase("Benz")){
            String message = "Its a V6 car";// Variable message is only accessible within this if statement.
            System.out.println(message);
        }
        else {
            String message = "Its a V8 car";
            System.out.println(message);
        }
    }

    public static int multiply(int a, int b){
        int result = a * b * globalVar; //int a and b are only available within the multiply method scope.
        return result;
    }

    public static int divide(int a, int b){
        int result = globalVar / a /b;
        return result;
    }

    // The variable "result" from multiply method and division method are not connected since they are
    // from different scopes.
}
