package basics.dec28;

public class revAddPal {
    // rev the num and add with the input check if it is a palindrome or not
    // 145 which is not a palindrome so add 541 with 145 then 686 which is
    // palindrome
    // if not then continue adding the string to its rev version and then chek it is
    // a palindrome
    public static void main(String[] args) {

        String s = "123";
        isPalindrome(s);
    }

    static boolean isPalindrome(String s) {
        String rev = "";
        int i = 0;
        while (i < s.length()) {
            rev = rev.concat("" + (Character) s.charAt(s.length() - 1));
            i++;
        }
        if (rev.equals(s)) {
            return true;
        }
        System.out.println(rev);
        return false;
    }
}
