package AppleAndOrange;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    static int[] appleAndOrange(int s, int t, int a, int b, int[] apple, int[] orange) {
        // Complete this function

        ArrayList<Integer> apples = locationOfFruits(a, apple);
        ArrayList<Integer> oranges = locationOfFruits(b, orange);

        int resA = 0;
        for (Integer ap : apples) {
            if (s <= ap && ap <= t) {
                resA++;
            }
        }

        int resO = 0;
        for (Integer o : oranges) {
            if (s <= o && o <= t) {
                resO++;
            }
        }

        return new int[]{resA, resO};
    }

    public static ArrayList<Integer>locationOfFruits(int tree, int[]fruits) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int f : fruits) {
            res.add(tree + f);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int[] result = appleAndOrange(s, t, a, b, apple, orange);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
