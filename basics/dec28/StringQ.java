package basics.dec28;

import java.util.Scanner;

public class StringQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printOrder(s);
    }

    static void getMidThree(String s) {
        if (s.length() > 7) {
            System.out.println(s.substring(s.length() / 2 - 1, s.length() / 2 + 2));
        } else
            System.out.println("NOT LONG ENOUGH");
    }

    static void printOrder(String s) {
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) >= 'a' && s.charAt(i) < 'z') {
                System.out.print(s.charAt(i));
            }
            // System.out.print(" " + (int) s.charAt(i));
            i++;
        }
        i =0;
        while (i < s.length()) {
            if (s.charAt(i) >= 'A' && s.charAt(i) < 'Z') {
                System.out.print(s.charAt(i));
            }
            // System.out.print(" " + (int) s.charAt(i));
            i++;
        }
    }
}
