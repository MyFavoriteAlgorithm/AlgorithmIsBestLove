package january_week_1;

import java.util.Scanner;

public class BOJ_2108_통계학 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[8001];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int middle = 1000000;
        int jaju = 100000;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            sum += input;

            arr[input + 4000]++;

            if (max < input) {
                max = input;
            }
            if (min > input) {
                min = input;
            }
        }

        int count = 0;
        int jaua_count = 0;

        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (arr[i] > 0) {
                if (count < (n+1)/2) {
                    count += arr[i];
                    middle = i - 4000;
                }
                if (jaua_count < arr[i]) {
                    jaua_count = arr[i];
                    jaju = i - 4000;
                    flag = true;
                } else if (jaua_count == arr[i] && flag) {
                    jaju = i - 4000;
                    flag = false;
                }
            }
        }

        System.out.println((int)Math.round((double)sum / n));
        System.out.println(middle);
        System.out.println(jaju);
        System.out.println(max - min);

    }
}
