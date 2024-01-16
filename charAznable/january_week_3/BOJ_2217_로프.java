package january_week_3;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_2217_로프 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        int max = calculate(arr, n);
        System.out.println(max);
    }

    private static int calculate(int[] arr, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            int temp = arr[i] * (n - i);
            if (max < temp) {
                max = temp;
            }
        }
        return max;
    }
}
