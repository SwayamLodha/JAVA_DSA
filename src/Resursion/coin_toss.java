package Resursion;

import java.util.Scanner;

public class coin_toss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		toss(n,"");
	}
	public static void toss(int n , String x) {
		if(n==0) {
			System.out.print(x+" ");
			return;
		}
		toss(n-1 , x+"H");
		toss(n-1 , x+"T");
	}
}
