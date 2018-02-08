package DataStructures;

public class DyanamicStack_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
			
		Stack stack = new DynamicStack(5);
		
		for (int i = 1; i <= 5; i++) {
			stack.push(i);
			//isplayStackInfo(stack);
		}
		
		for (int i = 1; i <= 5; i++) {
			stack.push(i*10);
			//displayStackInfo(stack);
		}
		stack.display();
		// stack.push(60);
	while (!stack.isEmpty()) {
			//displayStackInfo(stack);
			stack.pop();
			System.out.println(stack.size());
		}
		//stack.pop();
	stack.display();
	}
		
	//public static void displayStackInfo(Stack s) throws Exception {
		//System.out.println("*******************************************");
		//s.display();
		//System.out.println(ds.top());
		//System.out.println(ds.size());
		//System.out.println("*******************************************");
	//}

}
		
		
		
		
		
