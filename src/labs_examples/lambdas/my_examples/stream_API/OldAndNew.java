package labs_examples.lambdas.my_examples.stream_API;

import java.util.Arrays;
import java.util.List;

public class OldAndNew {
    //old and new ways for finding the sum in a list of integers
    public static void main(String[] args) {
        //ForEachLoop
        int add = 0;
        List<Integer> nums1 = Arrays.asList(32,32,54,78,99);
        for (Integer numLoop : nums1) {
            add+= numLoop;
        }

        System.out.println("For each loop addition is: " + add);

        //Using Stream API
        List<Integer> nums2 = Arrays.asList(32,32,54,78,99);
        Integer sum = nums2.stream().reduce(0, Integer::sum);
        System.out.println("Stream API addition is: " + sum);
    }
}
