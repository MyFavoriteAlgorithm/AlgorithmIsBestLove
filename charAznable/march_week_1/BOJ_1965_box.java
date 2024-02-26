package march_week_1;

import java.util.Scanner;

public class BOJ_1965_box {

    static int[] arr;
    static Integer[] dp;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new int[n];
        dp = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            LIS(i);
        }

        int max = dp[0];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, dp[i]);
        }

        System.out.println(max);
    }

    private static int LIS(int index) {

        if (dp[index] == null) {
            dp[index] = 1;

            for (int i = 0; i < index; i++) {
                if (arr[index] > arr[i]) {
                    dp[index] = Math.max(dp[index], dp[i] + 1);
                }
            }
        }
        return dp[index];
    }
}
