package Resursion;

public class power_func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		int m=5;
		System.out.println(pow(n,m));
	}

	public static int pow(int n,int m) {
		
		if ( m==0) {
			return 1;
		}
		
		int fn = pow(n ,m-1);
		return fn * n;
	}

}