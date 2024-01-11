package january_week_1;

import java.util.Scanner;

public class BOJ_1010_다리_놓기 {

    static int[][] dp;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            dp = new int[b+1][a+1];

            System.out.println(combi(a, b));
        }
    }

    private static int combi(int a, int b) {
        if (dp[b][a] > 0) {
            return dp[b][a];
        }
        if (b == a || a == 0) {
            return dp[b][a] = 1;
        }
        return dp[b][a] = combi(a, b-1) + combi(a-1, b-1);
    }

}
