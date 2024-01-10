package january_week_2;

import java.util.Scanner;

public class BOJ_2193_이친수 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n+1];
        arr[1] = 0;
        arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        System.out.println(arr[n]);
    }
}
