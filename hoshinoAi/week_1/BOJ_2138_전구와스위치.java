package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class BOJ_2138_전구와스위치 {

    static int size;
    static int[] beforeArr;
    static int[] afterArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        size = Integer.parseInt(br.readLine());
        beforeArr = new int[size];
        afterArr = new int[size];

        String input = br.readLine();
        for (int i = 0; i < size; i++) {
            beforeArr[i] = input.charAt(i) - '0';
        }
        input = br.readLine();
        for (int i = 0; i < size; i++) {
            afterArr[i] = input.charAt(i) - '0';
        }

        int[] temp = Arrays.copyOf(beforeArr, size);
        temp[0] = 1 - temp[0];
        temp[1] = 1 - temp[1];

        int answer = solve(size, beforeArr, afterArr);
        int answer2 = solve(size, temp, afterArr);
        if (answer2 != -1) answer2++;

        if (answer == -1)
            System.out.println(answer2);
        else if (answer2 == -1)
            System.out.println(answer);
        else
            System.out.println(Math.min(answer2, answer));
    }

    static int solve(int n, int[] a, int[] b) {
        int cnt = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != b[i]) {
                cnt++;
                a[i] = 1 - a[i];
                a[i + 1] = 1 - a[i+1];
                if (i != n - 2)
                    a[i + 2] = 1 - a[i + 2];
            }
        }

        return a[n - 1] != b[n - 1] ? -1 : cnt;

    }
}
