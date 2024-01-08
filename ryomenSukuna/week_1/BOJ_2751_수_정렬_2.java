package week_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BOJ_2751_수_정렬_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int i : list) {
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
