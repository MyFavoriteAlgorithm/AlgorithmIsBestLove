package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_5585_거스름돈 {

    static int[] changes = {500, 100, 50, 10, 5, 1};
    static int taroMoney = 1000;
    static int result = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());

        int change = taroMoney - price;

        for (int i : changes) {
            result += change / i;
            change = change % i;

        }

        System.out.println(result);
    }
}
