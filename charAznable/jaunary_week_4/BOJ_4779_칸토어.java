package jaunary_week_4;

import java.util.Scanner;

public class BOJ_4779_칸토어 {

    static StringBuilder sb;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int n = in.nextInt();
            int number = (int) Math.pow(3, n);
            sb = new StringBuilder();
            sb.append("-".repeat(Math.max(0, number)));

            fun(0, number);
            System.out.println(sb);
        }

    }

    private static void fun(int index, int size) {
        if (size == 1) {
            return;
        }
        int newSize = size / 3;
        for(int i = index+newSize; i < index + newSize*2; i++) {
            sb.setCharAt(i, ' ');
        }

        fun(index, newSize);
        fun(index + newSize*2, newSize);
    }
}
