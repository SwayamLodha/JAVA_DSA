package Resursion;

public class merge_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []ar= {3,5,1,7,1,4,8,5};
				int ans[]=merge(ar,0,ar.length-1);
				for (int i = 0; i < ans.length; i++) {
					System.out.print(ans[i]+" ");
				}
	}

	public static int[] merge(int[] ar, int l, int h) {
		// TODO Auto-generated method stub
		if(l==h) {
			int a[]=new int[1];
			a[0]=ar[l];
			return a;
		}
		int m=(l+h)/2;
		
		int []fs=merge(ar, l, m);
		int []ss=merge(ar, m+1, h);
		return merge2array(fs,ss);
	}
	public static int [] merge2array(int ar1[],int ar2[]) {
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
