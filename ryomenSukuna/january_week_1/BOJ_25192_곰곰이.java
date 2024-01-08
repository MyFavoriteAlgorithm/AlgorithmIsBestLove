package january_week_1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BOJ_25192_곰곰이 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int count = 0;
        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            String input = in.next();
            if (input.equals("ENTER")) {
                count += set.size();
                set = new HashSet<>();
            } else {
                set.add(input);
            }
        }
        count += set.size();

        System.out.println(count);
    }
}
