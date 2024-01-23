package DAA_LAB;

public class as2_p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {21,43,2,5,74,2,4,68,3,1,100,64,5,86,34,6};
		long st=System.nanoTime();
		sort(ar,0,ar.length-1);
		long et=System.nanoTime();
		double tt=(et-st);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+"  ");
		}
		System.out.println("\n"+"time taken "+tt+" ns");
	}
	public static void sort(int ar[],int l,int h) {
		if(l<h) {
			int p=insert(ar,l,h);
			sort(ar,l,p-1);
			sort(ar,p+1,h);
		}
	}
	public static int insert(int ar[],int l,int h) {
		int p=l;
		int last=ar[h];
		for(int i=p;i<h;i++) {
			if(ar[i]<=last) {
				swap(ar,i,p);
				p++;
			}
		}
		swap(ar,p,h);
		return p;
	}
	public static int[] swap(int []ar,int a,int b) {
		int t=ar[a];
		ar[a]=ar[b];
		ar[b]=t;
		return ar;
	}
}
