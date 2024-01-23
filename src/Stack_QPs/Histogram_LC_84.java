package Stack_QPs;

import java.util.Stack;

public class Histogram_LC_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = { 2, 3, 5, 4, 6, 1, 7 };
		System.out.println(Area(ar));
	}

	public static int Area(int[] ar) {
		Stack<Integer> s = new Stack<>();
		int ans=0;
		for (int i = 0; i < ar.length; i++) {
			while (!s.isEmpty() && ar[i] < ar[s.peek()]) {
				int r=i;
				int h=ar[s.pop()];
				if(s.isEmpty()) {
					ans=Math.max(ans, h*r);
				}
				else {
					int l=s.peek();
					ans=Math.max(ans, h*(r-l-1));
				}
			}
			s.push(i);
		}
		int r=ar.length;
		while(!s.isEmpty()) {
			int h=ar[s.pop()];
			if(s.isEmpty()) {
				ans=Math.max(ans, h*r);
			}
			else {
				int l=s.peek();
				ans=Math.max(ans, h*(r-l-1));
			}
		}
		return ans;
	}

}
