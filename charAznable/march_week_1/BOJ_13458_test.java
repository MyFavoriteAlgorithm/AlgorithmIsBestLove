package march_week_1;

import java.util.Scanner;

public class BOJ_13458_test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        long[] judge = new long[2];

        for (int i = 0; i < 2; i++) {
            judge[i] = in.nextInt();
        }

        long count = n;
        for (int i = 0; i < n; i++) {
            arr[i] -= judge[0];
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                if (arr[i] % judge[1] == 0) {
                    count += arr[i] / judge[1];
                } else {
                    count += (arr[i] / judge[1] + 1);
                }
            }
        }

        System.out.println(count);
    }
}
