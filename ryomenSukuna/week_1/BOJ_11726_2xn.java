package week_1;

import java.util.Scanner;

public class BOJ_11726_2xn {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int[] arr = new int[1001];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i <= input; i++) {
            arr[i] = (arr[i-1] + arr[i-2]) % 10007;
        }

        System.out.println(arr[input]);
    }
}
