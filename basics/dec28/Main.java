import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String inString = sc.nextLine();
        System.out.println(pandigitalNum(inString, 36));
    }

    // perfect number 6 == 1*2*3 == 6 so it is a perfect number
    // pandigital number
    static boolean pandigitalNum(String inString, int base) {
        // 2456937ABCDESDFASF
        // 0123456789
        // 0010010100
        if (inString.length() > base)
            return false;
        boolean number[] = new boolean[base];
        for (int i = 0; i < inString.length(); i++) {
            if (inString.charAt(i) >= '0' && inString.charAt(i) <= '9')
                number[inString.charAt(i) - '0'] = true;
            else if (inString.charAt(i) - 'A' <= base - 11)
                number[inString.charAt(i) - 'A' + 10] = true;
        }

        for (int i = 0; i < number.length; i++) {
            if (!number[i]) {
                return false;
            }
        }
        return true;
    }
    // [0,0,'i',1,1]
    // left sum and right sum
    // static boolean isLeftEqualRight(String[] arr) {
    // for (String i : arr) {

    // }
    // }

    static void isThreeEqual() {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a % 10 * b % 10 == c % 10) {
            System.out.println("true");
        } else
            System.out.println("false");
    }
}

// Speed: 52.4 (↑+5.6)
// Errors: 6 (↑-6)

// Score: 737 (↑+425)