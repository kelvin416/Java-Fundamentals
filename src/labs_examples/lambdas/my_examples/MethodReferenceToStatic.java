package labs_examples.lambdas.my_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class MethodReferenceToStatic {
    public static boolean isMoreThanFifty(int a, int b){
        return (a + b) > 50;
    }

    public static List<Integer> findNumbers(List<Integer> l, BiPredicate<Integer, Integer> p){
        List<Integer> newList = new ArrayList<>();
        for (Integer integer : l) {
            if (p.test(integer, integer + 10)){
                newList.add(integer);
            }
        }

        return newList;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(78, 92, 199, 2889, 267);

        //Using anonymous inner class
        findNumbers(list, new BiPredicate<Integer, Integer>() {
            @Override
            public boolean test(Integer integer, Integer integer2) {
                return MethodReferenceToStatic.isMoreThanFifty(integer, integer2);
            }
        });

        //using lambda expression
        findNumbers(list, ((integer, integer2) -> MethodReferenceToStatic.isMoreThanFifty(integer, integer2)));

        //Using method refrence
        findNumbers(list, MethodReferenceToStatic::isMoreThanFifty);
    }
}
