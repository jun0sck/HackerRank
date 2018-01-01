package MiniMaxSum;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class Solution {

    static void miniMaxSum(int[] arr) {
        long max = 0;
        long min = 0;

        for (int i = 0; i < arr.length; i++) {

            long sum = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j == i) continue;

                sum = sum + arr[j];
            }

            if (max == 0 || sum >= max) {
                max = sum;
            }
            if (min == 0 || sum <= min) {
                min = sum;
            }
        }

        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }
}

