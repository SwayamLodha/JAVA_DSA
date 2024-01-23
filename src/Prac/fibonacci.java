package Prac;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=1;
		int sum=0;
		int a=0;
		for(int i=0;i<=n;i++) {
			System.out.print(sum+" ,");
			if(i!=1) {
			sum=f+a;
			a=f;
			f=sum;
	}
		}

}
}
