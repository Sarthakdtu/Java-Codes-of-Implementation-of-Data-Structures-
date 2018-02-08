package DataStructures;

public class RevStackClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Stack stack = new DynamicStack(5);
		Stack helper = new DynamicStack(5);
		
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
			
		}
		
//		for (int i = 1; i <= 5; i++) {
//			stack.push(i*10);
//			displayStackInfo(stack);
//		}
//		
//		// stack.push(60);
//		while (!stack.isEmpty()) {
//			displayStackInfo(stack);
//			stack.pop();
//		}
//		stack.pop();
		stack.display();
		reverseStack(stack,helper,0);
		stack.display();
	}
		
	public static void displayStackInfo(Stack s) throws Exception {
		System.out.println("*******************************************");
		s.display();
		//System.out.println(ds.top());
		//System.out.println(ds.size());
		//System.out.println("*******************************************");
	}

	
	public static void reverseStack(Stack stack,Stack helper,int idx) throws Exception
	{if(stack.isEmpty())
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
		
		
	
	
	
}
