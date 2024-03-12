package br.com.gabriels.warmup.plusMinus;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


//https://www.hackerrank.com/challenges/plus-minus
class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
        var positiveNumbers = 0;
        var negativeNumbers = 0;
        var zeroNumbers = 0;
        var numberOfElements = arr.size();

        for (int i = 0; i < numberOfElements; i++) {
            int number = arr.get(i);

            if (number > 0) {
                positiveNumbers++;
            } else if (number < 0) {
                negativeNumbers++;
            } else {
                zeroNumbers++;
            }

        }

        System.out.printf("%.6f%n", (double) positiveNumbers / numberOfElements);
        System.out.printf("%.6f%n", (double) negativeNumbers / numberOfElements);
        System.out.printf("%.6f%n", (double) zeroNumbers / numberOfElements);
    }

}

public class Solution {
    public static void main(String[] args) {

        List<Integer> arr = Stream.of("-4 3 -9 0 4 1".replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        System.out.println(arr);

        Result.plusMinus(arr);

    }
}
