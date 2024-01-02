package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class BOJ_1541_잃어버린괄호 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String[] minusSub = br.readLine().split("-");

        List<Integer> resultList = new ArrayList<>();
        Integer result;

        for (String s : minusSub) {
            int temp = 0;
            String[] plusSub = s.split("\\+");

            for (String string : plusSub) {
                temp += Integer.parseInt(string);
            }
            resultList.add(temp);
        }

        result = resultList.get(0);

        for (int i = 1; i < resultList.size(); i++) {
            result -= resultList.get(i);
        }

        System.out.println(result);
    }

}
