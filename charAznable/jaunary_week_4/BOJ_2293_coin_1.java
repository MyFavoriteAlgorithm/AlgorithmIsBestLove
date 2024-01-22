package jaunary_week_4;

import java.util.Scanner;

public class BOJ_2293_coin_1 {

    static int[] dp;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int[] arr = new int[a+1];
        dp = new int[b+1];
        dp[0] = 1;

        for(int i = 1 ; i <= a; i++) {
            arr[i] = in.nextInt();
            for (int j = arr[i]; j <= b; j++)
                dp[j] += dp[j - arr[i]];
        }

        System.out.println(dp[b]);

    }
}
