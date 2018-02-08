package HashTables;

public class LinkedList <T> {

	
	private class Node
	{
	
		T data;
		Node next;
		
		public Node(T data,Node next)
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
	
	public void addAtFirst(T data)
	{
		 
		Node node=new Node(data,this.head);
		this.head=node;
		
		if(this.isEmpty())
		{
			this.tail=node;
		}
		
		this.size++;
	}

	public void addAtLast(T data)
	{
		if(this.isEmpty())
	{
		addAtFirst(data);
	}
	else{
		    Node node=new Node(data,null);
		
			this.tail.next=  node;
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
	
	
	public void addAtindex(T data,int index) throws Exception
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
	
	
	public T getFirst() throws Exception {
		if(this.isEmpty())
		{
			throw new Exception("Empty");
		}
		
		return this.head.data;
	}
	
	public T getLast() throws Exception {                //GET LAST
		if(this.isEmpty())
		{
			throw new Exception("Empty");
		}
		
		return this.tail.data;
	}
	
	public T getAt(int index) throws Exception {
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
	
	public T removeFirst() throws Exception                  //REMOVE FIRST
	{
		   
		if(isEmpty())
		{
			throw new Exception("Empty");
		}
		Node rv=this.head;
		
		 if(this.size==1)
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
		
		return rv.data;
	}

	public T removeLast() throws Exception                          //REMOVE LAST
	{
		if(isEmpty())
		{
			throw new Exception("Empty");
		}
		
		Node rv=this.tail;
		   Node temp=getAtidx(this.size-2);
		    temp.next=null;
			this.tail=temp;
			this.size--;
		return rv.data;
		
	}
	
	public T removeAt(int index) throws Exception
	{

		if(index<0||index>this.size())
	{
		throw new Exception("Invalid Index");
	}
		if(index==0)
		{
			return this.removeFirst();
		}
		else if(index==this.size()-1)
		{
			return this.removeLast();
		}
		else
		{
			Node rv=this.getAtidx(index);
			Node nm1=getAtidx(index-1);
			nm1.next=nm1.next.next;
			this.size--;
			return rv.data;
		}
		
	}


public int find(T data)                                         //FIND METHOD ESPECIALLY FOR HASH TABLE
{
	int idx=0;
	for(Node temp=this.head;temp!=null;temp=temp.next)
	{
		if(temp.data.equals(data))
		return idx;
		
		idx++;
	}
	
	return -1; 
}
	
	
	


	
}
