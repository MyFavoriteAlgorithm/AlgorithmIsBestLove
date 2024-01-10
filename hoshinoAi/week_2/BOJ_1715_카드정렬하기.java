package week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

import static java.lang.System.in;

public class BOJ_1715_카드정렬하기 {

    static int size;
    static Queue<Integer> queue = new PriorityQueue<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        size = Integer.parseInt(br.readLine());

        for (int i = 0; i < size; i++) {
            queue.offer(Integer.parseInt(br.readLine()));
        }

        if (queue.size() < 2) {
            System.out.println(0);
            return;
        }

        int result = 0;
        while (queue.size() > 2) {
            Integer poll1 = queue.poll();
            Integer poll2 = queue.poll();

            int e = poll1 + poll2;
            result += e;
            queue.offer(e);
        }
        if (queue.size() < 2) {
            result += queue.poll();
            System.out.println(result);
            return;
        }
        result += queue.poll() + queue.poll();
        System.out.println(result);
    }

}
