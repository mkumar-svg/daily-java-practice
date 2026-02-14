package daily_java_practice.recursion.medium;

import java.util.Stack;

public class RecursiveStackSorter {
	private static void insertInSortedOrder(Stack<Integer> stack, int element) {
		if(stack.isEmpty() || stack.peek() >= element) {
			stack.push(element);
			return;
		}
		
		int top = stack.pop();
		insertInSortedOrder(stack, element);
		stack.push(top);
	}
	
	public static void sort(Stack<Integer> stack) {
		if(stack.isEmpty()) {
			return;
		}
		
		int top = stack.pop();
		sort(stack);
		insertInSortedOrder(stack, top);
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        sort(stack);
		
		System.out.print("Sorted stack (descending order): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
	}
}
