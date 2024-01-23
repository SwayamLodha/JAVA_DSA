package Bit_masking;

import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if((n&1)==0) {
			System.out.println(n+" is an even number");
		}
		else {
			System.out.println(n+" is an odd number");
		}
	}

}
