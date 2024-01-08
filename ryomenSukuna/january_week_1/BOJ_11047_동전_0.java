package january_week_1;

import java.util.Scanner;

public class BOJ_11047_동전_0 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int money = in.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            arr[i] = input;
        }

        int count = 0;
        for (int i = n-1; i >= 0; i--) {
            int split = money / arr[i];
            if (split >= 1) {
                count += split;
                money = money % arr[i];
            }
        }

        System.out.println(count);
    }
}
