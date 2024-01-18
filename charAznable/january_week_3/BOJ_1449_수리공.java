package january_week_3;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_1449_수리공 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int tape = in.nextInt();
        int count = 0;

        int[] arr = new int[T];

        for (int i = 0; i < T; i++) {
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        int tapeRange = (int)(arr[0] - 0.5 + tape);
        count++;
        for(int i=1; i<arr.length; i++) {
            if (tapeRange < (int)(arr[i] + 0.5)){
                tapeRange = (int)(arr[i] - 0.5 + tape);
                count++;
            }
        }

        System.out.println(count);
    }
}
