package march_week_1;

import java.util.Scanner;

public class BOJ_10431_jul {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        for (int i = 0; i < tc; i++) {

            int tn = in.nextInt();

            int cnt = 0;
            int[] num = new int[20];

            for (int j=0; j<20; j++) {
                num[j] = in.nextInt();
            }

            for (int j=0; j<20; j++) {
                for (int k=0; k<j; k++) {
                    if (num[k] > num[j]) cnt++;
                }
            }

            System.out.println(tn + " " + cnt);
        }
    }
}
