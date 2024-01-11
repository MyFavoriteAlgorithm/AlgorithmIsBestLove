package january_week_1;

import java.util.Scanner;

public class BOJ_9095_123더하기 {

    static Integer[] dp;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        dp = new Integer[11];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        for (int i = 0; i < T; i++) {
            int input = in.nextInt();

            fun(input);
            System.out.println(dp[input]);
        }

    }

    private static Integer fun(int input) {

        if (dp[input] == null) {
            dp[input] = fun(input - 1) + fun(input -2) + fun(input - 3);
        }

        return dp[input];
    }
}
