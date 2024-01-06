package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class BOJ_1543_문서검색 {

    static String input;
    static String word;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        input = br.readLine();
        int inputLength = input.length();
        word = br.readLine();
        int wordLength = word.length();

        int length = input.replace(word, "").length();

        System.out.println((inputLength - length) / wordLength);
    }

}
