package basics.arrays;

import java.util.Arrays;

class Sorts {
    int count = 0;

    public static void main(String[] args) {
        int[] arr = { 15, 16, 8, 6, 5 };
        System.out.println("sorting " + Arrays.toString(arr));

        // bubleSort(arr);
        // insertSort(arr);

        // selectionSort(arr);
        // quickSort(arr, 0, arr.length - 1);// best case o(nlogn) worst case o(n*2)
        // mergeSort(arr, 0, arr.length - 1);
        System.out.println(!Character.isUpperCase('A'));
        System.out.println("after the sort " + Arrays.toString(arr));
        // static
        // System.out.println(new Sorts().getNum());
        // System.out.println(new Sorts().getNum());

    }

    // static void mergeSort(int arr[], int lb, int ub) {
    // if (lb < ub) {
    // int mid = (lb + ub) / 2;
    // mergeSort(arr, lb, mid);
    // mergeSort(arr, mid + 1, ub);
    // merge(arr, lb, mid, ub);
    // }
    // }

    // static void merge(int[] arr, int lb, int mid, int ub) {
    // int i = lb, j = mid + 1, k = lb;
    // int[] b = new int[ub];
    // while (i <= mid && j <= ub) {
    // if (arr[i] <= arr[j]) {
    // b[k] = arr[i];
    // i++;
    // } else {
    // b[k] = arr[j];
    // j++;
    // }
    // k++;
    // }
    // while (j <= ub) {
    // b[k] = arr[j];
    // k++;
    // j++;
    // }
    // while (i <= mid) {
    // b[k] = arr[i];
    // k++;
    // i++;
    // }

    // for (i = lb; i <= ub; i++) {
    // arr[i] = b[i];
    // }
    // }
    // static void merge(int arr[], int l, int m, int r) {
    // // Find sizes of two subarrays to be merged
    // int n1 = m - l + 1;
    // int n2 = r - m;

    // /* Create temp arrays */
    // int L[] = new int[n1];
    // int R[] = new int[n2];

    // /* Copy data to temp arrays */
    // for (int i = 0; i < n1; ++i)
    // L[i] = arr[l + i];
    // for (int j = 0; j < n2; ++j)
    // R[j] = arr[m + 1 + j];

    // /* Merge the temp arrays */

    // // Initial indexes of first and second subarrays
    // int i = 0, j = 0;

    // // Initial index of merged subarray array
    // int k = l;
    // while (i < n1 && j < n2) {
    // if (L[i] <= R[j]) {
    // arr[k] = L[i];
    // i++;
    // } else {
    // arr[k] = R[j];
    // j++;
    // }
    // k++;
    // }

    // /* Copy remaining elements of L[] if any */
    // while (i < n1) {
    // arr[k] = L[i];
    // i++;
    // k++;
    // }

    // /* Copy remaining elements of R[] if any */
    // while (j < n2) {
    // arr[k] = R[j];
    // j++;
    // k++;
    // }
    // }

    // 63 45 52 38 8
    static void quickSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            quickSort(arr, lb, loc - 1);
            quickSort(arr, loc + 1, ub);
        }

    }

    static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb], start = lb, end = ub;
        while (start < end) {

            while (arr[start] <= pivot)
                start++;
            while (arr[end] > pivot)
                end--;
            if (start < end) {
                swap(arr, start, end);
            }
        }
        swap(arr, lb, end);
        return end;
    }

    static void swap(int arr[], int l, int r) {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

    int getNum() {

        return ++count;
    }       

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }

    }

    public static void insertSort(int[] arr) {
        int i, j, cur_ele;
        for (i = 0; i < arr.length; i++) {
            cur_ele = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > cur_ele) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = cur_ele;
        }

    }

    public static void bubleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int pass = 0;
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    pass = 1;
                }

            }
            if (pass == 0)
                break;
        }
    }
}