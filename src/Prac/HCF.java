package Prac;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int divisor=n1;
		int divident=n2;
		int x=0;
		while(divisor!=0) {
			 x=divident%divisor;
			divident=divisor;
			divisor=x;
		}
		System.out.println(divident);
	}

}
