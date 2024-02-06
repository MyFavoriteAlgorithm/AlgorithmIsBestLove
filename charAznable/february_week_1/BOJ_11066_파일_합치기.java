package february_week_1;

import java.util.Scanner;

public class BOJ_11066_파일_합치기 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int K = in.nextInt();
            int[] files = new int[K + 1];
            int[][] dp = new int[K+1][K+1];

            files[1] = in.nextInt();
            for (int j = 2; j <= K; j++) {
                int temp = in.nextInt();
                files[j] = temp + files[j-1];
            }

            for (int gap = 1; gap < K; gap++) {
                for(int start = 1; start + gap <= K; start++) {
                    int end = start + gap;
                    dp[start][end] = Integer.MAX_VALUE;

                    for(int mid = start; mid < end; mid++) {
                        dp[start][end] = Math.min(dp[start][end],dp[start][mid]+dp[mid+1][end]+files[end]-files[start-1]);
                    }
                }
            }
            System.out.println(dp[1][K]);
            }
    }
}
