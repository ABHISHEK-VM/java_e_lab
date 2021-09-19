package Fifth_Program;

import java.util.Scanner;

public class StackImplimentation {
    public static void main(String[] args) {
        int choice = 1;
        Stack stack = new Stack();
        while (choice != 5) {
            System.out
                    .print(" \n\n1 to Push \n2 to pop \n3 to Peek \n4 to display \n5 to exit \n\nEnter your choice : ");
            choice = new Scanner(System.in).nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the element : ");
                    int element = new Scanner(System.in).nextInt();
                    stack.push(element);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.peek();
                    break;

                case 4:
                    stack.display();
                    break;

                case 5:
                    choice = 5;
                    System.out.println("\nProgram exited!!");
                    break;

                default:
                    System.out.println("\nInvalid Entry");
                    break;
            }
        }

    }
}

class Stack {
    int stack[];
    int top;

    Stack() {
        stack = new int[10];
        top = -1;
    }

    void push(int element) {
        if (top == 9) {

            System.out.println("\nStack Overflow!");
        } else {

            stack[++top] = element;
            System.out.println("\nInserted " + element + " at position " + top + 1);
        }
    }

    void pop() {
        if (top == -1) {

            System.out.println("\n\nStack Underflow!");
        } else {

            System.out.println("\nRemoved " + stack[top] + " at position " + (top + 1));
            top--;
        }
    }

    void peek() {
        if (top == -1) {

            System.out.println("\nStack Underflow!");
        } else {

            System.out.println("\nPeek item is " + stack[top] + " at position " + (top + 1));
        }
    }

    void display() {
        if (top == -1) {

            System.out.println("\n\nStack Underflow!");
        } else {

            for (int i = 0; i <= top; i++) {

                System.out.print(stack[i] + "  ");
            }
        }

    }

}
