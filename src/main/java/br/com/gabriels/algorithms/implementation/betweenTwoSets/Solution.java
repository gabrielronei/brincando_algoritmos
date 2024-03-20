package br.com.gabriels.algorithms.implementation.betweenTwoSets;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    // Write your code here
        HashSet<Object> aList = new HashSet<>();
        HashSet<Object> bList = new HashSet<>();


        for (Integer integer: a) {
            HashSet<Integer> objects = new HashSet<>();
            for(int i=1; i<=100; i++) {
                int result = integer * i;
                objects.add(result);
            }
            if (aList.isEmpty()) aList.addAll(objects);
            else aList.retainAll(objects);
        }

        System.out.println(aList);

        for (Integer integer: b) {
            HashSet<Integer> objects = new HashSet<>();
            for(int i=1; i<=100; i++) {
                boolean result = integer % i == 0;

                if (result) objects.add(i);
            }
            if (bList.isEmpty()) bList.addAll(objects);
            else bList.retainAll(objects);
        }

        System.out.println(bList);

        aList.retainAll(bList);
        return aList.size();
    }

}

public class Solution {
    public static void main(String[] args) {
        String[] firstMultipleInput = "2 3".split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of("2 4".split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of("16 32 96".split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);
        System.out.println(total);
//        System.out.println(24 % 2 == 0);
    }
}