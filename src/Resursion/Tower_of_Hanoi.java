package Resursion;

public class Tower_of_Hanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		hanoi(n,"source","helper","distination");
	}

	public static void hanoi(int n, String s, String h, String d) {
		// TODO Auto-generated method stub
		if(n==0) {
			return;
		}
		
		hanoi(n-1,s,d,h);
		System.out.println("Move disc no. "+n+" from "+s+" to "+d);
		hanoi(n-1,h,s,d);
	}
		
}
