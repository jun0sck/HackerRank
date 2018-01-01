package PlusMinus;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */
public class Solution {

    static void plusMinus(int[] arr) {
        // Complete this function

        float total = arr.length;
        int neg = 0;
        int zero = 0;
        int pos = 0;

        for (int i : arr) {
            if (i < 0) neg++;
            if (i == 0) zero++;
            if (i > 0) pos++;
        }

        System.out.println(String.format("%.6f", pos / total));
        System.out.println(String.format("%.6f", neg / total));
        System.out.println(String.format("%.6f", zero / total));

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
