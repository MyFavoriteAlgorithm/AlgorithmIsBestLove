package week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class BOJ_28324_스케이트연습 {

    static int size;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        size = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        long result = 0;
        int temp = 0;
        for (int i = size - 1; i >= 0; i--) {
            if (arr[i] >= temp + 1) {
                temp++;
            } else temp = arr[i];
            result += temp;
        }

        System.out.println(result);
    }

}
