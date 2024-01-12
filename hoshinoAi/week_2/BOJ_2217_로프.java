package week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;

public class BOJ_2217_로프 {

    static int size;
    static int[] rope;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        size = Integer.parseInt(br.readLine());
        rope = new int[size];

        for (int i = 0; i < size; i++) {
            rope[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(rope);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            max = Math.max(max, rope[i] * (size - i));
        }

        System.out.println(max);
    }

}
