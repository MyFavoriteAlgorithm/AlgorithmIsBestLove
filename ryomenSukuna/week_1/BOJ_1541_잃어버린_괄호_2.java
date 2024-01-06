package week_1;

import java.util.Scanner;

public class BOJ_1541_잃어버린_괄호_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();

        String[] split = input.split("-");

        int[] arr = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            int temp = 0;
            String[] numbers = split[i].split("\\+");

            for (String number : numbers) {
                temp += Integer.parseInt(number);
            }
            arr[i] = temp;

        }

        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            sum -= arr[i];
        }

        System.out.println(sum);
    }
}
