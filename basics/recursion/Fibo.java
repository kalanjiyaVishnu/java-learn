package basics.recursion;

import java.util.Scanner;

class Fibo {
    static int n1 = 0, n2 = 1, n3 = 0;

    static void printFibReq(int count) {

        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibReq(count - 1);
        }
    }

    void printFib(int n) {
        int firstNum = 0, secondNum = 1;

        if (n > 1) {
            System.out.print("0 1 ");
            for (int i = 0; i < n; i++) {
                int res = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = res;
                System.out.print(res + " ");
            }
        } else {
            System.out.print(n == 0 ? "0" : "1");
        }
    }

    int printFibReq1(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return printFibReq1(n - 1) + printFibReq1(n - 1);
    }

    public static void main(String[] args) {
        // System.out.println(printFib(2));
        // printFibReq(2);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        var fibo = new Fibo();
        // fibo.printFib(n);

        // perfect req
        for (int i = 0; i < n; i++)
            System.out.print(fibo.printFibReq1(i) + " ");
        sc.close();
    }
}
