package week_1;

import java.util.Scanner;

public class BOJ_1037_약수 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            if (input > max) {
                max = input;
            }
            if (input < min) {
                min = input;
            }
        }

        System.out.println(max*min);
    }
}
