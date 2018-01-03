package TimeConversion;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 *
 * TRY AGAIN!
 */
public class Solution {

    static String timeConversion(String s) {
        if (s.endsWith("PM")) {
            int hour = (s.startsWith("12")) ? 12 : Integer.valueOf(s.substring(0, 2)) + 12;
            return hour + s.substring(2, s.length() - 2);
        }

        String hour = (s.startsWith("12")) ? "00" : s.substring(0, 2);
        return hour + s.substring(2, s.length() - 2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
