package Heap;

import java.util.ArrayList;

public class generic_heap <T extends Comparable<T>> {
	private ArrayList<T> data = new ArrayList<>();

	 public void add(T item) {
		this.data.add(item);
		         upheapify(this.data.size() - 1);
	}

	 private void upheapify(int ci) {
	    	int pi = (ci - 1) / 2;
		         // if (this.data.get(pi) > this.data.get(ci)) {
	    	if(islarger(this.data.get(ci), this.data.get(pi))>0){
			swap(pi, ci);
	upheapify(pi);
		}
	}

	public void swap(int i, int j) {
		// TODO Auto-generated method stub
		T ith = this.data.get(i);
		T jth = this.data.get(j);
		this.data.set(i, jth);
		this.data.set(j, ith);
	}

	public T remove() {
		swap(0, this.data.size() - 1);
		T rv = this.data.remove(this.data.size() - 1);
		downheapify(0);
		return rv;
	}

	private void downheapify(int pi) {
		// TODO Auto-generated method stub
		int lci=2*pi+1;
		int rci=2*pi+2;
		int mini=pi;
	//	if(lci<this.data.size() && this.data.get(lci)<this.data.get(mini)) {
		if(lci<this.data.size() && islarger(this.data.get(lci), this.data.get(mini))>0){
			mini=lci;
		}
	//	if(rci<this.data.size() && this.data.get(rci)<this.data.get(mini)) {
		if(rci<this.data.size() && islarger(this.data.get(rci), this.data.get(mini))>0){
			mini=rci;
		}
		if(mini!=pi) {
			swap(mini, pi);
			downheapify(mini);
		}
	}
	
	public T getmin() {
		return this.data.get(0);
	}
	
	public int size() {
		return this.data.size();
	}
	
	public void display() {
		System.out.println(this.data);
	}
	
	public int islarger(T o1,T o2) {
		return o1.compareTo(o2);
	}
}
