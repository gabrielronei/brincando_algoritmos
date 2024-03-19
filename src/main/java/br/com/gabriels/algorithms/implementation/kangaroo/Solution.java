package br.com.gabriels.algorithms.implementation.kangaroo;

// https://www.hackerrank.com/challenges/kangaroo
class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (v1 <= v2) {
            return "NO";
        }

        int initialDifference = x2 - x1;

        int jumpDifference = v1 - v2;

        if (initialDifference % jumpDifference != 0) {
            return "NO";
        }

        return "YES";
    }

}

public class Solution {
    public static void main(String[] args) {
        String[] firstMultipleInput = "0 3 4 2".split(" ");

        int x1 = Integer.parseInt(firstMultipleInput[0]);

        int v1 = Integer.parseInt(firstMultipleInput[1]);

        int x2 = Integer.parseInt(firstMultipleInput[2]);

        int v2 = Integer.parseInt(firstMultipleInput[3]);

        String result = Result.kangaroo(x1, v1, x2, v2);

        System.out.println(result);

    }
}