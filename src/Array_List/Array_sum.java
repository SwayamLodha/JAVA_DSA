package Array_List;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] ar1 = new int[m];
		for (int i = 0; i < m; i++) {
			ar1[i] = sc.nextInt();
		}
		ArrayList<Integer> b = sum(ar, ar1);
		for (int i = 0; i < b.size(); i++) {
			System.out.print(b.get(i)+", ");
		}
		System.out.print("END");
	}

	public static ArrayList<Integer> sum(int[] ar, int[] ar1) {
		ArrayList<Integer> a = new ArrayList<>();
		int i =ar.length-1;
		int j =ar1.length-1;
		int carry=0;
		
		while(i>=0 || j>=0) {
			int sum=0;
			if(i>=0) {
				sum+=ar[i];
				i--;
			}
			if(j>=0) {
				sum+=ar1[j];
				j--;
			}
			sum+=carry;
			a.add(0, sum%10);
			carry=sum/10;
		}
		if(carry>0) {
			a.add(0, carry);
		}
		
		return a;
	}

}
