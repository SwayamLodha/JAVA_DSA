package Prac;

import java.util.Scanner;

public class digit_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int x=n%10;
			sum+=x;
			n/=10;
	}
		System.out.println(sum);;

}
}
