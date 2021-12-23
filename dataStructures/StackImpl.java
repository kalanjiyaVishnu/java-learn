package dataStructures;

public class StackImpl {
    int top = -1, SIZE;
    int[] stack;

    StackImpl(int SIZE) {
        this.SIZE = SIZE;
        stack = new int[SIZE];
    }

    boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    boolean isFull() {
        if (top > SIZE)
            return true;
        return false;
    }

    void push(int num) {
        if (isFull()) {
            System.out.println("STACK IS FULL");
        } else
            stack[++top] = num;
    }

    void diplay() {
        if (!isEmpty())
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i]);
            }
    }

    int getMax() {
        int max = this.peek();
    }

    int peek() {
        if (isEmpty()) {
            return stack[top];
        } else
            return -1;
    }

    public static void main(String[] args) {

    }
}
