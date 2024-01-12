package january_week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1789_수들의_합 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());

        int i = 1;
        while (n >= i) {
            n -= i;
            i++;
        }
        System.out.println(--i);
    }
}
