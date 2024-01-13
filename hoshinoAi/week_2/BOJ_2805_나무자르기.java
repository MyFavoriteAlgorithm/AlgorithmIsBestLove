package week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class BOJ_2805_나무자르기 {

    static int size;
    static int tree;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        size = Integer.parseInt(st.nextToken());
        tree = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int max = arr[size - 1];
        int min = 0;
        int mid = 0;

        while (max >= min) {
            mid = (max + min) / 2;
            long temp = 0;
            for (int i = 0; i < size; i++) {
                if(arr[i] > mid) {
                    temp += arr[i] - mid;
                }
            }
            if (temp >= tree) {
                min = mid + 1;
            }
            if (temp < tree) {
                max = mid - 1;
            }
        }
        System.out.println(max);
    }

}
