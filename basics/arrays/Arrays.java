package basics.arrays;

import java.util.Scanner;

public class Arrays {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // legth of the max subarray which add up to zero
        // lenMaxOfZero();
        // sortFromIndex();
        binarySearch();
    }

    public static void binarySearch() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int l = 0, r = arr.length - 1, num = -2, mid, present = 0;
        while (l <= r) {
            mid = l + (r - l) / 2;
            if (arr[mid] == num) {
                System.out.println(num + " is at " + mid);
                present = 1;
                break;
            } else if (arr[mid] > num) {
                r = mid - 1;
                System.out.println("too small so must be in the left");
            } else {
                l = mid + 1;
                System.out.println("too big so must be in the right");
            }
        }
        if (present == 0) {
            System.out.println("not in this dark space");
        }
    }

    public static void sortFromIndex() {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int start = sc.nextInt();
        int end = sc.nextInt();
        for (int i = start; i < end; i++) {
            for (int j = i + 1; j <= end; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    public static int lenMaxOfZero() {
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++)
            arr[i] = sc.nextInt();
        int max = 0;
        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; j++) {
                sum += arr[j];
                if (sum == 0)
                    max = Math.max(max, j - i + 1);
            }

        }
        System.out.println(max);
        return max;
    }
}
