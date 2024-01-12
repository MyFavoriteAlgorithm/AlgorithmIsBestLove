package january_week_2;

public class BOJ_4673_셀프_넘버 {

    public static void main(String[] args) {
        boolean[] check = new boolean[10001];

        for (int i = 0; i < 10001; i++) {
            int n = d(i);

            if (n < 10001) {
                check[n] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            if (!check[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }

    private static int d(int i) {
        int sum = i;

        while (i != 0) {
            sum = sum + (i % 10);
            i = i / 10;
        }

        return sum;
    }
}
