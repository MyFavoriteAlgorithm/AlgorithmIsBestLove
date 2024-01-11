package january_week_2;

import java.util.Scanner;

public class BOJ_2839_설탕_배달 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 4 || n == 7) {
            System.out.println(-1);
        }
        else if (n % 5 == 0) {
            System.out.println(n / 5);
        }
        else if (n % 5 == 1 || n % 5 == 3) {
            System.out.println((n / 5) + 1);
        }
        else if (n % 5 == 2 || n % 5 == 4) {
            System.out.println((n / 5) + 2);
        }
    }
}
