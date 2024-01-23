package Resursion;

public class first_occur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {2,5,3,3,5,4,7,2,4,5};
		int n=7;
		System.out.println(first(ar,n,0));
	}
		public static int first(int ar[],int n,int i) {
			if(i==ar.length) {
				return -1;
			}
			if(ar[i]==n) {
				return i;
			}
			System.out.println(i+"****");
			return first(ar,n,i+1);
		
			
		}
}
