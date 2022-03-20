package basics.dec27problems;

import java.util.Arrays;

public class StrRot {
    // array rotation
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println(Arrays.toString(arr));
        leftRotation(arr);
        leftRotation(arr);
        rightRotation(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void leftRotation(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];
        arr[arr.length - 1] = temp;
    }
}
