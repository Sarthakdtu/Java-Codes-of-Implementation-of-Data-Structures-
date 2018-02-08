package LinkedList;

public class LinkedList {
	
	
	private class Node
	{
	
		int data;
		Node next;
		
		public Node(int data,Node next)
		{
			this.data=data;
			this.next=next;
		}
	}
	
	Node head;
	Node tail;
	int size;
	
	public LinkedList(){
		this.head=null;
		this.tail=null;
		size=0;
	}
	
	public int size()
	{
		return this.size;
	}
	
	public boolean isEmpty()
	{
		return this.size()==0;
	}
	
	public void addAtFirst(int data)
	{
		 
		Node node=new Node(data,this.head);
		this.head=node;
		
		if(this.isEmpty())
		{
			this.tail=node;
		}
		
		this.size++;
	}

	public void addAtLast(int data)
	{
		if(this.isEmpty())
	{
		addAtFirst(data);
	}
	else{
		    Node node=new Node(data,null);
		
			this.tail.next= node;
			this.tail=node;
			this.size++;
	   }
	
	}
	
	private Node getAtidx(int index) throws Exception
	{
		if(index<0||index>=this.size())
	{
		throw new Exception("Invalid Index");
	}
		
		Node temp=this.head;
		int c=0;
		while(c<index)
		{
			temp=temp.next;
			c++;
		}
		return temp;
		
	}
	
	
	public void addAtindex(int data,int index) throws Exception
	{

		if(index<0||index>this.size())
	{
		throw new Exception("Invalid Index");
	}
		if(index==0)
		{
			addAtFirst(data);
		}
		else if(index==this.size()-1)
		{
			addAtLast(data);
		}
		else
		{    Node temp=this.getAtidx(index-1);
			Node node=new Node(data,temp.next);
			temp.next=node;
			this.size++;
		}
		
	}
	public void display(){                        //DISPLAY
		Node temp=this.head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println(" END \n");
		
	}
	
	
	public int getFirst() throws Exception {
		if(this.isEmpty())
		{
			throw new Exception("Empty");
		}
		
		return this.head.data;
	}
	
	public int getLast() throws Exception {                //GET LAST
		if(this.isEmpty())
		{
			throw new Exception("Empty");
		}
		
		return this.tail.data;
	}
	
	public int getAt(int index) throws Exception {
		if(this.isEmpty())
		{
			throw new Exception("Empty");
		}
		if(index==0)
		{
			return getFirst();
		}
		else 	if(index==this.size-1)
		{
			return getLast();
		}
		else
		{
			Node temp=getAtidx(index);
			return temp.data;
		}
		
	}
	
	public void removeFirst() throws Exception                  //REMOVE FIRST
	{
		   
		if(isEmpty())
		{
			throw new Exception("Empty");
		}
		else if(this.size==1)
		{
			
			this.head=null;
			this.tail=null;
			this.size--;
		}
		else
		{
			 
			this.head=this.head.next;
		    this.size--;
		}
		
		
	}

	public void removeLast() throws Exception     //REMOVE LAST
	{
		if(isEmpty())
		{
			throw new Exception("Empty");
		}
		else
		{   Node temp=getAtidx(this.size-2);
		    temp.next=null;
			this.tail=temp;
			this.size--;
		}
		
	}
	
	public void removeAt(int index) throws Exception
	{

		if(index<0||index>this.size())
	{
		throw new Exception("Invalid Index");
	}
		if(index==0)
		{
			removeFirst();
		}
		else if(index==this.size()-1)
		{
			removeLast();
		}
		else
		{
			Node nm1=getAtidx(index-1);
			nm1.next=nm1.next.next;
			this.size--;
		}
		
	}



public void reverseDI() throws Exception {
		int left = 0, right = this.size - 1;
		
		while (left <= right) {                              //REVERSE DATA THROUGH ITERATION
			Node templeft = this.getAtidx(left);
			Node tempright = this.getAtidx(right);

			int temp = templeft.data;
			templeft.data = tempright.data;
			tempright.data = temp;
			left++;
			right--;

		}
	}



	public void reversePI() 
	{
		Node prev = this.head;
		Node curr = prev.next;
		
		while (curr != null)                           //REVERSE POINTER THROUGH ITERATION
		{
			Node tempprev = prev;
			Node tempcurr = curr;

			prev = curr;
			curr = curr.next;
			tempcurr.next = tempprev;
		}

		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}
	
	

	public void reversePR() {                     //REVERSE POINTER THROUGH RECURSION
		reversePR(this.head);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void reversePR(Node node) {

		if (node == this.tail)
		{
			return;
		}
		
		reversePR(node.next);
		node.next.next = node;
	}

	public void reverseDR() {
		HeapMover obj = new HeapMover(this.head);
		reverseDR(obj, this.head, 0);                        //REVESRE DATA THROUGH RECURSION
	}

	private void reverseDR(HeapMover left, Node right, int level) {
		if (right == null) {
			return;
		}
		reverseDR(left, right.next, level + 1);
		if (level >= this.size / 2) {
			int temp = left.node.data;
			left.node.data = right.data;
			right.data = temp;

			left.node = left.node.next;
		}
	}

	private class HeapMover {
		Node node;                                    //IMPORTANT

		HeapMover(Node node) {
			this.node = node;
		}
	}

	
public int mid() throws Exception
{
	                                            //MID DATA
Node mid=getmid();
return mid.data;
	
}

private Node getmid()
{
	Node fast=this.head;                                          //IMPORTANT ....MID NODE
	Node slow=this.head;
	while(fast.next!=null&&fast.next.next!=null)
	{
		fast=fast.next.next;
		slow=slow.next;
	}
	return slow;
}


public int kNodefromLast(int k) throws Exception
{
	if(k<1||k>this.size)
	{
		throw new Exception("Invalid index"); 
		                                                          //Kth NODE FROM LAST
	}
	
	Node fast=this.head;
	Node slow=this.head;
	
	while(k!=0)
	{
	fast=fast.next;
	k--;
	}
	
	while(fast.next!=null)
	{
		fast=fast.next.next;
		slow=slow.next;
	}
	return slow.data;
	
}
	
	
public LinkedList merge(LinkedList other)
{
	LinkedList merged=new LinkedList();
	int i=this.size;
	int j=other.size();
	Node temp1=this.head;
	Node temp2=other.head;
	int m=0;
	int n=0;
	while(m<i&&n<j)
	{                                                          //MERGE FUNCTION
		if(temp1.data>temp2.data)
		{
			merged.addAtLast(temp2.data);
			n++;
			temp2=temp2.next;
		}
		else if(temp1.data<=temp2.data)
		{
			merged.addAtLast(temp1.data);
			m++;
			temp1=temp1.next;
		}
	}
		while(m<i)
		{
			merged.addAtLast(temp1.data);
			m++;
			temp1=temp1.next;
			
		}
		while(n<j)
		{
			merged.addAtLast(temp2.data);
			n++;
			temp2=temp2.next;
			
		}
		
	
		return merged;
	
}



public void mergeSort()
{
	LinkedList sorted=mergeSortHelper(this.head,this.tail);
	this.head=sorted.head;
	this.tail=sorted.tail;
	this.size=sorted.size();

}

private LinkedList mergeSortHelper(Node low,Node high)
{
	if(this.size()==1)
	{
		LinkedList base=new LinkedList();
		base.addAtFirst(low.data);                            //MERGE SORT 
		return base;
	}
	
	
	Node mid=this.getmid();
	Node temp=mid.next;
	mid.next=null;
	LinkedList fhalf=new LinkedList(low,mid,(this.size+1)/2);
	LinkedList shalf=new LinkedList(temp,high,this.size/2);
	
	fhalf.mergeSort();
	shalf.mergeSort();
	
	LinkedList sorted=fhalf.merge(shalf);
	return sorted;
	
}

private LinkedList(Node head,Node tail,int size)
{
	this.head=head;
	this.tail=tail;
	this.size=size;
}



public void swap(int i,int j) throws Exception
{
	Node nodei=this.getAtidx(i);
	Node nodej=this.getAtidx(j);                                                         //SWAP
    int temp=nodei.data;
    nodei.data=nodej.data;
    nodej.data=temp;
}


public void eliminateDuplicate()
{                                                                           
	this.eliminateDuplicate(this.head);
}

private void eliminateDuplicate(Node node) {                                         //ELIMINATE DUPLICATE
	
	if(node==null)
	{
		return;
	}
	int n=node.data;
	Node temp=node;
	while(temp.next!=null)
	{
		if(temp.next.data==n)
		{
			if(this.tail==temp.next)
			{
				this.tail=null;
				this.tail=temp;
				temp.next=null;
				break;
			
			}
			else
			{
			temp.next=temp.next.next;
			}
			
		}
		
		
		temp=temp.next;
	}
	
	this.eliminateDuplicate(node.next);
	
	
}


public void evenAfterodd()                                                   //EVEN AFTER ODD
{
	 Node node=this.head;
	 
	  while(node.next!=null)
	  {
		    if(node.data%2==0&&node.next.data%2==1)
		    	{
		    	int temp1=node.next.data;
		    	
		         node.next.data=node.data;
		         node.data=temp1;
		         node=this.head;
		         } 
		    else
		    {
		    	node=node.next;
		    }
	  }
}

public void reverseKelements(int k) throws Exception
{
	this.reverseKelements(this.head,k,1);
	return;
}

private void reverseKelements(Node node, int k,int counter) throws Exception {       //REVERSE K ELEMENTS
	
	if(node==null)
	{
		return;
	}
	
	if(k==this.size()-1)
	{
		this.reversePR();
	}
	if(k==0)
	{
		return;
	}
	
	int i =1;
	Node temp=node;
	while(i!=k)
	{
		temp=temp.next;
		i++;
		if(temp==null)
		{
			return;		
		}
	}
	
	int c=0;
	Node temp2=node;
	while(c!=k/2)
	{
		int tempn=temp2.data;
		Node temp3=this.getAtidx((k*counter)-1-c);
		temp2.data=temp3.data;
		temp3.data=tempn;
		temp2=temp2.next;
		c++;
			
	}
	
	if(k*(counter+1)>this.size())
	{
		return;
	}
	this.reverseKelements(this.getAtidx(k*counter), k,counter+1);
	
}

public boolean checkPalindrome() throws Exception
{
	return this.checkPalindrome(this.head,0);
}

private boolean checkPalindrome(Node node,int index) throws Exception {                //PALINDROME
	if(node==null)
	{
		return true;
	}
	
	boolean ans=false;
	Node temp=this.getAtidx(this.size()-1-index);
	if(temp.data==node.data)
	{
		ans=this.checkPalindrome(node.next, index+1);
	}
	else
	{
		return false;
	}
	
	return ans;
}


public void sorting()
{
	this.sorting(this.head);
}

private void sorting(Node node) {                                            //SIMPLE SORTING
	
	if(node==null)
	{
		return;
	}
	
	int n=node.data;
	Node temp=node;
	Node toBeSwap=null;
	
	while(temp!=null)
	{
		if(temp.data<n)
		{
			toBeSwap=temp;
			n=temp.data;
		}
		temp=temp.next;
	}
	
	if(toBeSwap==null)
	{
		;
	}
	else{
	int temp2=node.data;
	node.data=n;
	toBeSwap.data=temp2;
	}
	
	
	this.sorting(node.next);
	
	
}


public void bubbleSort()                                                  //BUBBLE SORT
{
    this.bubbleSort(this.head);
}

private void bubbleSort(Node node) {
	if(node==null)
	{
		return ;
	}
	Node temp=this.head;
	Node tempnext=this.head.next;
	while(temp.next!=null)
	{
		if(tempnext.data<temp.data)
		{
			int n=tempnext.data;
			tempnext.data=temp.data;
			temp.data=n;
		}
		
		temp=temp.next;
		tempnext=tempnext.next;
		
	}
	
	this.bubbleSort(node.next);

}


public void insertionSort() throws Exception
{
	this.insertionSort(this.head,this.size()-1);
}

private void insertionSort(Node node,int index) throws Exception {
	
	if(index<=0)
	{
		return ;
	}
	
	this.insertionSort(node, index-1);
	
	Node temp=this.getAtidx(index);
	Node wnode=this.getAtidx(index-1);
	
	int n=temp.data;
	int j=index-1;
	
	while(j>0&&wnode.data>n){
		wnode.next.data=wnode.data;
		j--;
		wnode=this.getAtidx(j);
	}
     wnode.next.data=n;
}


public int sumOfElements()
{
	return this.sumOfElements(this.head);
}

private int sumOfElements(Node node) {

	if(node==null)
	{
		return 0;
	}
	int s=0;
	s=node.data+this.sumOfElements(node.next);
	return s; 
}

}



