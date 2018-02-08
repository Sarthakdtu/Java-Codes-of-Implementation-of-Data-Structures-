package LinkedList;



public class PolynomialsAdd {
	private class Node
	{
	
		int coef;
		int exp;
		Node next;
		
		public Node(int data,int exp,Node next)
		{
			this.coef=data;
			this.exp=exp;
			this.next=next;
		}
	}
	
	Node head;
	Node tail;
	int size;
	
	public PolynomialsAdd(){
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
	
	public void addAtFirst(int data,int exp)
	{
		 
		Node node=new Node(data,exp, this.head);
		this.head=node;
		
		if(this.isEmpty())
		{
			this.tail=node;
		}
		
		this.size++;
	}

	public void addAtLast(int data,int exp)
	{
		if(this.isEmpty())
	{
		addAtFirst(data, exp);
	}
	else{
		    Node node=new Node(data,exp, null);
		
			this.tail.next= node;
			this.tail=node;
			this.size++;
	   }
	
	}
	
	public void display(){                        //DISPLAY
		Node temp=this.head;
		while(temp!=null)
		{
			System.out.print("("+temp.coef+","+temp.exp+")"+"->");
			temp=temp.next;
		}
		System.out.println(" END \n");
		
	}

public PolynomialsAdd addPoly(PolynomialsAdd p1,PolynomialsAdd p2)
{
	PolynomialsAdd p=new PolynomialsAdd();
	Node t1=p1.head;
	Node t2=p2.head;
	while(t1!=null&&t2!=null)
	{
		if(t1.exp==t2.exp)
		{
			p.addAtLast(t1.coef+t2.coef,t1.exp);
			t1=t1.next;
			t2=t2.next;			
		}
		else if(t1.exp>t2.exp)
		{
			p.addAtLast(t1.coef,t1.exp);
			t1=t1.next;
		}
		else 
		{
			p.addAtLast(t2.coef,t2.exp);
			t2=t2.next;
		}
	}
	
	while(t1!=null)
	{
		p.addAtLast(t1.coef,t1.exp);
		t1=t1.next;
	}
	while(t2!=null)
	{
		p.addAtLast(t2.coef,t2.exp);
		t2=t2.next;
	}
	return p;
	
}


public PolynomialsAdd proPoly(PolynomialsAdd p1,PolynomialsAdd p2)
{
	PolynomialsAdd p=new PolynomialsAdd();
	Node t1=p1.head;
	Node t2=p2.head;
	
	Node t=p.head;
	int f=0;
	while(t1!=null)
	{
		
		t2=p2.head;
		
		while(t2!=null)
		{
			int c=t1.coef*t2.coef;
			int e=t1.exp+t2.exp;
			t=p.head;
			f=0;
			
			while(t!=null)
			{
				if(t.exp==e)
				{
					t.coef+=c;
					f=1;
					break;
				}
				t=t.next;
			}
			if(f==0)
			{
				p.addAtLast(c,e);
			}
			t2=t2.next;
		}
		
		t1=t1.next;
		
	}
	
	return p;
	
}

}
