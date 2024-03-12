package br.com.gabriels.warmup.staircase;

//https://www.hackerrank.com/challenges/staircase
class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            var numberOfWhitespaces = n - i;
            for (int j = 1; j <= n; j++) {
                System.out.print(j <= numberOfWhitespaces ? " " : "#");
            }
            System.out.println();
        }
    }
}

public class Solution {
    public static void main(String[] args) {

        int n = 6;

        Result.staircase(n);

    }
}