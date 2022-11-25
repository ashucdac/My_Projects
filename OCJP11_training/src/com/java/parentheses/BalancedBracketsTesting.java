package com.java.parentheses;

import java.util.Stack;

public class BalancedBracketsTesting {
	
	public static boolean testBalancing(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i =0;i<s.length(); i++) {
			char x = s.charAt(i);
			if(x == '{' || x == '(' || x == '[') {
				stack.push(x);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if(check == '[' || check == '{')
					return false;
				break;
			case '}':
				check = stack.pop();
				if(check == '[' || check == '(')
					return false;
				break;
			case ']':
				check = stack.pop();
				if(check == '(' || check == '{')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		
		String str = "([{{}{}(ABCD)()}])";
		boolean res = BalancedBracketsTesting.testBalancing(str);
		if(res) {
			System.out.println("Balanced");
		}else {
			System.out.println("Unbalanced");
		}

	}

}
