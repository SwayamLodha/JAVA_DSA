package Stack_QPs;

import java.util.Stack;

public class Next_Greater_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 11, 3, 23, 9, 15 };
		NGE(ar);
	}

	public static void NGE(int[] ar) {
		int[] ngn = new int[ar.length];
		Stack<Integer> s = new Stack<>();
		for (int i = 0; i < ar.length; i++) {
			while (!s.isEmpty() && ar[i] > ar[s.peek()]) {
				int x = s.pop();
				ngn[x] = ar[i];
			}
			s.push(i);
		}
		while (!s.isEmpty()) {
			int x = s.pop();
			ngn[x] = -1;
		}
		for (int i = 0; i < ngn.length; i++) {
			System.out.println(ar[i]+" "+ngn[i]);
		}
	}

}
