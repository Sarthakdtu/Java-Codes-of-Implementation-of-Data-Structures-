package LinkedList;

public class StackUsingLLClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingLL stack=new StackUsingLL();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		int n=stack.pop();
		stack.display();
		System.out.println(stack.pop());
		System.out.println(stack.size());

	}

}
