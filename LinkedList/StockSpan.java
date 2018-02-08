package LinkedList;

public class StockSpan {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		StackUsingLL stack=new StackUsingLL();
		
		StackUsingLL span=new StackUsingLL();
	    
		stack.push(33);
		enter(stack,span,33);
		
		stack.push(32);
		enter(stack,span,32);
		
		stack.push(38);
		enter(stack,span,38);
		
		stack.push(43);
		enter(stack,span,43);
		
		stack.push(41);
		enter(stack,span,41);
		
		stack.push(39);
		enter(stack,span,39);
		
		stack.display();
		
		span.display();
		
	
	}

	public static void enter(StackUsingLL stack, StackUsingLL span, int i) throws Exception {
		// TODO Auto-generated method stub
		
		int idx=0;
		int n=stack.top();
		int[] data=new int[stack.size()];
		int s=0;
		
		while(n<=i&&!stack.isEmpty())
		{
			data[idx]=stack.pop();
			idx++;
			s++;
			if(!stack.isEmpty())
		    n=stack.top();
		
		}
		
		idx--;
		while(idx>=0)
		{
			stack.push(data[idx]);
			idx--;
		}
		
		
		span.push(s);
		
		
	}

}
