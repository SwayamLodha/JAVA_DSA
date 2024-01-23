package Pattern;

import java.util.*;

public class pat_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int nsp=0;
        int row=1;
        int nst=n/2+1;
        int nst1=n/2;
        for(int i=0;i<n;i++) {
        	for(int j=nst;j>0;j--) {
        		System.out.print("* ");
        	}
        	for(int x=1;x<nsp;x++) {
        		System.out.print("  ");
        	}
        	for(int y=nst1;y>0;y--) {
        		
        		System.out.print("* ");
        	}
        	System.out.println();
        	if(row<=n/2) {
        		nst--;
        		nsp+=2;
        		nst1--;
        	}
        	else {
        		nst++;
        		nsp-=2;
        		nst1++;
        	}
        	if(row==1) {
        		nst1++;
        	}
        	if(row==n-1) {
        		nst1--;
        	}
        	row++;
	}

}
}
