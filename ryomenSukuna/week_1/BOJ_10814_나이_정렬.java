package week_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_10814_나이_정렬 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[][] arr = new String[n][2];


        for(int i = 0; i < n; i++) {
            arr[i][0] = in.next();
            arr[i][1] = in.next();
        }

        Arrays.sort(arr, Comparator.comparingInt(s -> Integer.parseInt(s[0])));

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }


    }
}
