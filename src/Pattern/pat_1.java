package Pattern;
import java.util.*;
public class pat_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int nst=n;
        int row=1;
        for (int i = 0; row <= n; i++) {
        	for (int j = 0; j < nst; j++) {
        		System.out.print("* ");
			}
        	
        	System.out.println();
            row++;
		 }
       }
	 }
