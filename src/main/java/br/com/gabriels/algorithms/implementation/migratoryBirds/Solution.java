package br.com.gabriels.algorithms.implementation.migratoryBirds;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/migratory-birds
class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        Map<Integer, Long> numberOfApparitions = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<Integer, Long> entry = numberOfApparitions.entrySet().stream().max(Comparator.comparingLong(Map.Entry::getValue)).get();

        return Math.toIntExact(entry.getKey());
    }

}

public class Solution {
    public static void main(String[] args) {
        List<Integer> arr = Stream.of("1 4 4 4 5 3".split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);
        System.out.println(result);
    }
}