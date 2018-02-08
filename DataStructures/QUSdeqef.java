package DataStructures;

public class QUSdeqef {

	DynamicStack sp;
	DynamicStack ss;
	
	public QUSdeqef() throws Exception
	{
		sp=new DynamicStack();
		ss=new DynamicStack();
	}
	
	public int size(){
		return this.sp.size();
		
	}
	
	public void enqueue(int item) throws Exception
	{
		reverseStack(sp,new DynamicStack(),0);
		this.sp.push(item);
		reverseStack(sp,new DynamicStack(),0);
	}
	
	
	
	public void display() throws Exception
	{
		
		this.sp.display();
		
	}
	
	private static void reverseStack(DynamicStack stack,DynamicStack helper,int idx) throws Exception
	{
		if(stack.isEmpty())
	{
		return;
	}
		
		int item=stack.pop();
		reverseStack(stack,helper,idx+1);
		helper.push(item);
		if(idx==0)
		while(!helper.isEmpty())
		stack.push(helper.pop());
				
		}
	
	public int dequeue() throws Exception {
		
		int rv = this.sp.pop();
		
		return rv;
	}

	public int front() throws Exception{
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}
int rv = this.sp.pop();
		sp.push(rv);
		return rv;
	}


	
	
}
