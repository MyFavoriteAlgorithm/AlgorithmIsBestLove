package jaunary_week_5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_1260_bfsAndDfs {

    static int[][] treeArray;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();

        treeArray = new int[n+1][n+1];

        for (int i = 0; i < m; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            treeArray[a][b] = 1;
            treeArray[b][a] = 1;
        }

        visited = new boolean[n+1];
        dfs(k);

        System.out.println();

        visited = new boolean[n+1];
        bfs(k);
    }

    private static void dfs(int k) {
        visited[k] = true;
        System.out.print(k + " ");

        if (k == treeArray.length) {
            return;
        }

        for (int i = 1; i < treeArray.length; i++) {
            if (treeArray[k][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    private static void bfs(int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(k);
        visited[k] = true;

        System.out.print(k + " ");

        while (!queue.isEmpty()) {
            int n = queue.poll();
            for (int i = 1; i < treeArray.length; i++) {
                if (treeArray[n][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    System.out.print(i + " ");
                    queue.offer(i);
                }
            }
        }
    }
}
