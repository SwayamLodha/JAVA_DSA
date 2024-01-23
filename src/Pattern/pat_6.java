package Pattern;

import java.util.Scanner;

public class pat_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int row=1;
        int nst=n;
        int s=1;
        for (int i = 0; row <=n ; i++) {
        	for (int j = 1; j < s ; j++) {
				System.out.print("  ");
				
			}
        	for (int x = n; x >=row; x--) {
				System.out.print("* ");
			}
        	s+=2;
        	System.out.println();
        	row++;
			
		}
	}

}
