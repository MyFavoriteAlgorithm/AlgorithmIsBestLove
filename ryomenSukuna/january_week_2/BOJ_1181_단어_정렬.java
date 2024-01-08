package january_week_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_1181_단어_정렬 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String input = in.next();
            list.add(input);
        }

        list.sort((o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        System.out.println(list.get(0));

        for (int i = 1; i < n; i++) {
            if (!list.get(i).equals(list.get(i-1))) {
                System.out.println(list.get(i));
            }
        }
    }
}
