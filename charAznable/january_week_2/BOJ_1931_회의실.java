package january_week_2;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1931_회의실 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = in.nextInt();
            arr[i][1] = in.nextInt();
        }

        Arrays.sort(arr, (e1, e2) -> {
            if(e1[1] == e2[1]) {
                return e1[0] - e2[0];
            } else {
                return e1[1] - e2[1];
            }
        });

        int cnt = 0;
        int prev_end_time = 0;
        for(int i = 0; i < n; i++) {
            if(prev_end_time <= arr[i][0]) {
                prev_end_time = arr[i][1];
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
