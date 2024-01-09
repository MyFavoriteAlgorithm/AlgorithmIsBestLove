package january_week_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_10816_숫자카드2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int input = in.nextInt();
            sb.append(map.getOrDefault(input, 0)).append(" ");
        }
        System.out.println(sb);
    }
}