package Pattern;

import java.util.Scanner;

public class pat_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int cst=0;
        int row=1;
        int nst=n;
        int nst1=0;
        for(int i =0; i<n;i++) {
        	for(int j =nst;j>cst;j--) {
        		if(j==row) {
        			System.out.print("* ");
        		}
        		else {
        		System.out.print(j+" ");
        	}
        		
        	}if(row!=1) {
        	
        	for(int x=nst1;x>0;x--) {
    			System.out.print(x+" ");
    		}
        	}
        	System.out.println();
        	row++;
        	cst++;
        	nst1++;
        }
	}

}
