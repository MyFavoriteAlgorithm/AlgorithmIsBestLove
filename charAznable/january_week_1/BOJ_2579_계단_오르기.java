package january_week_1;

import java.util.Scanner;

public class BOJ_2579_계단_오르기 {

    static int[] step;
    static int[] dp;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        step = new int[N+1];
        dp = new int[N+1];

        for (int i = 1; i <= N; i++) {
            step[i] = in.nextInt();
        }

        dp[1] = step[1];

        if (N >= 2) {
            dp[2] = step[1] + step[2];
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = Math.max(dp[i-2], dp[i-3] + step[i-1]) + step[i];
        }

        System.out.println(dp[N]);
    }
}
