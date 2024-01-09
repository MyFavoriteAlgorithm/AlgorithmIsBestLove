package january_week_2;

import java.util.Scanner;

public class BOJ_11054_가장_긴_바이토닉_수열 {

    static int[] arr;
    static Integer[] dp;
    static Integer[] dp2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        arr = new int[n];
        dp = new Integer[n];
        dp2 = new Integer[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            LIS(i);
            LDS(i);
        }

        int max = -1;
        for (int i = 0; i < n; i++) {
            max = Math.max(dp[i] + dp2[i], max);
        }
        System.out.println(max-1);
    }

    private static int LIS(int index) {

        if (dp[index] == null) {
            dp[index] = 1;

            for (int i = index - 1; i >= 0; i--) {
                if (arr[i] < arr[index]) {
                    dp[index] = Math.max(dp[index], LIS(i) + 1);
                }
            }
        }
        return dp[index];
    }

    private static int LDS(int index) {

        if (dp2[index] == null) {
            dp2[index] = 1;

            for (int i = index + 1; i < dp2.length; i++) {
                if (arr[i] < arr[index]) {
                    dp2[index] = Math.max(dp2[index], LDS(i) + 1);
                }
            }
        }
        return dp2[index];
    }
}
