package week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class BOJ_2170_선긋기 {

    static int size;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        size = Integer.parseInt(br.readLine());
        arr = new int[size][2];
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }
            return o1[0] - o2[0];
        });

        int min = arr[0][0];
        int max = arr[0][1];
        int result = 0;

        for (int i = 1; i < size; i++) {
            if (max >= arr[i][1]) {
                continue;
            }
            if (max >= arr[i][0] && max < arr[i][1]) {
                max = arr[i][1];
            }
            if (max < arr[i][0]) {
                result += max - min;
                min = arr[i][0];
                max = arr[i][1];
            }
        }
        result += max - min;
        System.out.println(result);
    }

}
