package DataStructures;

public class QUSenqefClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
         QUSenqef q=new QUSenqef();
         
         q.enqueue(10);
         q.enqueue(20);
         q.enqueue(30);
         q.enqueue(50);
         q.display();
         int a=q.dequeue();
         System.out.println(q.size());
         System.out.println(a);
         a=q.dequeue();
         System.out.println(a);
         q.display();
         
         
         
	}

}
