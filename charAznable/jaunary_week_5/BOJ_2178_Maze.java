package jaunary_week_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178_Maze {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        char[][] miro = new char[n][m];
        int[][] distance = new int[n][m];
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};
        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                miro[i][j] = line.charAt(j);
                distance[i][j] = -1;
            }
        }

        queue.offer(new Pair(0, 0));
        distance[0][0] = 0;

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = pair.x + dx[i];
                int ny = pair.y + dy[i];

                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
                    continue;
                }
                if (miro[nx][ny] == '0' || distance[nx][ny] != -1) {
                    continue;
                }
                queue.offer(new Pair(nx, ny));
                distance[nx][ny] = distance[pair.x][pair.y] + 1;
            }
        }

        System.out.println(distance[n-1][m-1] + 1);

    }

    public static class Pair{
        int x, y;

        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
