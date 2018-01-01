package AVeryBigSum;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class Solution {

    static long aVeryBigSum(int n, long[] ar) {
        // Complete this function

        BigDecimal res = BigDecimal.ZERO;

        for (long l : ar) {
            res = res.add(BigDecimal.valueOf(l));
        }

        return res.longValue();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}

