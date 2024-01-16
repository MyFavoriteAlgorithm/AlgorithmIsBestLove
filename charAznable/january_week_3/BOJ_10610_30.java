package january_week_3;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_10610_30 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.next();
        String[] split = number.split("");

        Queue<Integer> q = new PriorityQueue<>((o1, o2) -> o2-o1);
        long total = 0;
        for (String s : split) {
            int temp = Integer.parseInt(s);
            total += temp;
            q.offer(temp);
        }

        if (!number.contains("0") || total % 3 != 0) {
            System.out.println("-1");
            return;
        }

        StringBuilder sb = new StringBuilder();
        while (!q.isEmpty()) {
            sb.append(q.poll());
        }

        System.out.println(sb);

    }

}
