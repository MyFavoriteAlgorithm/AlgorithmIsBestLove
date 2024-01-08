package january_week_1;

import java.util.Scanner;

public class BOJ_1904_01타일 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(fib(n));
    }

    private static int fib(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i <= n; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 15746;
        }
        return arr[n-1];
    }
}
