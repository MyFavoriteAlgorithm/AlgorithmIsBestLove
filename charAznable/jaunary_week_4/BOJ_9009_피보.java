package jaunary_week_4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class BOJ_9009_피보 {

    static int[] dp = new int[50];
    static int endIdx;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i < dp.length; i++){
            dp[i] = dp[i - 2] + dp[i - 1];
            if(dp[i] > 1000000000){
                endIdx = i;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            List<Integer> list = new LinkedList<>();

            for(int j = endIdx; j >= 0; j--){
                if(input == 0) break;
                if(input >= dp[j]){
                    list.add(dp[j]);
                    input -= dp[j];
                }
            }

            Collections.sort(list);
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
