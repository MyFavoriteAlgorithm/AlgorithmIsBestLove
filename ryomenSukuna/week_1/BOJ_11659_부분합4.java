package week_1;

import java.util.Scanner;

public class BOJ_11659_부분합4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[] arr = new int[n+1];

        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i-1] + in.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(arr[b] - arr[a-1]);
        }
    }
}
