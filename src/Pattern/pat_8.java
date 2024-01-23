package Pattern;

import java.util.*;

public class pat_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int nsp=n-1;
        int row=1;
        for(int i=0;i<n;i++) {
        	
        	for(int j=nsp;j>0;j--) {
        		System.out.print("  ");
        		
        	}
        	 for(int x=1;x<=(row*2-1);x++) {
        		 if(x%2==0) {
        			 System.out.print("  ");
        		 }
        		 else {
        			 System.out.print("* ");
        		 }
        	 }
        	 System.out.println();
        	 row++;
        	nsp--;
        }
	}

}
