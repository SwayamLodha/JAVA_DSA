package Pattern;

import java.util.Scanner;

public class pat_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int nsp=0;
        int row=1;
        int nst=1;
        
        for(int i=0;i<n*2;i++) {
        	for(int j=1;j<=nst;j++){
        		System.out.print("* ");
        	}
        	if(row<n) {
        		nst++;
        	}
        	else {
        		nst--;
        	}
        	System.out.println();
        	row++;
        }
	}

}
