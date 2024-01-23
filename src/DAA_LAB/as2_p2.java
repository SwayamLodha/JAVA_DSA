package DAA_LAB;

public class as2_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {21,43,2,5,74,2,4,68,3,1,100,64,5,86,34,6};
		long s=System.nanoTime();
		int ar[]=merge(a,0,a.length-1);
		long e=System.nanoTime();
		double tt=e-s;
		for(int i=0;i<ar.length;i++ ) {
			System.out.print(ar[i]+"  ");
		}
		System.out.println("\n"+"Time Taken "+tt+" ns");
		
	}
	public static int[] merge(int ar[],int l, int h) {
		if(l==h) {
			int a[]=new int[1];
			a[0]=ar[l];
			return a;
		}
		int m=(l+h)/2;
		int []f=merge(ar,l,m);
		int []s=merge(ar,m+1,h);
		return MS(f,s);
	}
		public static int[] MS(int []a, int[]b) {
			int n=a.length;
			int m=b.length;
			int ar[]=new int[n+m];
			int i=0;
			int j=0;
			int k=0;
			while(i<n && j<m ) {
				if(a[i]<=b[j]) {
					ar[k]=a[i];
					k++;
					i++;
				}
				else {
					ar[k]=b[j];
					k++;
					j++;
				}
			}
			while(i<n){
				ar[k]=a[i];
				i++;
				k++;
			}
			while(j<m) {
				ar[k]=b[j];
				j++;
				k++;
			}
			return ar;
		}

}
