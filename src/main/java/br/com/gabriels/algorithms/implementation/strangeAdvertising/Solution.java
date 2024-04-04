package br.com.gabriels.algorithms.implementation.strangeAdvertising;

//https://www.hackerrank.com/challenges/strange-advertising
class Result {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int days) {
    // Write your code here
        int adv = 5;
        int total = 0;
        for (int i = 1; i <= days; i++) {
            int metade_like = Math.floorDiv(adv, 2);

            total += metade_like;

            adv = metade_like * 3;
        }

        return total;
    }

}

public class Solution {
    public static void main(String[] args) {
        int n = 3;

        int result = Result.viralAdvertising(n);
        System.out.println(result);
    }
}