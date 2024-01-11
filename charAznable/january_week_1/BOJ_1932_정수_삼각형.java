package january_week_1;

import java.util.Scanner;

public class BOJ_1932_정수_삼각형 {

    static int[][] arr;
    static Integer[][] dp;
    static int N;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();

        arr = new int[N][N];
        dp = new Integer[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            dp[N-1][i] = arr[N-1][i];
        }

        int max = fun(0, 0);
        System.out.println(max);
    }

    private static int fun(int i, int j) {

        if (i == N-1) {
            return dp[i][j];
        }

        if (dp[i][j] == null) {
            dp[i][j] = Math.max(fun(i+1, j), fun(i+1, j+1)) + arr[i][j];;
        }

        return dp[i][j];
    }

}
