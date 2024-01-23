package Pattern;

import java.util.Scanner;

public class pat_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int nsp=n-1;
        int row=1;
        int nst=row;
        for(int i = 1; i<n*2;i++) {
        	for(int j=nsp;j>0;j--) {
        		System.out.print("  ");
        		
        	}
        	
        	for(int x=0;x<nst;x++) {
        		System.out.print("* ");
        	}
        	if(row<n) {
        		nsp--;
        		nst++;
        	}
        	else {
        		nsp++;
        		nst--;
        	}
        	
        	System.out.println();
        	row++;
        	
        }
	}

}
