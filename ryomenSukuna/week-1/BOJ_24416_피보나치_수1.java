package week1;

import java.util.Scanner;

public class BOJ_24416_피보나치_수1 {

    static int count1;
    static int count2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        count1 = 0;
        count2 = 0;

        fun1(n);
        fun2(n);

        System.out.println(count1 + " " + (n-2));

    }

    private static int fun1(int n) {
        if (n == 1 || n == 2) {
            count1++;
            return 1;
        }
        return fun1(n-1) + fun1(n-2);
    }

    private static int fun2(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            count2++;
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n-1];
    }

}
