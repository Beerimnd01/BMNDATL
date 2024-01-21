package src.oops21jan2024;

import java.util.Stack;

public class Lab166 {
    public static void main(String[] args) {
        Stack<String> stack= new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.pop());
    }
}
