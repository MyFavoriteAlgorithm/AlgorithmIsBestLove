package march_week_1;

import java.util.Scanner;

public class BOJ_23971_zoac {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int height = (h - 1) / (a + 1) + 1;
        int width = (w - 1) / (b + 1) + 1;

        System.out.println(height * width);

    }
}
