package labs_examples.lambdas.labs;

@FunctionalInterface
public interface Exercise_01Of3 {
    public String carType(String a, String b);
}

class Exercise_01Of3_Class{
    public static void main(String[] args) {
        //Lambda expression with Exercise_01Of3
        Exercise_01Of3 lambdaCars = (a, b) -> {
            return a + " and " + b;
        };
        String carTypes1 = lambdaCars.carType("Mazda" , "Ferrari");
        System.out.println("The cars that I have are: " + carTypes1);

        //AnonClass
        Exercise_01Of3 anonCars = new Exercise_01Of3() {
            @Override
            public String carType(String a, String b) {
                return a + " and " + b;
            }
        };
        String carType2 = anonCars.carType("Benz ", "Toyota");
        System.out.println("The cars in the garage include: " + carType2);
    }
}
