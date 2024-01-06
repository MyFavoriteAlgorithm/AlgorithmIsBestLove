package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.System.in;

public class BOJ_1459_걷기 {

    static long houseX;
    static long houseY;
    static long block;
    static long crossBlock;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        houseX = Integer.parseInt(st.nextToken());
        houseY = Integer.parseInt(st.nextToken());
        block = Integer.parseInt(st.nextToken());
        crossBlock = Integer.parseInt(st.nextToken());

        long temp1,temp2,temp3;

        temp1 = (houseX + houseY) * block;

        if((houseX + houseY) % 2 == 0) {
            temp2 = Math.max(houseX, houseY) * crossBlock;
        } else {
            temp2 = (Math.max(houseX, houseY) - 1) * crossBlock + block;
        }

        temp3 = (Math.min(houseX, houseY)) * crossBlock + (Math.abs(houseX - houseY)) * block;

        System.out.println(Math.min(temp1, Math.min(temp2, temp3)));


    }

}
