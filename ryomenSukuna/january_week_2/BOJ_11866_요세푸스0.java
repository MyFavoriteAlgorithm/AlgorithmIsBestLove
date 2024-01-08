package january_week_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_11866_요세푸스0 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = in.nextInt();
        int k = in.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        sb.append('<');
        while(queue.size() > 1) {
            for(int i = 0; i < k - 1; i++) {
                int val = queue.poll();
                queue.offer(val);
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.append(queue.poll()).append('>');
        System.out.println(sb);

    }
}
