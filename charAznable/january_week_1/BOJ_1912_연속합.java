package january_week_1;

import java.util.Scanner;

public class BOJ_1912_연속합 {

    static Integer[] dp;
    static int[] arr;
    static int max;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        dp = new Integer[n];
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            arr[i] = input;
        }

        dp[0] = arr[0];
        max = arr[0];

        calculate(n-1);

        System.out.println(max);
    }

    private static int calculate(int index) {

        if (dp[index] == null) {
            dp[index] = Math.max(arr[index], arr[index] + calculate(index-1));
            max = Math.max(max, dp[index]);
        }

        return dp[index];
    }
}
