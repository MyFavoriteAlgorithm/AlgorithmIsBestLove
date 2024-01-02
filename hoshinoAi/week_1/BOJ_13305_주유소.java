package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class BOJ_13305_주유소 {

    static long[] distanceArr;
    static long[] gasStationArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int civilCnt = Integer.parseInt(br.readLine());

        String distance = br.readLine();
        StringTokenizer st = new StringTokenizer(distance);
        distanceArr = new long[civilCnt - 1];
        for (int i = 0; i < civilCnt - 1; i++) {
            distanceArr[i] = Integer.parseInt(st.nextToken());
        }

        String cost = br.readLine();
        st = new StringTokenizer(cost, " ");
        gasStationArr = new long[civilCnt];
        for (int i = 0; i < civilCnt - 1; i++) {
            gasStationArr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < civilCnt - 1; i++) {
            if (gasStationArr[i] < gasStationArr[i + 1]) {
                gasStationArr[i + 1] = gasStationArr[i];
            }
        }

        long result = 0;

        for (int i = 0; i < civilCnt - 1; i++) {
            result += gasStationArr[i] * distanceArr[i];
        }
        System.out.println(result);
    }

}
