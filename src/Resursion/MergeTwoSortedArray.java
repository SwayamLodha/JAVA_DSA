package Resursion;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[]= {3,5,7,9,11};
		int ar2[]= {1,2,3,4,6,7};
		int ans[]=merge(ar1, ar2);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();
	}

	public static int [] merge(int ar1[],int ar2[]) {
			int n=ar1.length;
			int m=ar2.length;
			int ans []=new int[n+m];
			int i=0;
			int j=0;
			int k=0;
			while(i<n && j<m) {
				if(ar1[i]<=ar2[j]) {
					ans[k]=ar1[i];
					k++;
					i++;	
				}
				else {
					ans[k]=ar2[j];
					k++;
					j++;
				}
			}
					while(i<n) {
						ans[k]=ar1[i];
						k++;
						i++;
					}
					while(j<m) {
						ans[k]=ar2[j];
						k++;
						j++;
					}
					return ans;
		}
}
