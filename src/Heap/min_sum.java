package Heap;

import java.util.PriorityQueue;

public class min_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int[] ar = { 2, 3, 1, 4 };
		for (int i = 0; i < ar.length; i++) {
			pq.add(ar[i]);
		}
		int s = 0;

		while (pq.size() > 1) {
			int x = 0;
			x = pq.poll() + pq.poll();
			s +=x;
			pq.add(x);
		}
		System.out.println(s);
	}

}
