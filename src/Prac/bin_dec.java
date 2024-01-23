package Prac;

import java.util.Scanner;

public class bin_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mul=1;
		int ans=0;
		
		while(n!=0) {
			int rem=n%10;
			if(rem==1) {
				ans+=rem*mul;
			}
			mul*=2;
			n/=10;
	}
		System.out.print(ans);

}
}
