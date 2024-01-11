package january_week_1;

import java.util.Scanner;

public class BOJ_13305_주유소_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] dis = new long[n-1];
        long[] cost = new long[n];

        for (int i = 0; i < n-1; i++) {
            dis[i] = in.nextInt();
        }
        cost[0] = in.nextInt();
        for (int i = 1; i < n; i++) {
            int input = in.nextInt();
            cost[i] = Math.min(cost[i-1], input);
        }
        long sum = 0;
        for (int i = 0; i < n-1; i++) {
            sum += dis[i] * cost[i];
        }

        System.out.println(sum);
    }
}
