package Pattern;

import java.util.Scanner;

public class pat_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
      
       int row=1;
       for (int i = 0; row<=n; i++) {
    	   for (int j = n; j >=row; j--) {
			System.out.print("* ");
			
		}
    	   
		System.out.println();
		row++;
	}
	}

}
