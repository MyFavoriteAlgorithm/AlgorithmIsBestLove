package january_week_2;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1026_보물 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Queue<Integer> queue1 = new PriorityQueue<>();
        Queue<Integer> queue2 = new PriorityQueue<>((o1, o2) -> o2-o1);

        for (int i = 0; i < n; i++) {
            queue1.offer(in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            queue2.offer(in.nextInt());
        }

        int sum = 0;
        while(!queue1.isEmpty() && !queue2.isEmpty()) {
            int temp = queue1.poll() * queue2.poll();
            sum += temp;
        }

        System.out.println(sum);
    }
}
