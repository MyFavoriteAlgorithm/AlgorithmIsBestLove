package march_week_2;

import java.util.Scanner;

public class BOJ_1205_ranking {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int score = in.nextInt();
        int p = in.nextInt();

        int[] arr = new int[p];

        if (n == 0) {
            System.out.println(1);
            return;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int rank = 1;

        if(n == p && score <= arr[arr.length - 1])
            System.out.println(-1);
        else{
            for (int j : arr) {
                if (score < j)
                    rank++;
                else
                    break;
            }
            System.out.println(rank);
        }

    }
}
