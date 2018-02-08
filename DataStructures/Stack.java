package DataStructures;

public class Stack {

		protected int[] data;
		protected int tos;
		public static final int DEFAULT_CAPACITY = 10;

		public Stack() throws Exception {
			this(DEFAULT_CAPACITY);
		}

		public Stack(int capacity) throws Exception {
			if (capacity < 1) {
				throw new Exception("Invalid Capacity");
			}

			this.data = new int[capacity];
			this.tos = -1;
		}

		public int size() {
			return this.tos + 1;
		}

		public boolean isEmpty() {
			if (this.size() == 0) {
				return true;
			} else {
				return false;
			}
		}

		public void push(int item) throws Exception {
			if (this.size() == this.data.length) {
				throw new Exception("Stack is Full");
			}
			this.tos++;
			this.data[this.tos] = item;
		}

		public int pop() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return retVal;
		}
		
		public int top()throws Exception{
			if (this.size() == 0) {
				throw new Exception("Stack is Empty");
			}
			int retVal = this.data[this.tos];
			return retVal;
		}
		
		public void display(){
			for(int i=this.tos;i>=0;i--){
				System.out.print(this.data[i]+" ");
			}
			System.out.println("END");
		}
	}

