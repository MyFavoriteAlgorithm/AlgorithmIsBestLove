package january_week_3;

import java.util.Scanner;

public class BOJ_1946_신입 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for(int i = 0; i < T; i++){
            int m = in.nextInt();
            int count = 1;
            int[] work = new int[m+1];
            for(int j = 0; j < m; j++){
                int a = in.nextInt();
                int b = in.nextInt();
                work[a] = b;
            }
            int vot = work[1];
            for(int j = 2; j <= m; j++){
                if(work[j] < vot){
                    vot = work[j];
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
