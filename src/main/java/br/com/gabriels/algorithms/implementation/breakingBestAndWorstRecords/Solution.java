package br.com.gabriels.algorithms.implementation.breakingBestAndWorstRecords;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/breaking-best-and-worst-records
class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int bestRecord = scores.get(0);
        int minRecord = scores.get(0);
        int quantityOfMaxPointsRecords = 0;
        int quantityOfLeastPointsRecords = 0;

        for (int i = 1; i < scores.size(); i++) {
            int score = scores.get(i);

            if (score > bestRecord) {
                bestRecord = score;
                quantityOfMaxPointsRecords++;
            } else if (score < minRecord) {
                minRecord = score;
                quantityOfLeastPointsRecords++;
            }
        }

        return List.of(quantityOfMaxPointsRecords, quantityOfLeastPointsRecords);
    }

}

public class Solution {
    public static void main(String[] args) {
        int n = 9;

        List<Integer> scores = Stream.of("10 5 20 20 4 5 2 25 1".split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.breakingRecords(scores);

        System.out.println(result);
//        bufferedWriter.write(
//            result.stream()
//                .map(Object::toString)
//                .collect(joining(" "))
//            + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
