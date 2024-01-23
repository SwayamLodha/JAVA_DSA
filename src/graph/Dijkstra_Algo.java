package graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

import graph.Prims_Algo.PrimsPair;

public class Dijkstra_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;
	
	public Dijkstra_Algo(int v) {
		this.map=new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}
		
public class DijkstraPair{
		
		int vtx;
		String acqpath;
		int cost;
		public DijkstraPair(int vtx, String acqpath, int cost) {
			this.vtx=vtx;
			this.cost=cost;
			this.acqpath=acqpath;
		}
		@Override
		public String toString() {
			return this.vtx +" via "+this.acqpath + " @ "+this.cost;
		}
	}
	
	public void AddEdge(int v1, int v2, int cost) {
		
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}
	
	public void Djikstra() {
		
		PriorityQueue<DijkstraPair> pq=new PriorityQueue<>(new Comparator<DijkstraPair>() {
			@Override
			public 	int compare(DijkstraPair p1, DijkstraPair p2) {
				return p1.cost-p2.cost;
			}
		});
			
		HashSet<Integer> visited=new HashSet<>();
		pq.add(new DijkstraPair(1, "1", 0));
		while(!pq.isEmpty()) {
			DijkstraPair dp=pq.remove();
			if(visited.contains(dp.vtx)) {
				continue;
			}
			visited.add(dp.vtx);
			System.out.println(dp);
			
			for(int nbrs:map.get(dp.vtx).keySet()){
				if(!visited.contains(nbrs)) {
					int c=dp.cost+map.get(dp.vtx).get(nbrs);
					DijkstraPair ndp=new DijkstraPair(nbrs, dp.acqpath+nbrs, c);
					pq.add(ndp);
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Dijkstra_Algo pa = new Dijkstra_Algo(7);
		pa.AddEdge(1, 2, 2);
		pa.AddEdge(2, 3, 3);
		pa.AddEdge(1, 4, 10);
		pa.AddEdge(4, 5, 8);
		pa.AddEdge(3, 4, 1);
		pa.AddEdge(5, 6, 5);
		pa.AddEdge(5, 7, 6);
		pa.AddEdge(6, 7, 4);
		pa.Djikstra();

	}

}
	

