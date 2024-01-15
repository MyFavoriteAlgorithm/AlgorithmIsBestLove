package january_week_3;

import java.util.Scanner;

public class BOJ_1699_제곱수 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] dp = new int[n+1];

        for (int i = 1; i <= n; i++) {
            dp[i] = i;
            for (int j = 1; j * j <= i; j++) {
                int temp = dp[i - j * j] + 1;
                if (dp[i] > temp) {
                    dp[i] = temp;
                }
            }
        }
        System.out.println(dp[n]);
    }
}
