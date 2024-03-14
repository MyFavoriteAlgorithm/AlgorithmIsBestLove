
public class Main {

    public static void main(String[] args) {
        int i = 1;
        int sum;
        int j;
        int total = 0;
        while (i != 40) {
            sum = 0;
            j = i - 13;
            if (j > 0) {
                sum += j * 1000;
            }

            if (i <= 26) {
                sum += i * 1000;
            }

            System.out.println(sum);
            total += sum;
            i++;
        }
        System.out.println(total);
    }

}