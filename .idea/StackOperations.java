import java.util.Scanner;

class Stack {
    private static final int MAX = 5;
    private int[] st;
    private int top;

    public Stack() {
        st = new int[MAX];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX - 1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            st[++top] = item;
            System.out.println("Element has been pushed into the stack");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return st[top--];
        }
    }
}

public class StackOperations {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nThe Following Operations:");
            System.out.println("1. Push an element");
            System.out.println("2. Pop the topmost element");
            System.out.println("3. Exit");
            System.out.print("Choose the operation: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    int ele = scanner.nextInt();
                    stack.push(ele);
                    break;
                case 2:
                    int popped = stack.pop();
                    if (popped != -1)
                        System.out.println("Popped element: " + popped);
                    break;
                case 3:
                    System.out.println("Terminating the program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
