package br.com.gabriels.algorithms.implementation.angryProfessor;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/angry-professor
class Result {

    /*
     * Complete the 'angryProfessor' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY a
     */

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here

        return a.stream().filter(it -> it <= 0).count() >= k ? "NO" : "YES";
    }

}

public class Solution {
    public static void main(String[] args) {
        int k = 3;

        List<Integer> a = Stream.of("-1 -3 4 2".split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String result = Result.angryProfessor(k, a);
        System.out.println(result);

        k = 2;
        a = Stream.of("0 -1 2 1".split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        result = Result.angryProfessor(k, a);
        System.out.println(result);

    }
}