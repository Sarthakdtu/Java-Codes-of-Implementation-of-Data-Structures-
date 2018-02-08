package DataStructures;

public class RevQClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Queue queue = new DynamicQueue(5);
		Queue helper = new DynamicQueue(5);
		
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
			//displayQueueInfo(queue);
		}
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i*10);
			//displayQueueInfo(queue);
		}
	queue.display();
	revQ(queue);
	queue.display();
	}
		
		
		
		public static void revQ(Queue q) throws Exception
		{
			if(q.isEmpty())
			{
				return;
			}
			
			
			int item=q.dequeue();
			revQ(q);
			q.enqueue(item);
			
			
		}
		
		
}
