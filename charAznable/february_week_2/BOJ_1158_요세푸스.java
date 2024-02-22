package february_week_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1158_요세푸스 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        int i = 0;
        List<String> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            i++;
            Integer temp = queue.poll();
            if (i % k == 0) {
                result.add(String.valueOf(temp));
            } else {
                queue.offer(temp);
            }
        }

        String join = String.join(", ", result);
        String format = "<%s>";
        System.out.printf(format, join);
    }
}
