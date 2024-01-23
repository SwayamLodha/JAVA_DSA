package Linked_list;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);
		ll.addlast(40);
		ll.addlast(50);
		ll.addlast(60);
		ll.addlast(70);
		ll.addlast(80);
		ll.Display();
		System.out.println(ll.removeFirst());
		ll.Display();
		System.out.println(ll.removeLast());
		ll.Display();
		System.out.println(ll.removeatIndex(3));
		ll.Display();
		ll.addatindex(999, 3);
		ll.Display();
	}

}
