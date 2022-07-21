package javalab;

import java.util.Scanner;

class Stack {
    int top = -1;

    int stack[];

    Stack(int n) {

        stack = new int[n];

    }

    public void push(int data) {
        top++;
        stack[top] = data;
    }

    public int pop() {

        int data = stack[top];
        top--;
        return top;
    }

    public int top() {
        return stack[top];
    }

    public boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    public void displayStack() {
        System.out.println("Elements in the stack are:");
        for (int i = top; i >= 0; i--) {
            System.out.println("Element" + (i + 1) + "is:" + stack[i]);
        }
    }
}
public class StackImplementation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size_of_stack, data;
        System.out.println("Enter the size of stack");
        size_of_stack = sc.nextInt();
        Stack s1 = new Stack(size_of_stack);
        int choice;
        boolean flag = true;

        while (flag) {
            System.out.println("What operation do you want to perform?\n1.Push\n2.Pop\n3.Top\n4.isEmpty\n5.display\n5.End.");
            choice = sc.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Enter a value to be pushed.");
                data = sc.nextInt();
                s1.push(data);
                break;
            case 2:
                System.out.println("Popped element\t=\t" + s1.pop());
                break;

            case 3:
                System.out.println("Top element is " + s1.top());
                break;
            case 4:
                if (s1.isEmpty())
                    System.out.println("Stack is empty");
                else
                    System.out.println("Stack is not empty");
                break;
                case 5:
                s1.displayStack();
                break;
            case 6:
                flag = false;
                break;
            default:
                System.out.println("Invalid Choice.");
            }
        }

    }
}