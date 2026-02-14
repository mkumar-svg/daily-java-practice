package daily_java_practice.recursion.medium;

import java.util.Stack;

public class RecursiveStackReverser {
	private static void insertAtBottom(Stack<Integer> stack, int value) {
		if(stack.isEmpty()) {
			stack.push(value);
			return;
		}
		
		int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);
	}
	
	public static void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int top = stack.pop();
        reverse(stack);
        insertAtBottom(stack, top);
    }
	
	public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        reverse(stack);

        System.out.print("Reversed Stack: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
