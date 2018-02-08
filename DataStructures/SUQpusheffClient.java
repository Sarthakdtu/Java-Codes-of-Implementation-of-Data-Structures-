package DataStructures;

public class SUQpusheffClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		SUQpusheff stack=new SUQpusheff();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.display();
		System.out.println(stack.pop());
		System.out.println(stack.top());
		stack.display();
		
		
		
		
		
	}

}
