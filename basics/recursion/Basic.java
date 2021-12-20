package basics.recursion;

import java.util.Scanner;

public class Basic {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        var basic = new Basic();
        // int num = sc.nextInt();
        // int res = recursivePalindrome(num, 0);
        // System.out.println(res);
        // if (res == num)
        // System.out.println(num + " is a palindrome");
        // else
        // System.out.println(num + " is not a palindrome");

        // basic.recurseToZero(sc.nextInt());
        // without reqursion get powers
        // System.out.print(basic.getPowerFor(sc.nextInt(), sc.nextInt()));
        // with reqursion get powers
        // System.out.print(basic.getPower(sc.nextInt(), sc.nextInt()));

        // System.out.print(basic.getArithmenticSeq(sc.nextInt()));

        sc.close();

    }

    int getArithmenticSeq(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getArithmenticSeq(n - 1);
        }
    }

    int getPower(int m, int n) {
        // m* m *m *m until n time
        if (n == 0) {
            return 1;
        } else {
            return m * getPower(m, n - 1);
        }
    }

    int getPowerFor(int m, int n) {
        int res = 1;
        while (n != 0) {
            res = res * m;
            n--;
        }
        return res;
    }

    void recurseToZero(int n) {
        if (n == 0)
            System.out.print("0 ");
        else {
            System.out.print(n + " ");
            if (n > 0)
                recurseToZero(n - 1);
            else
                recurseToZero(n + 1);
        }

    }

    static int recursivePalindrome(int num, int temp) {
        if (num == 0)
            return temp;

        else {
            temp = temp * 10 + num % 10;
            return recursivePalindrome(num / 10, temp);
        }
    }
}
