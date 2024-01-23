package Stack_QPs;

import Stacks.DynamicStack;

public class Queue_using_Stack {
	private DynamicStack data;
	public Queue_using_Stack() {
		this.data=new DynamicStack();
	}
	public boolean isempty() {
		return data.isEmpty();
	}
	public int size() {
		return data.size();
	}
	public void Enqueue(int x) throws Exception{
		this.data.push(x);
		
	}
	public int dequeue() throws Exception {
		DynamicStack temp=new DynamicStack();
		while(data.size()>1) {
			temp.push(data.pop());
		}
		int x=data.pop();
		while(!temp.isEmpty()) {
			data.push(temp.pop());
		}
		return x;
	}
	public int getFront() throws Exception {
		DynamicStack temp=new DynamicStack();
		while(data.size()>1) {
			temp.push(data.pop());
		}
		int x=data.peek ();
		while(!temp.isEmpty()) {
			data.push(temp.pop());
		}
		return x;
	}
}
