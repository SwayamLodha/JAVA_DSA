package Resursion;

import java.util.Scanner;

public class Board_monkey {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("\n"+jump(n,0,""));
	}
	public static int jump(int end ,int curr , String x) {
		if(curr==end) {
			System.out.print(x+" ");
			return 1;
			
		}
		if(curr>end) {
			return 0;
		}
		int fj=jump(end ,curr+1 , x+'1');
		int sj=jump(end ,curr+2 , x+'2');
		int tj=jump(end ,curr+3 , x+'3');
		
		return fj+sj+tj;
	}
}
	
	
