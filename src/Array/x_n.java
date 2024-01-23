package Array;

import java.util.Scanner;

public class x_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=check(n);
		System.out.print(x);
	}
	public static int check (int n) {
		int low=0;
		int high=n;
		int x =0;
		
		while(low<=high) {
			x=low-(low+high)/2;
			if(x*x==n) {
				return x;
			}
			else if(x*x<n) {
				low=x+1;
			}
			else {
				high=x-1;
			}
			if((x+1)*(x+1)>n && (x-1)*(x-1)<n) {
				return x;
			}
					
		}
		return x;

}
}
