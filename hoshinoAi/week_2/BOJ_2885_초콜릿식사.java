package week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;

public class BOJ_2885_초콜릿식사 {

    static int cnt;
    static int size;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        cnt = Integer.parseInt(br.readLine());
        size = 1;

        int k = 0;

        while(size < cnt) size = size * 2;

        StringBuilder sb= new StringBuilder();
        sb.append(size).append(" ");

        while(cnt > 0){
            if(cnt >= size){
                cnt -= size;
            }else{
                size /= 2;
                k++;
            }
        }

        sb.append(k);
        System.out.println(sb);
    }

}
