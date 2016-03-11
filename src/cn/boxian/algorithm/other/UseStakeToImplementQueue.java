package cn.boxian.algorithm.other;

import java.util.Stack;

public class UseStakeToImplementQueue {
	public static void execute(Stack<Integer> stack) {
		Stack<Integer> temp = new Stack<Integer>();
		while(!stack.isEmpty()) {
			Integer element = stack.pop();
			temp.push(element);
		}
		
		while(!temp.isEmpty()) {
			System.out.println(temp.pop());
		}
	}
}
