package labs_examples.fundamentals.my_examples;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        int[] a = {123, 1243,12,453,62,53,6,3};
        int[] b = {90, 122, 12, 23, 35, 112};
        int c  = solution(a, b);
        System.out.println(c);

    }
    public static int solution(int[] a, int[] b){
        int numsA = a[0];
        int numsB = b[0];

        for (int i = 0; i < a.length; i++){
            if (a[i] < numsA){
                numsA = a[i];
            }
        }

        for (int i = 0; i < b.length; i++){
            if (b[i] < numsB){
                numsB = b[i];
            }
        }

        if (numsA == numsB){
            return numsA;
        } else
            return -1;
    }
}
