import java.util.ArrayList;
import java.util.Scanner;

public class MisMatch {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        getMisMatch(sc.nextLine(), sc.nextLine());
    }

    static void getMisMatch(String s1, String s2) {
        ArrayList<Character> lump = new ArrayList<>();
        int i = 0;

        while (i < s1.length()) {
            Character temp = s1.charAt(i);
            if (lump.contains(temp)) {
                lump.remove(temp);
            } else
                lump.add(temp);
            i++;
        }
        i = 0;
        while (i < s2.length()) {
            Character temp = s2.charAt(i);
            if (lump.contains(temp)) {
                lump.remove(temp);
            } else
                lump.add(temp);
            i++;
        }
        System.out.println(lump);
        System.out.println(s1 + " " + s2);
    }
}
// taking two string and finding the not comm0n string
// input1 = abcde input2 = cab
// de output is 2