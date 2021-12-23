package dataStructures;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        var Stack = new StackImpl(5);
        char opt = sc.nextLine().charAt(0);
        System.out.println("1.insert\t2.delete \t3.getMax");
        switch (opt) {
            case '1':
                Stack.push(sc.nextInt());
                break;
            case '2':
                Stack.getMax();
            default:
                break;
        }

        Stack.push(2);
        Stack.diplay();
    }
}