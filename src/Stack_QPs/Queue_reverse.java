package Stack_QPs;
import _Queue_.DynamicQueue;
public class Queue_reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	DynamicQueue dq=new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Display();
		reverse(dq);
		dq.Display();
	}

	private static void reverse(DynamicQueue dq) throws Exception {
		// TODO Auto-generated method stub
		if(dq.isEmpty()) {
			return;
		}
		int x=dq.Dequeue();
		reverse(dq);
		dq.Enqueue(x);
	}
	
}
