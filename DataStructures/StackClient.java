package DataStructures;

public class StackClient {

	
			public static void main(String[] args) throws Exception {
				// TODO Auto-generated method stub
				Stack stack = new Stack(5);
				
				for (int i = 1; i <= 5; i++) {
					stack.push(i);
					displayStackInfo(stack);
				}
				
//				// stack.push(60);
//				while (!stack.isEmpty()) {
//					displayStackInfo(stack);
//					stack.pop();
//				}
//				stack.pop();
			}

			public static void displayStackInfo(Stack s) throws Exception {
				System.out.println("*******************************************");
				s.display();
				System.out.println(s.top());
				System.out.println(s.size());
				System.out.println("*******************************************");
			}

		}
