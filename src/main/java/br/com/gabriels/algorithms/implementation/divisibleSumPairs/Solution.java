package br.com.gabriels.algorithms.implementation.divisibleSumPairs;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


//https://www.hackerrank.com/challenges/divisible-sum-pairs
class Result {

    /*
     * Complete the 'divisibleSumPairs' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER_ARRAY ar
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int counter = 0;

        for (int i = 0; i <= ar.size() - 1; i++) {
            for (int j = i; j < ar.size() - 1; j++) {
                var sum = ar.get(i) + ar.get(j + 1);

                if (sum % k == 0) {
                    counter++;
                }
            }
        }
        return counter;
    }

}

public class Solution {
    public static void main(String[] args) {
        int n = 6;

        int k = 3;

        List<Integer> ar = Stream.of("1 3 2 6 1 2".split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.divisibleSumPairs(n, k, ar);

        System.out.println(result);
    }
}
