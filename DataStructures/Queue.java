package DataStructures;

public class Queue {
	
		protected int[] data;
		private int size;
		protected int front;

		public static final int DEFAULT_CAPACITY = 10;

		public Queue() throws Exception {
			this(DEFAULT_CAPACITY);
		}



		
		

		public Queue(int capacity) throws Exception {
			if (capacity < 1) {
				throw new Exception("invalid capacity");
			}

			this.data = new int[capacity];
			this.front = 0;
			this.size = 0;
		}

		public int size() {
			return this.size;
		}

		public boolean isEmpty() {
			return this.size() == 0;
		}

		public void enqueue(int item) throws Exception {
			if (this.data.length == this.size()) {
				throw new Exception("Queue is full.");
			}
			int ai = (this.size + this.front) % this.data.length;
			this.data[ai] = item;
			this.size++;
		}
  
		public int dequeue() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Queue is Empty");
			}
			int retVal = this.data[this.front];
			this.data[this.front] = 0;
			this.front = (this.front + 1) % this.data.length;
			this.size--;
			return retVal;
		}

		protected int front() throws Exception {
			if (this.size() == 0) {
				throw new Exception("Queue is Empty");
			}
			int retVal = this.data[this.front];
			return retVal;
		}

		public void display() {
			for (int i = 0; i < this.size; i++) {
				int ai = (this.front + i) % this.data.length;
				System.out.print(this.data[ai] + ", ");
			}
			System.out.println("END");
		}
		
		
		public void revQR()
		{
			revQR(this.data,0);
			
		}
		
		private void revQR(int[] a,int idx)
		{
		
			if(idx==this.size/2)
			{
				return ;
			}
			int last=this.size()-idx;
			int temp=this.data[idx];
			this.data[idx]=this.data[last];
			this.data[last]=temp;
			revQR(this.data,idx+1);
			
			
			
		}
		

	}
