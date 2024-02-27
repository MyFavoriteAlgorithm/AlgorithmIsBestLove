package march_week_1;

import java.util.Scanner;

public class BOJ_1890_jump {

    static int[][] arr;
    static long[][] dp;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n][n];
        dp = new long[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        dp[0][0] = 1;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int next = arr[i][j];
                if(next == 0) break;
                if(j + next < n) dp[i][j + next] += dp[i][j];
                if(i  +next < n) dp[i + next][j] += dp[i][j];
            }
        }
        System.out.println(dp[n-1][n-1]);

    }
}
