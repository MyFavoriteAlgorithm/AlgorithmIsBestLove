package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class BOJ_2212_센서 {

    static int sensorCnt;
    static int centerCnt;
    static int[] xArr;
    static int[] tempArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        sensorCnt = Integer.parseInt(br.readLine());
        centerCnt = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        xArr = new int[sensorCnt];
        tempArr = new int[sensorCnt - 1];
        for (int i = 0; i < sensorCnt; i++) {
            xArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(xArr);

        for (int i = 0; i < sensorCnt - 1; i++) {
            tempArr[i] = xArr[i + 1] - xArr[i];
        }
        Arrays.sort(tempArr);

        int result = 0;
        for (int i = 0; i < tempArr.length - centerCnt + 1; i++) {
            result += tempArr[i];
        }
        System.out.println(result);

    }

}
