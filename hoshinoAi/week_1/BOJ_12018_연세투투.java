package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.in;

public class BOJ_12018_연세투투 {

    static int subject;
    static int totalPoint;
    static List<Integer> pointList = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        subject = Integer.parseInt(st.nextToken());
        totalPoint = Integer.parseInt(st.nextToken());

        for (int i = 0; i < subject; i++) {
            st = new StringTokenizer(br.readLine());
            int peopleCnt = Integer.parseInt(st.nextToken());
            int maxPeople = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] mileArr = new int[peopleCnt];
            for (int j = 0; j < peopleCnt; j++) {
                mileArr[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(mileArr);

            if (peopleCnt < maxPeople) {
                pointList.add(1);
                continue;
            }

            pointList.add(mileArr[peopleCnt - maxPeople]);
        }

        Collections.sort(pointList);
        int result = 0;
        int temp = 0;
        for (Integer i : pointList) {
            temp += i;
            if (totalPoint < temp) {
                break;
            }
            result++;
        }
        System.out.println(result);
    }

}
