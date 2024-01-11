package january_week_2;

import java.util.Scanner;

public class BOJ_14501_퇴사 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] day = new int[n];
        int[] pay = new int[n];
        int[] dp = new int[n+1];

        for (int i = 0; i < n; i++) {
            day[i] = in.nextInt();
            pay[i] = in.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            int next = i + day[i];
            if (next > n) {
                dp[i] = dp[i + 1];
            } else {
                dp[i] = Math.max(dp[i + 1], pay[i] + dp[next]);
            }
        }
        System.out.println(dp[0]);
    }
}
