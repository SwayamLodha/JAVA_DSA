package graph;

import java.util.*;

public class Graph {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Graph(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
		map.get(v2).put(v1, cost);
	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);

	}

	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}

	public int noofEdge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum = sum + map.get(key).size();
		}
		return sum / 2;
	}

	public void removeEdge(int v1, int v2) {
		if (ContainsEdge(v1, v2)) {

			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}

	}

	public void removevertex(int v1) {

		for (int key : map.get(v1).keySet()) {
			// removeEdge(key, v1);
			map.get(key).remove(v1);
		}
		map.remove(v1);

	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + "-->" + map.get(key));
		}
	}

	public boolean hashpath(int src, int dis, HashSet<Integer> visited) {

		if (src == dis) {
			return true;
		}

		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = hashpath(nbrs, dis, visited);
				if (ans) {
					return ans;
				}
			}
		}
		visited.remove(src);
		return false;

	}

	public void printallpath(int src, int dis, HashSet<Integer> visited, String ans) {

		if (src == dis) {
			System.out.println(ans + src);
			return;
		}

		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				printallpath(nbrs, dis, visited, ans + src + " ");

			}
		}
		visited.remove(src);

	}

	public boolean BFS(int src, int dst) {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		qq.add(src);
		while (!qq.isEmpty()) {
			int r = qq.remove();
			if (visited.contains(r)) {
				continue;
			}
			visited.add(r);
			if (r == dst) {
				return true;
			}
			for(int nbr: map.get(r).keySet()) {
				if(!visited.contains(nbr)) {
					qq.add(nbr);
				}
			}
		}
			return false;
	}
		
	public boolean DFS(int src, int dst) {
		Stack<Integer> s = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		s.push(src);
		while (!s.isEmpty()) {
			int r = s.pop();
			if (visited.contains(r)) {
				continue;
			}
			visited.add(r);
			if (r == dst) {
				return true;
			}
			for(int nbr: map.get(r).keySet()) {
				if(!visited.contains(nbr)) {
					s.push(nbr);
				}
			}
		}
			return false;
	}
	
	public void BFT() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for(int src:map.keySet()) {
		qq.add(src);
		while (!qq.isEmpty()) {
			int r = qq.remove();
			if (visited.contains(r)) {
				continue;
			}
			visited.add(r);
			System.out.print(r+" ");
			for(int nbr: map.get(r).keySet()) {
				if(!visited.contains(nbr)) {
					qq.add(nbr);
				}
			}
		}
	}
		System.out.println();
}		
	public void DFT() {
		Stack<Integer> qq = new Stack<>();
		HashSet<Integer> visited = new HashSet<>();
		for(int src:map.keySet()) {
		qq.push(src);
		while (!qq.isEmpty()) {
			int r = qq.pop();
			if (visited.contains(r)) {
				continue;
			}
			visited.add(r);
			System.out.print(r+" ");
			for(int nbr: map.get(r).keySet()) {
				if(!visited.contains(nbr)) {
					qq.push(nbr);
				}
			}
		}
	}
		System.out.println();
		
	}
	
	public boolean containsCycle() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		for(int src:map.keySet()) {
		qq.add(src);
		while (!qq.isEmpty()) {
			int r = qq.remove();
			if (visited.contains(r)) {
				return true;
			}
			visited.add(r);
			
			for(int nbr: map.get(r).keySet()) {
				if(!visited.contains(nbr)) {
					qq.add(nbr);
				}
			}
		}
	}
		return false;
	}
	
	public boolean isConnected() {
		LinkedList<Integer> qq = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		int count =0;
		for(int src:map.keySet()) {
		qq.add(src);
		while (!qq.isEmpty()) {
			int r = qq.remove();
			if (visited.contains(r)) {
				return true;
			}
			count++;
			visited.add(r);
		
			for(int nbr: map.get(r).keySet()) {
				if(!visited.contains(nbr)) {
					qq.add(nbr);
				}
			}
		}
	}
		return count==1;
	}
}