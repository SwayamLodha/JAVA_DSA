package Pattern;

import java.util.Scanner;

public class pat_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int nsp=0;
        int row=1;
        int nst=n;
        for(int i=0;i<n*2-1;i++) {
        	for(int j=0;j<nsp;j++) {
        		System.out.print("  ");
        	}
        	for(int x=nst;x>0;x--) {
        		System.out.print("* ");
        	}
        	System.out.println();
        	if(row<n) {
        		nsp+=2;
        		nst--;
        	}
        	else {
        		nsp-=2;
        		nst++;
        	}
        	
        	row++;
        }
	}

}
