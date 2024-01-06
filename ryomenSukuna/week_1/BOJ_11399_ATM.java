package week_1;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_11399_ATM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            arr[i] = input;
        }

        Arrays.sort(arr);

        int sum = 0;
        int temp = 0;

        for (int i : arr) {
            temp += i;
            sum += temp;
        }

        System.out.println(sum);
    }

}
