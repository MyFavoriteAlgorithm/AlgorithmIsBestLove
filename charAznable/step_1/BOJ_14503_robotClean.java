package step_1;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_14503_robotClean {

    static int n, m, r, c, d;
    static int[][] arr;
    static int count = 1;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        arr = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        clean(r, c, d);

        System.out.println(count);
    }

    public static void clean(int x, int y, int dir) {

        arr[x][y] = -1;

        for(int i = 0; i < 4; i++) {
            dir = (dir+3)%4;

            int nx = x + dx[dir];
            int ny = y + dy[dir];
            if(nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if(arr[nx][ny] == 0) {
                    count++;
                    clean(nx, ny, dir);
                    return;
                }
            }
        }

        int d = (dir + 2) % 4;
        int bx = x + dx[d];
        int by = y + dy[d];
        if(bx >= 0 && by >= 0 && bx < n && by < m && arr[bx][by] != 1) {
            clean(bx, by, dir);
        }
    }
}
