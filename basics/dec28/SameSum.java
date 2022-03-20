public class SameSum {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };
        int[] arr2 = { 4, 3, 2, 1 };
        System.out.println(isHavingSameSum(arr1, arr2));
    }

    static boolean isHavingSameSum(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            int sum = arr1[0] + arr2[0];
            for (int i = 1; i < arr1.length; i++) {
                arr1[i] = arr1[i] + arr2[i];
                if (arr1[i] != sum) {
                    return false;
                }
            }

        }
        return true;
    }
}
// - given two arrays added the i th index gives a sum which is same for all the
// index in the array
// - [1,2,3,4][4,3,2,1] ==> true 1+4 = 5