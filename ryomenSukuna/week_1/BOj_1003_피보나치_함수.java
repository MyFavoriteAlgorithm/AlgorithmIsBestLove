package week_1;

import java.util.Scanner;

public class BOj_1003_피보나치_함수 {

    static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int T = in.nextInt();
        for (int i = 0; i < T; i++) {
            int input = in.nextInt();
            fun(input);
            System.out.println(dp[input][0] + " " + dp[input][1]);
        }
    }

    private static Integer[] fun(int input) {

        if (dp[input][0] == null || dp[input][1] == null) {
            dp[input][0] = fun(input-2)[0] + fun(input-1)[0];
            dp[input][1] = fun(input-2)[1] + fun(input-1)[1];
        }

        return dp[input];
    }
}
