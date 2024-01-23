package Array;

import java.util.Scanner;

public class leet_189 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		int k=sc.nextInt();
		k%=n;
		rev(ar,n-k,n-1);
		rev(ar,0,n-k-1);
		rev(ar,0,n-1);
		for (int h = 0; h < ar.length; h++) {
			System.out.print(ar[h]+" ");
		}
	}
	public static void rev(int ar[], int i , int j) {
		for (int g = i; g < j; g++) {
			int t=ar[g];
			ar[g]=ar[j];
			ar[j]=t;
			j--;
		}
		

}
}
