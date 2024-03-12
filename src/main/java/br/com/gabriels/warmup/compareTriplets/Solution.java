package br.com.gabriels.warmup.compareTriplets;

import java.io.IOException;
import java.util.List;

//https://www.hackerrank.com/challenges/compare-the-triplets
class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int alicePoints = 0;
        int bobPoints = 0;
        for(int i = 0; i < a.size(); i++) {
            int aliceNumber = a.get(i);
            int bobNumber = b.get(i);
            
            if (aliceNumber > bobNumber) {
                alicePoints++;
            } else if (aliceNumber < bobNumber) {
                bobPoints++;
            }
        }
        
        return List.of(alicePoints, bobPoints);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());
//
//        List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//            .map(Integer::parseInt)
//            .collect(toList());

        List<Integer> a = List.of(5, 6, 7);
        List<Integer> b = List.of(3, 6, 10);

        List<Integer> result = Result.compareTriplets(a, b);

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