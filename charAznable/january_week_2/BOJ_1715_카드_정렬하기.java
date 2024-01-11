package january_week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class BOJ_1715_카드_정렬하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            queue.offer(Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        while (queue.size() != 1) {
            Integer a = queue.poll();
            Integer b = queue.poll();
            int temp = a + b;
            sum += temp;
            queue.offer(temp);
        }

        System.out.println(sum);
    }
}