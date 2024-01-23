package Stack_QPs;

import _Queue_.DynamicQueue;

public class Stack_using_Queue {
	private DynamicQueue data;

	public Stack_using_Queue() {
		this.data = new DynamicQueue();
	}

	public boolean isempty() {
		// TODO Auto-generated method stub
		return this.data.isEmpty();
	}

	public int size() {
		return data.size();
	}

	public void push(int item) throws Exception {
		DynamicQueue temp = new DynamicQueue();
		while (!data.isEmpty()) {
			temp.Enqueue(data.Dequeue());
		}
		this.data.Enqueue(item);
		while (!temp.isEmpty()) {
			data.Enqueue(temp.Dequeue());
		}
	}

	public int pop() throws Exception {
		return this.data.Dequeue();
	}

	public int peek() throws Exception {
		return this.data.getfront();
	}

}
