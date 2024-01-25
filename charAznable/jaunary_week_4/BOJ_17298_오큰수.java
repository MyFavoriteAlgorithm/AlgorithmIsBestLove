package jaunary_week_4;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BOJ_17298_오큰수 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                arr[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            arr[stack.pop()] = -1;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}
