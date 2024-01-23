package Slidding_Window;

public class product_less_than_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 10, 5, 2, 6 };
		int k = 100;
		System.out.println(countsubarray(ar, k));
	}

	public static int countsubarray(int ar[], int k) {
		int s = 0;
		int e = 0;
		int p = 1;
		int c = 0;
		while (e < ar.length) {
			p *= ar[e];
			while (p >= k && s <= e) {
				p /= ar[s];
				s++;
			}
			c += e - s + 1;
			e++;
		}
		return c;
	}

}
