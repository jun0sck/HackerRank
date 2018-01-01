package CompareTheTriplets;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
public class Solution {

    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
        // Complete this function
        int[] res = new int[]{0, 0};

        comp(a0, b0, res);
        comp(a1, b1, res);
        comp(a2, b2, res);

        return res;
    }

    private static void comp(int a, int b, int res[]) {
        if (a > b) res[0]++;
        if (b > a) res[1]++;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int[] result = solve(a0, a1, a2, b0, b1, b2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }
}
