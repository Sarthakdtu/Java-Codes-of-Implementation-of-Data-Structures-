package DataStructures;

public class DynamicQClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Queue queue = new DynamicQueue(5);
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
			//displayQueueInfo(queue);
		}
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i*10);
		//	displayQueueInfo(queue);
		}
		
		//queue.dequeue();
		//queue.dequeue();
		//displayQueueInfo(queue);
		queue.enqueue(60);
		//displayQueueInfo(queue);
		queue.display();
	}
		
		
	/*	public static void displayQueueInfo(Queue q) throws Exception {
			System.out.println("*******************************************");
			q.display();
			System.out.println(q.front());
			System.out.println(q.size());
			System.out.println("*******************************************");
		}*/

	}
