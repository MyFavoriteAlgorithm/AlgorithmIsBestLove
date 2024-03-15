package step_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_18111_mine {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nmb = br.readLine().split(" ");
        int x = Integer.parseInt(nmb[0]);
        int y = Integer.parseInt(nmb[1]);
        int inventory = Integer.parseInt(nmb[2]);

        int[][] arr = new int[x][y];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < x; i++) {
            String[] row = br.readLine().split(" ");

            for (int j = 0; j < y; j++) {
                int value = Integer.parseInt(row[j]);
                arr[i][j] = value;
                if (arr[i][j] > max) max = arr[i][j];
                if (arr[i][j] < min) min = arr[i][j];
            }
        }

        int time = Integer.MAX_VALUE;
        int height = 0;
        for (int i = min; i<= max; i++) {

            int tempTime = 0;
            int block = inventory;

            for (int[] ints : arr) {
                for (int anInt : ints) {
                    if (anInt > i) {
                        tempTime += (anInt - i) * 2;
                        block += (anInt - i);
                    }
                    if (anInt < i) {
                        tempTime += (i - anInt);
                        block -= (i - anInt);
                    }
                }
            }

            if(block >= 0) {
                if(tempTime <= time) {
                    time = tempTime;
                    height = i;
                }
            }

        }

        System.out.println(time + " " + height);
    }
}
