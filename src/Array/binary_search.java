package Array;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i]=sc.nextInt();
		}
		int item=sc.nextInt(); 
		System.out.println(search(ar,item));
	}
	public static int search(int ar[],int item) {
		int low=0;
		int high=ar.length-1;
		int mid =0;
		while(low<=high) {
			mid=(low+high)/2;
			if(ar[mid]==item) {
				return mid;
			}
			else if(ar[mid]<item) {
				low=mid+1;
			}
			else {
				high=low-1;
			}
		}
		return -1;
	}

}
