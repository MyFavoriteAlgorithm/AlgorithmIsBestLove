package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class BOJ_2012_등수매기기 {

    static int size;
    static int[] arr;
    static long result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        size = Integer.parseInt(br.readLine());
        arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        for (int i = 1; i <= size; i++) {
            int dis = Math.abs(arr[i - 1] - i);
            result += dis;
        }
        System.out.println(result);
    }
}
