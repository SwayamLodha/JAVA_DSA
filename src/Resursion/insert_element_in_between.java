package Resursion;

public class insert_element_in_between {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]ar= {7,5,3,1,9,4};
		insert(ar, 0, ar.length-1);
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		
	}
	public static void insert(int[]ar,int l,int h) {
		int last=ar[h];
		int idx=l;
		for (int i = idx; i < h ; i++) {
			if(ar[i]<=last) {
				swap(ar,i,idx);
				idx++;
			}
		}
		swap(ar,idx,h);
		
	}	
	public static int [] swap(int[]ar,int a,int b) {
		int t=ar[a];
		ar[a]=ar[b];
		ar[b]=t;
		return ar;
	}

}
