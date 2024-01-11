package january_week_2;

import java.util.Scanner;

public class IMO_BOJ_24060_병합_정렬_1 {

    static int[] temp;
    static int count = 0;
    static int k;
    static int result = -1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        k = in.nextInt();
        temp = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        in.close();

        merge_sort(arr, 0, arr.length - 1);
        System.out.println(result);
    }

    private static void merge_sort(int[] arr, int low, int high) {
        // 기준점이 같이 질 때까지 반복해서 분해-정렬-결합 반복
        if (low < high) {
            int mid = (low + high) / 2;
            merge_sort(arr, low, mid);
            merge_sort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;
        int t = 0;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[t++] = arr[i++];
        }
        while (j <= high) {
            temp[t++] = arr[j++];
        }

        t = 0;
        i = low;

        while(i <= high){
            count++;
            if(count==k){
                result = temp[t];
                break;
            }
            arr[i++] = temp[t++];
        }
    }
}
