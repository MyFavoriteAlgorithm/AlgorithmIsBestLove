package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class BOJ_1931_회의실배정 {

    static int[][] timeArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int cnt = Integer.parseInt(br.readLine());

        timeArr = new int[cnt][2];
        for (int i = 0; i < cnt; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            timeArr[i][0] = Integer.parseInt(st.nextToken());
            timeArr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(timeArr, (o1, o2) -> {
            if(o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });

        int temp = 0;
        int result = 0;
        for (int i = 0; i < cnt; i++) {
            if (timeArr[i][0] >= temp) {
                temp = timeArr[i][1];
                result++;
            }
        }
        System.out.println(result);

    }

}