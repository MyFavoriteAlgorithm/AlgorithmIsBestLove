package january_week_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class BOJ_5387_키로거 {

    static LinkedList<Character> linkedList;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            linkedList = new LinkedList<>();
            ListIterator<Character> list = linkedList.listIterator();
            String input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                char c = input.charAt(j);
                switch(c) {
                    case '<' :
                        if(list.hasPrevious()) {
                            list.previous();
                        }
                        break;
                    case '>' :
                        if(list.hasNext()) {
                            list.next();
                        }
                        break;
                    case '-' :
                        if(list.hasPrevious()) {
                            list.previous();
                            list.remove();
                        }
                        break;
                    default :
                        list.add(c);
                }
            }

            StringBuilder sb = new StringBuilder();
            for (char c : linkedList) {
                sb.append(c);
            }
            System.out.println(sb);
        }
    }
}
