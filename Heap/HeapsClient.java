package Heap;

public class HeapsClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Heaps<Integer> heap=new Heaps();

		heap.add(35);
		heap.add(30);
		heap.add(25);
		heap.add(20);
		heap.add(22);
		heap.add(10);
		heap.add(5);
		heap.add(12);
		heap.add(18);
		heap.add(15);
		heap.add(19);
		heap.add(7);
		heap.add(8);
		//heap.add(29);
		heap.display();
		//heap.remove();
	//	System.out.println(heap.get());
		System.out.println(heap.size()); 
		//heap.display();
		System.out.println(heap.returnMedian());
	}

}
