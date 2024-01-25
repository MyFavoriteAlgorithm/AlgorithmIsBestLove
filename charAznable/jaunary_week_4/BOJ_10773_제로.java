package jaunary_week_4;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_10773_제로 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 0 ; i < n; i++) {
            int input = in.nextInt();
            if (input == 0) {
                stack.pop();
            } else {
                stack.push(input);
            }
        }

        int sum = 0;
        for (Integer i : stack) {
            sum += i;
        }

        System.out.println(sum);
    }
}
