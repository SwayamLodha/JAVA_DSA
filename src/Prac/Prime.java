package Prac;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a=2;
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					System.out.println("Not a prime no.");
					break;
				}
				a++;
			}
				if(a==n) {
					System.out.println("Prime no.");
				}
	}

	}


