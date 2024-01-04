package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class BOJ_12845_모두의마블 {

    static int cnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        cnt = Integer.parseInt(br.readLine());

        arr = new int[cnt];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Arrays.stream(arr).max().getAsInt();
        int result = 0;

        for (int i = 0; i < cnt; i++) {
            result += arr[i];
        }

        result += max * (cnt - 2);

        System.out.println(result);
    }

}
