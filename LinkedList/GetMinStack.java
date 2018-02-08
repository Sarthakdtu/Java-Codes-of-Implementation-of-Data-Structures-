package LinkedList;

public class GetMinStack {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		StackUsingLL stack=new StackUsingLL();
		StackUsingLL helper=new StackUsingLL();
		stack.push(3);
		helper.push(3);
		stack.push(2);
		check(helper,2);
		stack.push(5);
		check(helper,5);
		stack.push(7);
		check(helper,7);
		stack.push(1);
		check(helper,1);
		stack.push(8);
		check(helper,8);
		stack.push(4);
		check(helper,4);
		stack.push(9);
		check(helper,9);
 		
		helper.display();
		
		
	}

	public static void check(StackUsingLL helper, int i) throws Exception {
		// TODO Auto-generated method stub
		if(helper.top()>i)
		{
			helper.pop();
			helper.push(i);
		}
		
	}

}
