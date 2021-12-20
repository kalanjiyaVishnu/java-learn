package basics;

public class Patterns {
    public static void main(String[] args) {
        // printSequence(5);
        // printingStars(5);
        printingStarsReverse(5);
        // printingSquareHol(5);

    }

    static void printingStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    static void printingStarsReverse(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--)
                System.out.print("*");
            System.out.println();
        }
    }

    static void printSequence(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(j + 1 + " ");
            System.out.println();
        }
    }

    static void printSequenceRev(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(j + 1 + " ");
            System.out.println();
        }
    }
}
