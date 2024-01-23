package graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Kruskals_algo {
	HashMap<Integer, HashMap<Integer, Integer>>map;
	
	public Kruskals_algo(int v) {
		this.map=new HashMap<>();
		for (int i = 0; i <= v; i++) {
			map.put(i,new HashMap<>());
		}
	}
	
	public void addEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}    
	
	public class EdgePair{
		int e1;
		int e2;
		int cost;
		public EdgePair(int e1,int e2,int cost) {
			this.cost=cost;
			this.e1=e1;
			this.e2=e2;
		}
		@Override
		public String toString() {
			return e1+" <--> "+e2+" @ "+cost;
		}
	}
	
	public ArrayList<EdgePair> getalledge(){
		ArrayList<EdgePair> list=new ArrayList<>();
		for(int e1: map.keySet()) {
			for(int e2: map.get(e1).keySet()) {
				EdgePair eg =new EdgePair(e1, e2, map.get(e1).get(e2));
				list.add(eg);
			}
		}
		return list;
	}
	
	public void KruskalsAlgorithm() {
		int ans=0;
		DisJointSet ds=new DisJointSet();
		for(int k:map.keySet()) {
			ds.CreateSet(k);
		}
		ArrayList<EdgePair> ll=getalledge();
		Collections.sort(ll,new Comparator<EdgePair>() {

			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				// TODO Auto-generated method stub
				return  o1.cost-o2.cost;
			}
		});
		for(EdgePair edge:ll) {
			int e1=edge.e1;
			int e2=edge.e2;
			int re1=ds.find(e1);
			int re2=ds.find(e2);
			if(re1==re2) {
				//nothing
			}
			else {
				System.out.println(edge);
				ans+=edge.cost;
				ds.union(re1, re2);
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Kruskals_algo ks=new Kruskals_algo(n);
		int m=sc.nextInt();
		for (int i = 0; i < m; i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			int cost=sc.nextInt();
			ks.addEdge(v1, v2, cost);
		}
		ks.KruskalsAlgorithm();
	}
}

/*
  4 5
  1 2 10
  2 3 15
  1 3 5
  4 2 2
  4 3 40 */
