package DataStructures;

public class SUQpopeffClient {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		SUQpopeff stack=new SUQpopeff();
		
		stack.push(10);
		stack.push(20);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.display();
		System.out.println(stack.pop());
		stack.display();
		System.out.println(stack.top());

	}

}
