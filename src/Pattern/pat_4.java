package Pattern;

import java.util.*;


public class pat_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	      
	       int row=1;
	       for (int i = 0; row<=n; i++) {
	    	   for (int j = n-1; j >=row; j--) {
				System.out.print("  ");
			}
	    	   for (int x = 0; x < row ; x++) {
				System.out.print("* ");
			}
			System.out.println();
			row++;
		}
		
       }
	}


