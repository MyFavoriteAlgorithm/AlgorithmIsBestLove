package january_week_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BOJ_1764_듣보잡 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0 ; i < n; i ++) {
            String input = in.next();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        for (int i = 0 ; i < m; i ++) {
            String input = in.next();
            map.put(input, map.getOrDefault(input, 0) + 1);
        }

        List<String> names = new ArrayList<>();

        for (String s : map.keySet()) {
            if (map.get(s) == 2) {
                names.add(s);
            }
        }

        Collections.sort(names);

        System.out.println(names.size());
        for (String name : names) {
            System.out.println(name);
        }
    }
}
