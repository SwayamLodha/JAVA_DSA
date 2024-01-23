package Prac;

import java.util.Scanner;

public class inverse_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0;
		int a=1;
		while(n!=0) {
			int rem=n%10;
			s+=a*(int)(Math.pow(10, rem-1));
			n/=10;
			a++;
		}
		System.out.print(s);
	}

}
