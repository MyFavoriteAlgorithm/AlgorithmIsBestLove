package week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class BOJ_2847_게임을만든동준이 {

    static int size;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        size = Integer.parseInt(br.readLine());

        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int result = 0;
        for (int i = size - 1; i > 0; i--) {
            if (arr[i] <= arr[i - 1]) {
                result += arr[i - 1] - (arr[i] - 1);
                arr[i - 1] = arr[i] - 1;
            }
        }

        System.out.println(result);
    }

}
