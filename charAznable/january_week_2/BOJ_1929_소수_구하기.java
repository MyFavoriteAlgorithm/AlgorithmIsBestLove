package january_week_2;

import java.util.Scanner;

public class BOJ_1929_소수_구하기 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }

        for (int i = 2; i < Math.sqrt(number) + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
