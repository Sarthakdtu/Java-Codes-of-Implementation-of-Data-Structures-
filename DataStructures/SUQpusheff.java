package DataStructures;

public class SUQpusheff {

	DynamicQueue qp;
	DynamicQueue qs;
	
	public SUQpusheff() throws Exception
	{
		qp=new DynamicQueue();
		qs=new DynamicQueue();
	}
	
	public int size()
	{
		return qp.size();
	}
	
	public void push(int item) throws Exception
	{
		qp.enqueue(item);
	}
	
	public int pop() throws Exception
	{
		
	revQ(qp);
		int rev=qp.dequeue();
		revQ(qp);
		return rev;
				
	}
	
	public void display() throws Exception 
	{
		revQ(qp);
		qp.display();
		revQ(qp);
		
	}
	
	public int top() throws Exception
	{
		revQ(qp);
		int rev=qp.dequeue();
		revQ(qp);
		qp.enqueue(rev);
		return rev;
				
	}
	

	private static void revQ(DynamicQueue q) throws Exception
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
