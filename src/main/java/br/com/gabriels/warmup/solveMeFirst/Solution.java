package br.com.gabriels.warmup.solveMeFirst;

import java.util.Scanner;

//https://www.hackerrank.com/challenges/solve-me-first
class Solution {

    static int solveMeFirst(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 0;

        a = in.nextInt();
        b = in.nextInt();


        int sum = solveMeFirst(a, b);
        System.out.println(sum);
    }
}