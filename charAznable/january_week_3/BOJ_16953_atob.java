package january_week_3;

import java.util.Scanner;

public class BOJ_16953_atob {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long from = in.nextLong();
        long to = in.nextLong();
        int count = 1;

        while(from != to) {
            if (to < from) {
                System.out.println(-1);
                return;
            }
            if (to % 2 == 0) {
                to /= 2;
            } else if (to % 10 == 1) {
                to /= 10;
            } else {
                System.out.println(-1);
                return;
            }
            count++;
        }

        System.out.println(count);
    }

}
