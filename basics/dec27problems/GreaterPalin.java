package basics.dec27problems;

import java.util.Scanner;

public class GreaterPalin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (true) {
            if (isPalindrome(num)) {
                System.out.println("the greatest palindrome is " + num);
                break;
            }
            num++;
        }

    }

    static boolean isPalindrome(int num) {
        int numTemp = num;
        int temp = 0;
        while (numTemp > 0) {
            temp = temp * 10 + numTemp % 10;
            numTemp = numTemp / 10;
        }
        if (num == temp)
            return true;
        return false;
    }
}
