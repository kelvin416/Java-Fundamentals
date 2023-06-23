package labs_examples.lambdas.labs;

@FunctionalInterface
public interface Exercise_01Of2 {
    public double moneyInBank(double a);
}

class Exercise_01Of2_Class{
    public static void main(String[] args) {
        //lambda interface with a SAM and a return type of double
        Exercise_01Of2 lambdaMoney = (a) -> a + 20.0099;
        double moneyBank = lambdaMoney.moneyInBank(300);
        System.out.println(moneyBank);

        //Anonymous
        Exercise_01Of2 anonMoney = new Exercise_01Of2() {
            @Override
            public double moneyInBank(double a) {
                return 40.99 + a;
            }
        };

        double moneyBank2 = anonMoney.moneyInBank(999);
        System.out.println(moneyBank2);
    }
}
