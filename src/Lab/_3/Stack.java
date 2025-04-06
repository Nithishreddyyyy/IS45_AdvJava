package Lab._3;

import java.util.Scanner;

class Stack {
    static int MAX = 5;
    int[] st;
    int top;

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
            throw new IllegalStateException("Stack Overflow: Cannot push element " + item + " as the stack is full.");
        } else {
            st[++top] = item;
            System.out.println("Pushed element " + item);
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack Underflow: No element to pop as the stack is empty.");
        } else {
            System.out.println("Popped element: " + st[top]);
            return st[top--];
        }
    }
    public void disp() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("The elements are: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(st[i]);
        }
        System.out.println("\n");
    }
}

class StackOperations {
    public static void main(String[] args) {
        Stack stack = new Stack();
        Scanner S = new Scanner(System.in);

        while (true) {
            System.out.println("The Following Operations:");
            System.out.println("1. Push an element");
            System.out.println("2. Pop the topmost element");
            System.out.println("3. Display the stack");
            System.out.println("4. Exit");
            System.out.print("Choose the operation: ");
            int choice = S.nextInt();
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter the element to push: ");
                        int ele = S.nextInt();
                        stack.push(ele); // Push element with exception handling
                        break;
                    case 2:
                        int popped = stack.pop(); // Pop element with exception handling
                        System.out.println("Popped element: " + popped);
                        break;
                    case 3:
                        stack.disp(); // Display the stack
                        break;
                    case 4:
                        System.out.println("Terminating the program.");
                        System.exit(0);  // Proper termination of the program
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage()); // Handle stack overflow/underflow exceptions
            }
        }
    }
}
