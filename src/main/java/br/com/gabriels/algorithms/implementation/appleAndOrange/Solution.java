package br.com.gabriels.algorithms.implementation.appleAndOrange;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/apple-and-orange
class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        List<Integer> newApples = apples.stream().map(it -> it + a).collect(toList());
        List<Integer> newOranges = oranges.stream().map(it -> it + b).collect(toList());

        Predicate<Integer> betweenTheStartAndEnd = it -> it >= s && it <= t;

        int newApplesCount = newApples.stream()
                .filter(betweenTheStartAndEnd)
                .reduce(0, (subtotal, element) -> subtotal + 1, Integer::sum);

        int newOrangeCount = newOranges.stream()
                .filter(betweenTheStartAndEnd)
                .reduce(0, (subtotal, element) -> subtotal + 1, Integer::sum);

        System.out.println(newApplesCount);
        System.out.println(newOrangeCount);
    }

}

public class Solution {
    public static void main(String[] args) {

        String[] firstMultipleInput = "7 11".split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = "5 15".split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = "3 2".split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        List<Integer> apples = Stream.of("-2 2 1".split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> oranges = Stream.of("5 -6".split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}