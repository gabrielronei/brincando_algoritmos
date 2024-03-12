package br.com.gabriels.warmup.veryBigSum;

import java.io.*;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/a-very-big-sum
class Result {

    /*
     * Complete the 'aVeryBigSum' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER_ARRAY ar as parameter.
     */

    public static long aVeryBigSum(List<Long> ar) {
        return ar.stream().reduce(Long::sum).orElse(0l);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int arCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Long> ar = Stream.of("1000000001 1000000002 1000000003 1000000004 1000000005".replaceAll("\\s+$", "").split(" "))
            .map(Long::parseLong)
            .collect(toList());

        System.out.println(ar);
        long result = Result.aVeryBigSum(ar);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}