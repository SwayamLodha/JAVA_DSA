package Stack_QPs;

import java.util.*;

public class Stack_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s);
		reverse(s);
		System.out.println(s);
	}

	public static void reverse(Stack<Integer> s) {
		if (s.isEmpty()) {
			return;
		}
		int x = s.pop();
		reverse(s);
		insert_below(s,x);
	}

	private static void insert_below(Stack<Integer> s, int x) {
		// TODO Auto-generated method stub
		if(s.isEmpty()) {
			s.push(x);
			return;
		}
		int y=s.pop();
		insert_below(s, x);
		s.push(y);
	}
}
