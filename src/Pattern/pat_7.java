package Pattern;

import java.util.Scanner;

public class pat_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int row=1;
        int nst=n;
        for (int i = 0; row <=n; i++) {
        	if(row==1 || row==n) {
			for (int j = 0; j < nst; j++) {
            System.out.print("* ");	
			}
        	}
        	else {
        		for (int j = 0; j < nst; j++) {
					if(j==0||j==nst-1) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
        	}
			System.out.println();
			row++;
		}
	}

}
