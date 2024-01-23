package Dynamic_programing;

import java.util.Arrays;

public class VDR_hackerblocks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ch = { 2, 11, 3 };
		int[] cn = { 5, 7, 3, 2 };
		Arrays.sort(ch);
		Arrays.sort(cn);
		System.out.println(BGD(ch, cn, 0, 0));
	}

	public static int BGD(int[] b, int [] g, int i, int j) {
		
		if(i==b.length) {
			return 0;
		}
		if(j==g.length) {
			return 1000000;
		}
		
		int slt=Math.abs(b[i]-g[j]) + BGD(b, g, i+1, j+1);
		int rej=BGD(b, g, i, j+1);
		return Math.min(slt, rej);
		
	}

}
