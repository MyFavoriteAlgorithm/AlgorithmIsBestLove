package january_week_2;

import java.util.Scanner;

public class BOJ_11051_이항_계수_2 {

    static int[][] dp;
    public static final int div = 10007;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();

        dp = new int[n + 1][r + 1];

        System.out.println(combination(n, r));

    }

    private static int combination(int n, int r) {
        if (dp[n][r] > 0) {
            return dp[n][r];
        }

        if (r == 0 || n == r) {
            return dp[n][r] = 1;
        }

        return dp[n][r] = (combination(n - 1, r - 1) + combination(n - 1, r)) % div;
    }
}
