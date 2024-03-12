package br.com.gabriels.warmup.birthdayCakeCandles;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/birthday-cake-candles
class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        Map<Integer, Long> mapaDeFrequencia = candles.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<Integer, Long> integerLongEntry = mapaDeFrequencia.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();

        return Math.toIntExact(integerLongEntry.getValue());
    }

}

public class Solution {
    public static void main(String[] args) {
//        int candlesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> candles = Stream.of("3 2 1 3".split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.birthdayCakeCandles(candles);
        System.out.println(result);
    }
}