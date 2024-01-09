package week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_3649_로봇프로젝트 {

    static String s;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while ((s = br.readLine()) != null) {
            int size = Integer.parseInt(s) * 10000000;
            int N = Integer.parseInt(br.readLine());
            int[] list = new int[N];

            for (int i = 0; i < N; i++) {
                list[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(list);

            int left = 0, right = N - 1;
            boolean flag = false;

            while (left < right) {
                int sum = list[left] + list[right];

                if (sum == size) {
                    System.out.printf("yes %d %d\n", list[left], list[right]);
                    flag = true;
                    break;
                } else if (sum > size) {
                    right--;
                } else {
                    left++;
                }
            }

            if (!flag) {
                System.out.println("danger");
            }

            s = null;
        }
    }

}
