package Heap;

public class heap_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		min_heap hp=new  min_heap();
		hp.add(10);
		hp.add(20);
		hp.add(30);
		hp.add(5);
		hp.add(7);
		hp.add(3);
		hp.add(2);
		hp.add(-10);
		System.out.println(hp.getmin());
		hp.display();
		System.out.println(hp.remove());
		System.out.println(hp.remove());
		hp.display();
	}

}
