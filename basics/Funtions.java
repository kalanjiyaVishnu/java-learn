package basics;

import java.util.Scanner;

public class Funtions {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        var func = new operations();
        System.out.println(func.getSum(1, 2, 6, 7, 7, 57, 456, 345, 34, 5345, 345, 345, 345));
        char arr[] = sc.nextLine().toCharArray();
        System.out.println(func.findMid(arr));
    }

    public static class operations {
        public int getSmall() {
            return 1;
        }

        public char findMid(char[] s) {
            return s[s.length / 2];
        }

        float getSum(int... a) {
            int sum = 0;
            for (int i : a)
                sum += i;
            return sum;
        }
    }
}
