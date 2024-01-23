package Prime_Sieve;

public class power_logN {

	public static void main(String[] args) {
      System.out.println(power(2,10));
	}

	public static int power(int a,int n) {
		if(n==0) {
			return 1;
		}
		int ans=power(a,n/2);
		ans=ans*ans;
		if(n%2!=0) {
			ans*=a;	
		}
		return ans;
	}
}
