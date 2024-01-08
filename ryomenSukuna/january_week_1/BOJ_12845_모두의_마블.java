package january_week_1;

import java.util.Scanner;

public class BOJ_12845_모두의_마블 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if (input > max) {
                max = input;
            }
            arr[i] = input;
        }

        int sum = 0;
        for (int i : arr) {
            sum += (i + max);
        }

        System.out.println(sum - max*2);

    }
}
