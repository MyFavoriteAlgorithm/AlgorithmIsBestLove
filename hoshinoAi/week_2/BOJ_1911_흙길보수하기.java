package week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class BOJ_1911_흙길보수하기 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int size = Integer.parseInt(st.nextToken());
        int[][] arr = new int[cnt][2];
        for(int i=0; i<cnt; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0])
                return Integer.compare(o1[1], o2[1]);
            return Integer.compare(o1[0], o2[0]);
        });

        int nulpan = 0;
        int range = 0;
        for(int i=0; i<cnt; i++) {
            if(arr[i][0] > range)
                range = arr[i][0];
            if(arr[i][1] >= range) {
                while(arr[i][1] > range) {
                    range += size;
                    nulpan ++;
                }
            }
        }

        System.out.println(nulpan);
    }

}
