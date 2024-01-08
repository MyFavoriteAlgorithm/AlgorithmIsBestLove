package january_week_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_9375_신해빈 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            int N = in.nextInt();
            Map<String, Integer> map = new HashMap<>();
            for (int j = 0; j < N; j++) {
                String input = in.next();
                String input2 = in.next();
                map.put(input2, map.getOrDefault(input2, 0) + 1);
            }
            int sum = 1;
            for (String s : map.keySet()) {
                sum *= (map.get(s) + 1);
            }
            System.out.println(sum - 1);
        }
    }
}
