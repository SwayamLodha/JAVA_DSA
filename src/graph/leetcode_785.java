package graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class leetcode_785 {
	public class pair {
		int vtx;
		int d;

		public pair(int vtx, int d) {
			this.d = d;
			this.vtx = vtx;
		}
	}

	class Solution {
		public boolean isBipartite(int[][] graph) {
			HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
			for (int i = 0; i < graph.length; i++) {
				map.put(i, new HashMap<>());
			}
			for (int i = 0; i < graph.length; i++) {
				for (int j = 0; j < graph[i].length; j++) {
					map.get(i).put(graph[i][j], 0);
				}
			}
			return isBipartite(map);
		}

		public static boolean isBipartite(HashMap<Integer, HashMap<Integer, Integer>> map) {
			LinkedList<pair> qq = new LinkedList<>();
			HashMap<Integer, Integer> visited = new HashMap<>();
			for (int src : map.keySet()) {
				if (visited.containsKey(src)) {
					continue;
				}
				pair bp = new pair(src, 0);
	 			qq.add(bp);
				while (!qq.isEmpty()) {
					pair r = qq.remove();
					if (visited.containsKey(r.vtx) && r.d!=visited.get(r.vtx)) {
						return false;
					}
					visited.put(r.vtx, r.d);

					for (int nbr : map.get(r.vtx).keySet()) {
						if (!visited.containsKey(nbr)) {
							pair nbp=new pair(nbr,r.d+1);
							qq.add(nbp);
						}
					}
				}
			}
			return true;
		}
	}
}
