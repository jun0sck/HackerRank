package BirthdayCakeCandles;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */
public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        int first = 0;

        for (int i : ar) {
            if (i > first) {
                first = i;
            }
        }

        int res = 0;
        for (int i : ar) {
            if (i == first) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}