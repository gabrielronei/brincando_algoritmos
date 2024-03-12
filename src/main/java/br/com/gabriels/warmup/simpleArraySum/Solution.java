package br.com.gabriels.warmup.simpleArraySum;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/simple-array-sum
class Result {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
    // Write your code here
        return ar.stream().reduce(Integer::sum).orElse(0);
    }

}

public class Solution {
    public static void main(String[] args) {
        List<Integer> ar = Stream.of("1 2 3 4 10 11".split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.simpleArraySum(ar);
        System.out.println(result);
    }
}