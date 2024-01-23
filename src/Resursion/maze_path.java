package Resursion;

public class maze_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=3;
		int n=3;
		path(m-1,n-1,0,0,"");
	}
	public static void path(int er , int ec ,int cr,int cc,String ans) {
		if(cr==er && cc==ec) {
			System.out.println(ans);
			return;
		}
		
		if(cr<=er) {
			path(er,ec,cr+1,cc,ans+"V");
		}
		if(cc<=ec) {
			path(er,ec,cr,cc+1,ans+"H");
		}
	}
}
