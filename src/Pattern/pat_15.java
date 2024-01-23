package Pattern;

import java.util.Scanner;

public class pat_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int nsp=0;
        int row=1;
        int nst=1;
        int nst1=n-2;
        for(int i=0;i<n;i++) {
        	for(int j=0;j<nst;j++) {
        		if(j==nst-1) {
        			System.out.print("*   ");
        		}
        		else {
        			System.out.print("    ");
        		}
        	}
        	for(int a=nst1;a>0;a--) {
        		System.out.print("    ");
        	}
        	if(row!=n/2+1) {
        	System.out.print("*   ");
        	}
        	System.out.println();
        	if(row<=n/2) {
        	nst++;
        	nst1-=2;
        	}
        	else {
        		nst--;
        		nst1+=2;
        	}
        	row++;
        }
	}
        

}
