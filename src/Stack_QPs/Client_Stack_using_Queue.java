package Stack_QPs;

public class Client_Stack_using_Queue {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stack_using_Queue s=new Stack_using_Queue();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
	}

}
