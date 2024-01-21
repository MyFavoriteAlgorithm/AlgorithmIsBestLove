package january_week_3;

import java.util.Scanner;

public class BOJ_11052_카드팩 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n+1];
        int[] dp = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] = Math.max(dp[i], dp[i - j] + arr[j]);
            }
        }

        System.out.println(dp[n]);

    }
}
