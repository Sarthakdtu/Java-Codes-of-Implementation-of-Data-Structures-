package DataStructures;

public class DynamicQueue extends Queue {

	public DynamicQueue() throws Exception {
		this(DEFAULT_CAPACITY);
	}

	public DynamicQueue(int capacity) throws Exception {
		super(capacity);
	}
	
	public void enqueue(int item) throws Exception
	{
		if(this.size()==this.data.length)
		{
			int[] data2=new int[2*this.size()]; 
			for(int i=0;i<this.size();i++)
			{int ai = (this.front + i) % this.data.length;
				data2[ai]=this.data[i];
			}
			this.data=data2;
			this.front=0;
		}
		super.enqueue(item);
		
	}
		
/*public int dequeue() throws Exception
	{
		int ret=super.dequeue();
		if(this.size()<this.data.length)
		{int[] data2=new int[this.size()]; 
		for(int i=0;i<this.size();i++)
		{int ai = (this.front + i) % this.data.length;
			data2[i]=this.data[ai];
		}
		this.data=data2;
		this.front=0;
			
		}
		
		return ret;
	}
	*/

}
