package january_week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ_1927_최소_힙 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(x -> x));

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            if(input == 0){
                if(queue.isEmpty()) System.out.println("0");
                else System.out.println(queue.poll());
            }else{
                queue.add(input);
            }
        }
    }
}
