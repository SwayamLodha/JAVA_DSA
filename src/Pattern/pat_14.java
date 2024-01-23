package Pattern;

import java.util.Scanner;

public class pat_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int cst=1;
        int row=1;
        int nsp=n-1;
        int nst1=0;
        int p=n;
        int nst=0;
        
        for(int i=0;i<n;i++) {
        	for(int j=nsp;j>0;j--) {
        		System.out.print("  ");
        	}
        	
        	for(int x=0;x<nst1;x++){
        		System.out.print(p+" ");
        		p++;
        	}
        	System.out.print(0+" ");
        	int p1=n-1;
        	for(int a=0;a<nst;a++) {
        		
        		System.out.print(p1+" ");
        		p1--;
        		
        	}
        	System.out.println();
        	row++;
        	nsp--;
        	nst1++;
        	p-=cst;
        	cst++;
        	nst++;
        	
        }
	}

}
