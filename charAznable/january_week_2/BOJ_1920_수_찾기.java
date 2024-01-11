package january_week_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_1920_수_찾기 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Map<Integer, Boolean> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(in.nextInt(), true);
        }

        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            Boolean temp = map.getOrDefault(in.nextInt(), false);

            if (temp) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }

    }
}
