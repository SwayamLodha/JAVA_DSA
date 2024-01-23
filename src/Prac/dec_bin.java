package Prac;
import java.util.*;
public class dec_bin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int mul=1;
		int x=0;
		
		while(n!=0) {
			int rem=n%2;
			x=x+rem*mul;
			mul=mul*10;
			n/=2;
		}
		System.out.print(x);
	}

}
