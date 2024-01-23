package Stack_QPs;

import java.util.Stack;

public class Min_Stack {

	private Stack<Integer> s;
	private int min;

	public Min_Stack() {
		this.s = new Stack<>();
	}

	public int pop() throws Exception{
		if(this.s.isEmpty()) {
			throw new Exception("Stack is empty");
		}
		if(this.s.peek()<this.min) {
			int pop_data=s.pop();
			int rd= this.min;
			this.min=2*this.min-pop_data;
			return rd;
		}
		else{
			return this.s.pop();
		}
	}

	public void push(int item) {
		if (this.s.isEmpty() || this.min < item) {
			if (this.s.isEmpty()) {
				this.s.push(item);
				this.min = item;
			} else {
				this.s.push(item);
			}
		} else {
			int val = 2 * item - this.min;
			this.s.push(val);
			this.min = item;
		}
	}

	public int size() {
		return this.s.size();
	}

	public int min() {
		return this.min;
	}

	public int peek() throws Exception {
		if(this.s.isEmpty()) {
			throw new Exception("Stack is empty");
		}
		if(this.s.peek()<this.min) {
			return this.min;
		}
		else{
			return this.s.pop();
		}
	}
	public void display() {
		System.out.println(this.s);
	}
}
