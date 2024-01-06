package week_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.System.in;

public class BOJ_1244_스위치켜고끄기 {

    static int size;
    static int[] lightArr;
    static int personCnt;
    static List<Map<Sex, Integer>> personList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        size = Integer.parseInt(br.readLine());

        lightArr = new int[size];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            lightArr[i] = Integer.parseInt(st.nextToken());
        }

        personCnt = Integer.parseInt(br.readLine());
        for (int i = 0; i < personCnt; i++) {
            st = new StringTokenizer(br.readLine());
            Map<Sex, Integer> map = new HashMap<>();
            map.put(Sex.judge(Integer.parseInt(st.nextToken())), Integer.parseInt(st.nextToken()));
            personList.add(map);
        }

        for (Map<Sex, Integer> map : personList) {
            if (map.keySet().iterator().next().equals(Sex.MAN)) {
                Integer num = map.get(Sex.MAN);
                int temp = num;
                for (int i = 0; i < size / num; i++) {
                    if (lightArr[temp - 1] == 0) {
                        lightArr[temp - 1] = 1;
                    } else {
                        lightArr[temp - 1] = 0;
                    }
                    temp += num;
                }
            }
            if (map.keySet().iterator().next().equals(Sex.WOMAN)) {
                Integer num = map.get(Sex.WOMAN);
                lightArr[num - 1] = lightArr[num - 1] == 0 ? 1 : 0;
                for(int j = 1; j < size / 2; j++) {
                    if(num - 1 + j >= size || num - 1 - j < 0)
                        break;
                    if(lightArr[num - 1 - j] == lightArr[num - 1 + j]) {
                        lightArr[num - 1 - j] = lightArr[num - 1 - j] == 0 ? 1 : 0;
                        lightArr[num - 1 + j] = lightArr[num - 1 + j] == 0 ? 1 : 0;
                    }
                    else break;
                }
            }

        }
        for(int i = 0; i < size; i++) {
            System.out.print(lightArr[i] + " ");
            if((i + 1) % 20 == 0)
                System.out.println();
        }
    }

    public enum Sex {
        MAN,
        WOMAN;

        public static Sex judge(int flag) {
            if (flag == 1) {
                return MAN;
            }
            return WOMAN;
        }
    }
}
