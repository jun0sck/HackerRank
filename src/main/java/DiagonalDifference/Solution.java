package DiagonalDifference;

import java.util.Scanner;

public class Solution {

    static int diagonalDifference(int[][] a) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < a.length; i++) {
            x = x + a[i][i];
            y = y + a[i][a.length - 1 - i];
        }

        return Math.abs(x - y);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
