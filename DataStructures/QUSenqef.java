package DataStructures;

public class QUSenqef {
	
	DynamicStack sp;
	DynamicStack ss;
	
	public QUSenqef() throws Exception
	{
		sp=new DynamicStack();
		ss=new DynamicStack();
	}
	
	public int size(){
		return this.sp.size();
		
	}
	
	public void enqueue(int item) throws Exception
	{
		this.sp.push(item);
	}
	
	
	
	public void display() throws Exception
	{
		reverseStack(sp,new DynamicStack(),0);
		this.sp.display();
		reverseStack(sp,new DynamicStack(),0);
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
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}
		while (!(this.sp.size() == 1)) {
			this.ss.push(this.sp.pop());
		}
		int rv = this.sp.pop();
		while (!(this.ss.isEmpty())) {
			this.sp.push(this.ss.pop());
		}
		
		return rv;
	}

	public int front() throws Exception{
		if (this.size() == 0) {
			throw new Exception("Queue is Empty");
		}
		while (!(this.sp.size() == 1)) {
			this.ss.push(this.sp.pop());
		}
		int rv = this.sp.pop();
		this.ss.push(rv);
		while (!(this.ss.isEmpty())) {
			this.sp.push(this.ss.pop());
		}
		
		return rv;
	}


	
		

}
