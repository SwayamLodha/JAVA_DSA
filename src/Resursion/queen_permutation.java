package Resursion;

public class queen_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean [] board=new boolean[4];
		queen(board,2,0,"",0);
	}

	public static void queen(boolean[] board, int tq, int qpsf, String ans,int idx) {
		// TODO Auto-generated method stub
		//tq-->total queen , qpfs-->queen placed so far
		if(qpsf==tq) {
			System.out.println(ans);
			return;
		}
		for (int i = idx; i < board.length; i++) {
			if(board[i]==false) {
				board[i]=true;
				queen(board,tq,qpsf+1,ans+"B"+i+"Q"+qpsf+" ",i+1	);
				board[i]=false;
			}
		}
		
	}

}
