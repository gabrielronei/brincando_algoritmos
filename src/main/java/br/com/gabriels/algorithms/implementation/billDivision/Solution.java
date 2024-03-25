package br.com.gabriels.algorithms.implementation.billDivision;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/bon-appetit
class Result {

    /*
     * Complete the 'bonAppetit' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY bill
     *  2. INTEGER k
     *  3. INTEGER b
     */

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Item que a ana não comeu
        Integer sum = bill.stream().reduce(Integer::sum).orElse(0);

        Integer elementNotEatenByAna = bill.get(k);

        int total = sum - elementNotEatenByAna;

        var totalDivided = total / 2;

        var resto = b - totalDivided;

        if (resto == 0) System.out.println("Bon Appetit");
        else System.out.println(resto);
    }

}

public class Solution {
    public static void main(String[] args) {

        String[] firstMultipleInput = "4 1".split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> bill = Stream.of("3 10 2 9".split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int b = 12;

        Result.bonAppetit(bill, k, b);

    }
}