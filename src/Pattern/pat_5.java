package Pattern;

import java.util.Scanner;

public class pat_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int row=1;
        int nst=n;
        for (int i = 0; row <=n ; i++) {
        	for (int j = 1; j < row ; j++) {
				System.out.print("  ");
			}
        	for (int x = n; x >=row; x--) {
				System.out.print("* ");
			}
        	System.out.println();
        	row++;
			
		}
	}

}
