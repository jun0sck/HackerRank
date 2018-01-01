package Staircase;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 */
public class Solution {

    static void staircase(int n) {
        // Complete this function

        for (int i = 1; i <= n; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 1; j <= i; j++) {
                sb.append("#");
            }
            System.out.println(String.format("%" + n + "s", sb.toString()));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
