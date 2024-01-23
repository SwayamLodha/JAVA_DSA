package Stack_QPs;

import java.util.*;


public class Stock_Span {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 91, 11, 13, 15, 38, 42, 37 };
		span_cal(ar);
	}

	public static void span_cal(int[] ar) {
		int[] span = new int[ar.length];
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < span.length; i++) {
			while (!s.isEmpty() && ar[i] > ar[s.peek()]) {
				s.pop();
			}
			if (s.isEmpty()) {
				span[i] = i + 1;
			} else {
				span[i] = i - s.peek();
			}
			s.push(i);
		}
		for (int i = 0; i < span.length; i++) {
			System.out.println(ar[i] + "  " + span[i]);
		}
	}

}
