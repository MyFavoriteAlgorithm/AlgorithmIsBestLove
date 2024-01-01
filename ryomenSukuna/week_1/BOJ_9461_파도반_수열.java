package week_1;

import java.util.Scanner;

public class BOJ_9461_파도반_수열 {

    static Long[] dp =  new Long[101];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        dp[0] = 0L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int n = in.nextInt();
            System.out.println(fun(n));
        }
    }

    private static Long fun(int n) {

        if (dp[n] != null) {
            return dp[n];
        }
        dp[n] = fun(n-2) + fun(n-3);

        return dp[n];
    }
}
