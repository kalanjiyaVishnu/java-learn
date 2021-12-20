package basics.problems;

import java.util.Scanner;

public class Denomination {
    int[] denos = { 100, 50, 10, 5, 2, 1 };

    int getDenomination(int money) {

        int count = 0, i = 0;
        // while (deno > 0 && res > 0) {
        // rem = 0;
        // if (deno > 100) {
        // rem += deno % 100;
        // deno = deno / rem * 100;
        // } else if (deno >= 50) {
        // rem += deno % 50;
        // deno = deno / rem * 50;

        // } else if (deno >= 10) {
        // rem += deno % 10;
        // deno = deno / rem * 10;
        // } else if (deno >= 5) {
        // rem += deno % 5;
        // deno = deno / rem * 5;
        // } else if (deno >= 2) {
        // rem += deno % 2;
        // deno = deno / rem * 2;
        // } else {
        // rem += deno;
        // deno = 0;
        // }
        // res += rem;

        // }
        while (money != 0 && i < denos.length) {
            if (money < denos[i]) {
                i++;
                continue;
            }
            count += money / denos[i];
            money = money % denos[i];
            i++;
        }
        return count;

    }

    public static void main(String[] args) {
        var denomination = new Denomination();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(denomination.getDenomination(sc.nextInt()));
        }
    }
}
