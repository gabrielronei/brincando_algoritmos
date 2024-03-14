package br.com.gabriels.algorithms.implementation.gradingStudents;

import java.io.IOException;
import java.util.List;

import static java.util.stream.Collectors.toList;

//https://www.hackerrank.com/challenges/grading
class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        return grades.stream().map(grade -> {
            int nearestRoundUp = ((grade / 5) + 1) * 5;

            int result = nearestRoundUp - grade;
            if (grade < 38 || result > 2) {
                return grade;
            } else {
                return nearestRoundUp;
            }

        }).toList();
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {

        List<Integer> grades = List.of(73, 67, 38, 33)
                .stream()
            .collect(toList());

        List<Integer> result = Result.gradingStudents(grades);
        System.out.println(result);
    }


}