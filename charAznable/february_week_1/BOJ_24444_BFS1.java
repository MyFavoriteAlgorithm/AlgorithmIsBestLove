package february_week_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_24444_BFS1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int r = in.nextInt();

        ArrayList<Integer>[] arr = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<>();
        }

        while(m-- > 0) {
            int a = in.nextInt();
            int b = in.nextInt();

            arr[a].add(b);
            arr[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(arr[i]);
        }

        int[] check = new int[n + 1];
        Queue<Integer> q = new LinkedList<>();
        q.add(r);
        int depth = 1;
        check[r] = depth;
        while(!q.isEmpty()) {
            int x = q.poll();
            for (int i = 0; i < arr[x].size(); i++) {
                int h = arr[x].get(i);
                if (check[h] == 0) {
                    depth += 1;
                    check[h] = depth;
                    q.add(h);
                }
            }
        }

        for (int i = 1; i < check.length; i++) {
            System.out.println(check[i]);
        }
    }

}
