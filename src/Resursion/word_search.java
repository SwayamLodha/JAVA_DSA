package Resursion;

public class word_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char maze[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String s = "ABCCED";
			for (int i = 0; i < maze.length; i++) {
				for (int j = 0; j < maze[0].length; j++) {
					if (maze[i][j] == s.charAt(0)) {
						boolean ans = findword(maze, i, j, s, 0);
						if (ans == true) {
							System.out.println(ans);
							return;
						}
					}
				}
			}
			System.out.println("False");
		}

		public static boolean findword(char[][] maze, int cr, int cc, String s, int idx) {
		
			// TODO Auto-generated method stub
			if (cr < 0 || cr >= maze.length || cc < 0 || cc >= maze[0].length || maze[cr][cc] != s.charAt(idx)) {
				return false;
			}
	
			int[] r = { -1, 1, 0, 0 };
			int[] c = { 0, 0, 1, -1 };
	
			maze[cr][cc] = '*';
			for (int i = 0; i < c.length; i++) {
				boolean ans = findword(maze, cr + r[i], cc + c[i], s, idx + 1);
				if (ans==true) {
					return ans;
				}
	
			}
			maze[cr][cc] = s.charAt(idx);
	
			return false;
	
		}
	
	}
