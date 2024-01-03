package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class BOJ_15903_카드합체 {

    static int cnt;
    static int shuffleCnt;
    static long[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        cnt = Integer.parseInt(st.nextToken());
        shuffleCnt = Integer.parseInt(st.nextToken());

        arr = new long[cnt];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < shuffleCnt; i++) {
            Arrays.sort(arr);
            long sum = arr[0] + arr[1];
            arr[0] = sum;
            arr[1] = sum;
        }

        long ans = 0;

        for(int i = 0; i < cnt; i++) {
            ans += arr[i];
        }
        System.out.println(ans);

    }
}
