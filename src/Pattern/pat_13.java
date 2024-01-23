package Pattern;

import java.util.Scanner;

public class pat_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int cst=1;
        int row=1;
        int nst=1;
        for(int i=0;i<n*2;i++) {
        	
        	for(int j =nst;j>0;j--) {
        		if(j%2==0) {
        			System.out.print("* ");
        		}
        		else {
        			System.out.print(cst+" ");
        		}
        		
        	}if(row<n) {
        		nst+=2;
        		cst++;
        	}
        	else {
        	    cst--;
        		nst-=2;
        	}
        	System.out.println();
    		row++;
    		
        }
	}

}
