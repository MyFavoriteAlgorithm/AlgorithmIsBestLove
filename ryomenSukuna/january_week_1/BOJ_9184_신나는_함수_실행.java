package january_week_1;

import java.util.Scanner;

public class BOJ_9184_신나는_함수_실행 {

    private static final String FORMAT = "w(%s, %s, %s) = ";
    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        while (a != -1 || b != -1 || c != -1) {

            int result = w(a, b, c);
            String out = String.format(FORMAT, a, b, c) + result +"\n";
            System.out.printf(out);

            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        }
    }

    private static int w(int a, int b, int c) {

        if (checkNumber(a, b, c) && dp[a][b][c] != 0) {
            return dp[a][b][c];
        }

        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }
        if (a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20, 20, 20);
        }
        if (a < b && b < c) {
            return dp[a][b][c] = w(a, b, c-1) + w(a, b-1, c-1) - w(a, b-1, c);
        }
        return dp[a][b][c] = w(a-1, b, c) + w(a-1, b-1, c) + w(a-1, b, c-1) - w(a-1, b-1, c-1);
    }

    private static boolean checkNumber(int a, int b, int c) {
        return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
    }
}
