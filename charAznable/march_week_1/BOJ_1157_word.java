package march_week_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_1157_word {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] next = in.next().toUpperCase().split("");

        Map<String, Integer> map = new HashMap<>();
        int max = 0;

        for (String s : next) {
            map.put(s, map.getOrDefault(s, 0) + 1);
            if (map.get(s) > max) {
                max = map.get(s);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String s : map.keySet()) {
            if(map.get(s) == max) {
                sb.append(s);
            }
        }

        if (sb.length() > 1) {
            System.out.println("?");
        } else {
            System.out.println(sb);
        }
    }
}
