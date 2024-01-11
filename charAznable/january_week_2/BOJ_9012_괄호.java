package january_week_2;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_9012_괄호 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String input = in.next();
            if (isYes(input)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    private static boolean isYes(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {

            char c = input.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (stack.empty()) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
