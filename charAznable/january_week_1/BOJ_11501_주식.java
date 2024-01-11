package january_week_1;

import java.util.Scanner;

public class BOJ_11501_주식 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        long[] result = new long[T];

        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            long[] stock = new long[N];
            long max = 0;

            for (int j = 0; j < N; j++) {
                stock[i] = in.nextInt();
            }

            for (int j = N-1; j >= 0; j--) {
                if (stock[i] > max) {
                    max = stock[i];
                } else {
                    result[i] += (max = stock[j]);
                }
            }
        }

        for (long l : result) {
            System.out.println(l);
        }

    }
}
