package january_week_3;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2012_예상_등수 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.offer(in.nextInt());
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.abs(i - queue.poll());
        }

        System.out.println(sum);
    }
}
