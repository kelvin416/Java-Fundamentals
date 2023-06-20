package labs_examples.lambdas.my_examples;

public interface LambdaTriFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}

class Sum{
    Integer doSum(String str1, String str2){
        return Integer.parseInt(str1) + Integer.parseInt(str2);
    }
}

class TriFunctionController{
    public static void main(String[] args) {

        //Wrapping do sum using anonymous class:
        LambdaTriFunction<Sum, String, String, Integer> anonClass = new LambdaTriFunction<Sum, String, String, Integer>() {
            @Override
            public Integer apply(Sum sum, String s, String s2) {
                return sum.doSum(s, s2);
            }
        };
        System.out.println(anonClass.apply(new Sum(), "4", "4"));

        //Using lambda expression
        LambdaTriFunction<Sum, String, String, Integer> lambdaExamples =
                (Sum sum, String str1, String str2) -> sum.doSum(str1, str2);
        System.out.println(lambdaExamples.apply(new Sum(), "4", "4"));

        //Using Method Reference
        LambdaTriFunction<Sum, String, String, Integer> methodReference = Sum::doSum;
        System.out.println(methodReference.apply(new Sum(), "4", "4"));


    }
}
