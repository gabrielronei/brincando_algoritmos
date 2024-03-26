package br.com.gabriels.algorithms.implementation.dayOfTheProgrammer;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;

//https://www.hackerrank.com/challenges/day-of-the-programmer
class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
        LocalDate somewhereInTime = LocalDate.of(year, Month.JANUARY, 1);

        boolean leapYear = somewhereInTime.isLeapYear();

        LocalDate programmerDay;
        if (somewhereInTime.getYear() == 1918) {
            programmerDay = somewhereInTime.plusDays(255 + 13);
        } else if (somewhereInTime.getYear() < 1918 && somewhereInTime.getYear() % 4 == 0 && !leapYear) {
            programmerDay = somewhereInTime.plusDays(254);
        } else {
            programmerDay = somewhereInTime.plusDays(255);
        }


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(programmerDay);

    }

}

public class Solution {
    public static void main(String[] args) {
        int year = 1918;
        String result = Result.dayOfProgrammer(year);

        System.out.println(result);
    }
}