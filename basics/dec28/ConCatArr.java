import java.util.Arrays;

public class ConCatArr {
    public static void main(String[] args) {
        String s[] = { "e", "ty", "w" };
        String s1[] = { "gh", "ler", "ads" };

        if (s.length == s1.length) {
            for (int i = 0; i < s.length; i++) {
                s1[i] = s[i] + s1[i];
            }
            System.out.println(Arrays.toString(s1));
        } else
            System.out.println("NO WAY BRO");
    }
}
