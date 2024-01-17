package january_week_3;

import java.util.Scanner;

public class BOJ_1439_뒤집기 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();

        String[] split = input.split("");

        int count = -1;
        String temp = "";
        for (String s : split) {
            if (!s.equals(temp)) {
                count++;
            }
            temp = s;
        }

        System.out.println(count/2 + count%2);
    }
}
