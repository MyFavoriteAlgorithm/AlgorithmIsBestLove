package week_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_1158_요세푸스문제 {

    static int cnt;
    static int num;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

         cnt = Integer.parseInt(st.nextToken());
         num = Integer.parseInt(st.nextToken());

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= cnt; i++) {
            q.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(q.size() != 1) {
            for (int i = 0; i < num - 1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll() + ", ");
        }

        sb.append(q.poll() + ">");

        bw.write(sb + "\n");
        bw.flush();
        bw.close();
    }
}
