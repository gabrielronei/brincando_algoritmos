package br.com.gabriels.algorithms.implementation.betweenTwoSets;

import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/between-two-sets
class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

//    public static int getTotalX(List<Integer> a, List<Integer> b) {
//    // Write your code here
//        HashSet<Object> aList = new HashSet<>();
//        HashSet<Object> bList = new HashSet<>();
//
//
//        for (Integer integer: a) {
//            HashSet<Integer> objects = new HashSet<>();
//            for(int i=1; i<=100; i++) {
//                int result = integer * i;
//                objects.add(result);
//            }
//            if (aList.isEmpty()) aList.addAll(objects);
//            else aList.retainAll(objects);
//        }
//
//        System.out.println(aList);
//
//        for (Integer integer: b) {
//            HashSet<Integer> objects = new HashSet<>();
//            for(int i=1; i<=100; i++) {
//                boolean result = integer % i == 0;
//
//                if (result) objects.add(i);
//            }
//            if (bList.isEmpty()) bList.addAll(objects);
//            else bList.retainAll(objects);
//        }
//
//        System.out.println(bList);
//
//        aList.retainAll(bList);
//        return aList.size();
//    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        // Write your code here
        Set<Integer> multiplos = encontrarMultiplos(a);
        Set<Integer> divisores = encontraDivisores(b);

        multiplos.retainAll(divisores);

        return multiplos.size();
    }

    private static Set<Integer> encontraDivisores(List<Integer> numeros) {
        int mdc = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            mdc = calculaMDC(mdc, numeros.get(i));
        }

        Set<Integer> divisores = new HashSet<>();
        for (int i = 1; i <= mdc; i++) {
            if (mdc % i == 0) {
                divisores.add(i);
            }
        }

        System.out.println(divisores);
        return divisores;
    }

    private static Set<Integer> encontrarMultiplos(List<Integer> numeros) {

        int mmc = numeros.get(0);

        for (int i = 1; i < numeros.size(); i++) {
            mmc = calculaMMC(mmc, numeros.get(i));
        }

        Set<Integer> multiplos = new HashSet<>();
        for (int i = 1; i <= 100; i++) {
            if (i % mmc == 0) {
                multiplos.add(i);
            }
        }

        System.out.println(multiplos);
        return multiplos;
    }

    private static Integer calculaMMC(int a, int b) {
        return a * (b / calculaMDC(a, b));
    }

    private static Integer calculaMDC(int a, int b) {
        if (b == 0) {
            return a;
        }

        return calculaMDC(b, a % b);
    }
}

public class Solution {
    public static void main(String[] args) {
        String[] firstMultipleInput = "2 3".split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of("2 4".split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> brr = Stream.of("16 32 96".split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int total = Result.getTotalX(arr, brr);
        System.out.println(total);
    }
}