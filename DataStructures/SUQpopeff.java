package DataStructures;

public class SUQpopeff {

	DynamicQueue qp;
	DynamicQueue qs;
	
	public SUQpopeff() throws Exception
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
		revQ(qp);
		qp.enqueue(item);
		revQ(qp);
	}
	
	public int pop() throws Exception
	{
		
	
		int rev=qp.dequeue();
		
		return rev;
				
	}
	
	public void display() throws Exception 
	{
		
		qp.display();
		
		
	}
	
	public int top() throws Exception
	{
		
		int rev=qp.dequeue();
		
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
