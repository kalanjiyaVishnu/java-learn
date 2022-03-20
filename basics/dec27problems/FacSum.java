import java.util.Scanner;
public class FacSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");
                sum += i;
            }
        }
        System.out.println("THE SUM IS " + sum);
        System.out.println(sum % num == 0 ? "the sum is divivsible" : "sum is not divivsible");
    }
}