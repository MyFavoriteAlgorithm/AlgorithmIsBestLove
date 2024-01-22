package jaunary_week_4;

import java.util.Scanner;

public class BOJ_11055_가장_큰_증가하는_수열 {

    static Integer[] dp;
    static int[] arr;

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

        int max = 0;
        for (Integer i : dp) {
            max = Math.max(i, max);
        }

        System.out.println(max);
    }

    private static int LIS(int index) {
        if (dp[index] == null) {
            dp[index] = arr[index];

            for (int i = 0; i < index; i++) {
                if (arr[index] > arr[i]) {
                    dp[index] = Math.max(dp[index], dp[i] + arr[index]);
                }
            }
        }
        return dp[index];
    }
}
