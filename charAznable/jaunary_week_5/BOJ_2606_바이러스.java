package jaunary_week_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_2606_바이러스 {

    static int[][] graph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        graph = new int[n+1][n+1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            graph[a][b] = 1;
            graph[b][a] = 1;
        }
        bfs(1);

        System.out.println(count);
    }

    private static void bfs(int i) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        visited[i] = true;

        while(!queue.isEmpty()) {
            int temp = queue.poll();

            for (int k = 1; k < graph.length; k++) {
                if (graph[temp][k] == 1 && !visited[k]) {
                    queue.offer(k);
                    visited[k] = true;
                    count++;
                }
            }
        }
    }
}
