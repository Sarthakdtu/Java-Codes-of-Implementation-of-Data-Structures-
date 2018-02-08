package DataStructures;

public class DynamicStack extends Stack {

	public DynamicStack() throws Exception {
		this(DEFAULT_CAPACITY);
		
	}
	
	public DynamicStack(int capacity) throws Exception {
		super(capacity);
		
	}

	
	
	public void push (int item) throws Exception{
		
		if(this.size()==this.data.length){
			int[] data2=new int[2*data.length];
			for(int i=0;i<data.length;i++)
		{
			data2[i]=this.data[i];
				
		}	
			this.data=data2;
		}
		super.push(item);
	}
	
/*public int pop() throws Exception
{
	int retval=super.pop();
	if(this.size()<this.data.length)
{int[] data2=new int[this.size()];
for(int i=0;i<data2.length;i++)
{
	data2[i]=this.data[i];
		
}	
	this.data=data2;
}
	return retval;
}*/

}
	
