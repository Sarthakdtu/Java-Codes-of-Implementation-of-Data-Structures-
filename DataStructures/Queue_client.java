package DataStructures;

public class Queue_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
				Queue queue = new Queue(5);
				for (int i = 1; i <= 5; i++) {
					queue.enqueue(i);
					displayQueueInfo(queue);
				}
				
				queue.dequeue();
				displayQueueInfo(queue);
				queue.enqueue(60);
				displayQueueInfo(queue);
				
//				while (!queue.isEmpty()) {
//					displayQueueInfo(queue);
//					queue.dequeue();
//				}
//				queue.dequeue();
			}

			public static void displayQueueInfo(Queue q) throws Exception {
				System.out.println("*******************************************");
				q.display();
				System.out.println(q.front());
				System.out.println(q.size());
				System.out.println("*******************************************");
			}

		}
