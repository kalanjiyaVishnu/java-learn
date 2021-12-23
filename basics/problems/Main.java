package basics.problems;

import java.util.Scanner;

public class Main {
    boolean isSpyNumber(int n) {
        System.out.println(n);
        int sum_res = 0, mul_res = 1;
        while (n > 0) {
            int rem = n % 10;
            mul_res = mul_res * rem;
            sum_res = sum_res + rem;
            n = n / 10;
        }
        if (sum_res == mul_res)
            return true;
        return false;
    }

    boolean isBuzz(int number) {
        // if (n % 10 == 7 || n % 7 == 0)
        // return true;
        // return false;
        if (number % 10 == 7 || number % 7 == 0)
            return true; // returns true when the number is Buzz
        else
            return false; // returns flase when the number is
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var Main = new Main();
        // System.out.println(Main.isSpyNumber(sc.nextInt()));
        System.out.println(Main.isBuzz(sc.nextInt()));
    }
}
