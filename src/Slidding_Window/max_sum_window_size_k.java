package Slidding_Window;

public class max_sum_window_size_k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]= {1,2,7,5,11,3,2,1};
		int k=3;
		System.out.println(maxsum(ar,k));
	}
	public static int maxsum(int []ar,int k) {
		int sum=0;
		for (int i = 0; i < k; i++) {
			sum+=ar[i];
		}
		int ans=sum;
		for(int i=k;i<ar.length;i++) {
			sum+=ar[i];
			sum-=ar[i-k];
			ans=Math.max(ans,sum);
		}
		return ans;
	}

}
