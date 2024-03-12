package br.com.gabriels.warmup.minimaxsum;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/mini-max-sum/
//Caution: Beware of integer overflow! Use 64-bit Integer.
class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        long total = arr.stream().map(Long::valueOf).reduce(Long::sum).orElse(0l);

        for (int i = 0; i < arr.size(); i++) {
            var resultado = total - arr.get(i);

            if (resultado > max) {
                max = resultado;
            }

            if (resultado < min) {
                min = resultado;
            }
        }

        System.out.printf("%d %d%n", min, max);
    }

}

public class Solution {
    public static void main(String[] args) {

//        List<Integer> arr = Stream.of("1 2 3 4 5".split(" "))
        List<Integer> arr = Stream.of("256741038 623958417 467905213 714532089 938071625".split(" "))
                .map(Integer::parseInt)
                .collect(toList());

//        System.out.println(arr);
        Result.miniMaxSum(arr);
    }
}