package jaunary_week_4;

import java.util.Scanner;

public class BOJ_15649_NM {

    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        arr = new int[m];
        visited = new boolean[n];
        dfs(n, m, 0);
    }

    private static void dfs(int n, int m, int depth) {
        if (depth == m) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1);
                visited[i] = false;
            }
        }
    }
}
