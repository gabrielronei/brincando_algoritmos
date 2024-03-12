package br.com.gabriels.warmup.timeConversion;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//https://www.hackerrank.com/challenges/time-conversion
class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ssa");

        LocalTime time = LocalTime.parse(s, formatter);

        LocalTime result;
        if (time.getHour() <= 12 || time.getHour() >= 0 ) {
            result = time;
        } else {
            result = time.plusHours(12);
        }

        return "%02d:%02d:%02d".formatted(result.getHour(), result.getMinute(), result.getSecond());
    }

}

public class Solution {
    public static void main(String[] args) {

//        String s = "07:05:45PM";
//        String s = "12:01:00AM";
//        String s = "12:45:54PM"; //essa que falhou
//        String s = "07:05:45PM";
//        String s = "11:59:45PM";
//        String s = "11:59:45AM";
//        String s = "12:00:00AM";
        String s = "12:40:22AM";

        String result = Result.timeConversion(s);
        System.out.println(result);
    }
}