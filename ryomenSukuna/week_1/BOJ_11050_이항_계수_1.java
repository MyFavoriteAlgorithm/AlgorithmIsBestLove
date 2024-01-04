package week_1;

import java.util.Scanner;

public class BOJ_11050_이항_계수_1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int top = 1;
        for (int i = 1; i <= n; i++) {
            top *= i;
        }

        int bottom = 1;

        for (int i = 1; i <= k; i++) {
            bottom *= i;
        }

        for (int i = 1; i <= n-k; i++) {
            bottom *= i;
        }

        System.out.println(top/bottom);

    }
}
