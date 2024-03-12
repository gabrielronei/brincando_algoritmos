package br.com.gabriels.warmup.diagonalDifference;

import java.util.List;

//https://www.hackerrank.com/challenges/diagonal-difference
class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {

        var leftToRight = 0;
        var rightToLeft = 0;
        for(int i = 0; i < arr.size(); i++) {
            List<Integer> integers = arr.get(i);
            leftToRight += integers.get(i);
            rightToLeft += integers.get(arr.size() - 1 - i);
        }

        return Math.abs(leftToRight - rightToLeft);
    }
}

public class Solution {
    public static void main(String[] args) {

        List<List<Integer>> arr = List.of(List.of(1, 2, 3), List.of(4, 5, 6), List.of(9, 8, 9));

        int result = Result.diagonalDifference(arr);
        System.out.println(arr);
        System.out.println(result);

//        System.out.println(arr.size());
//        A SOMA É [x][0], [y][1], [z][3] E DEPOIS O INVERSO [x][3], [y][1], [z][1]
    }
}
//2 - 0 - 0