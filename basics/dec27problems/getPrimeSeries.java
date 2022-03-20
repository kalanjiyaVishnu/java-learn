package basics.dec27problems;

import java.util.Scanner;

public class getPrimeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 2; i <= num; i++)
            System.out.println(isPrime(i) && "" i);
    }

    static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                // System.out.println("not a palindrome");
                return false;
            }
        }
        return true;
        // System.out.println("it is a palindrome");
    }
}
