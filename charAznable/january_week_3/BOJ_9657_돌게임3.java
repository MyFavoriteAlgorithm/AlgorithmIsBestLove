package january_week_3;

import java.util.Scanner;

public class BOJ_9657_돌게임3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        boolean win = (n % 7 == 2) || (n % 7 == 0);

        if (win) {
            System.out.println("CY");
        } else {
            System.out.println("SK");
        }
    }
}
