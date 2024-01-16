package january_week_3;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1049_기타줄 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c =in.nextInt();

        int[] unit = new int[c];
        int[] pack = new int[c];

        for(int i = 0; i < c; i++){
            pack[i] = in.nextInt();
            unit[i] = in.nextInt();
        }
        Arrays.sort(unit);
        Arrays.sort(pack);

        int min = Math.min(((n/6) + 1) * pack[0], n * unit[0]);
        min = Math.min(min, ((n/6)) * pack[0] + (n % 6) * unit[0]);

        System.out.println(min);
    }
}
