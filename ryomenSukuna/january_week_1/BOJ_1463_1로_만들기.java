package january_week_1;

import java.util.Scanner;

/**
 * 입력된 수 x가
 * 3으로 나누어 떨어지면 3으로 나눈다.
 * 2로 나누어 떨어지면 2로 나눈다.
 * 1을 뺀다.
 */
public class BOJ_1463_1로_만들기 {

    static Integer[] dp;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        dp = new Integer[n + 1];
        dp[0] = dp[1] = 0;

        System.out.println(function(n));
    }

    private static int function(int n) {

        if (dp[n] == null) {

            if (n % 6 == 0) {
                dp[n] = Math.min(Math.min(function(n / 2), function(n / 3)), function(n - 1)) + 1;
            } else if (n % 3 == 0) {
                dp[n] = Math.min(function(n / 3), function(n - 1)) + 1;
            } else if (n % 2 == 0) {
                dp[n] = Math.min(function(n / 2), function(n - 1)) + 1;
            } else {
                dp[n] = function(n-1) + 1;
            }

        }

        return dp[n];
    }
}
