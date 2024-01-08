package january_week_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BOJ_1620_이다솜 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        StringBuilder sb = new StringBuilder();
        Map<Integer, String> hash1 = new HashMap<>();
        Map<String, Integer> hash2 = new HashMap<>();


        for(int i = 1; i <= n; i++) {
            String S = in.next();
            hash1.put(i, S);
            hash2.put(S, i);
        }

        for(int i = 0; i < m; i++) {
            String S = in.next();
            if(49 <= S.charAt(0) && S.charAt(0) <= 57) {
                sb.append(hash1.get(Integer.parseInt(S))).append("\n");
            }else {
                sb.append(hash2.get(S)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
