package GenericTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;



public class GenericTree {
	
	
	int size=0;
	
	private class Node
	{
		ArrayList<Node> children;

		 int data;
		 
		 Node(int data)
		{
			 this.data=data;
			 children= new ArrayList<>();
		
		}
		
		
	}
	
	private Node root;
	GenericTree()
	{
		Scanner s=new Scanner(System.in);
	    this.root=takeInput(s,null,0);
		
	}
	public GenericTree(String str)
	{
		this.root=null;
	}
	private Node takeInput(Scanner s, Node parent, int i) {
		
		if(parent==null)
		{
			System.out.println("Enter the data for parent= ");
		}
		else
		{
			System.out.println("Enter the data for "+ i +" th child of " + parent.data+"= ");
			
		}
		
		int nodeData=s.nextInt();
		Node node=new Node(nodeData);
		this.size++;
		System.out.println("Enter the no. of child for "+node.data+"= ");
		int numChildren=s.nextInt();
		for(int j=0;j<numChildren;j++)
		{
			Node child=this.takeInput(s, node, j);               //IMPORTANT
			node.children.add(child);
		}
		
		
		return node;
		
	}
	
	public void display()
	{
		this.display(this.root);
	}
	private void display(Node node) {
		
		System.out.print(node.data+" -> ");
		for(int i=0;i<node.children.size();i++)
		{
			System.out.print(node.children.get(i).data+" , ");
		}
		System.out.println(" End ");
		for(int i=0;i<node.children.size();i++)
		{
			this.display(node.children.get(i));
		}
		
	}
	
	public int  size()
	{
		return(size(this.root)-1);
	}
	
	private int size(Node node) {
		int rv=0;
		for(int i=0;i<node.children.size();i++)
		{
			int childsize=this.size(node.children.get(i));
			rv=rv+ childsize;
			
		}
		rv=rv+1;
		return rv;
				
	}

	public int max()                                               //MAX
	{
		return max(this.root);
	}
	
	
	private int max(Node node) {
		int max=node.data;
		if(node.children.size()==0)
		{
			return max;
		}
		int s=node.children.size();
		for(int i=0;i<s;i++)
		{		
			int max2=max(node.children.get(i));
			if(max<max2)
			{
				max=max2;
			}
			
		}
		
		return max;
		
	}
	
	
	public int height()
	{
		return height(this.root,0);
	}
	
	
	private int height(Node node,int counter) {
		int s=node.children.size();
		int h1;
		
		if(s==0)
		{
			
			return counter;
		}
		
		int h=counter;
		for(int i=0;i<s-1;i++)
		{
			h1=height(node.children.get(i),counter+1);
			int hnext=height(node.children.get(i+1),counter+1);
			if(h<h1||h<hnext){
			if(hnext>h1)
			{
				h=hnext;
			}
			else{
				
				h=h1;
			}
			}
			
		}

		return h;
		
	}
	
	
	
	
	public boolean find(int data)
	{
		return find(this.root,data);
	}
	
	
	private boolean find(Node node, int data) {
		
		if(node.data==data)
		{
			return true;
		}
		
		boolean ans;
		for(int i=0;i<node.children.size();i++)
		{
			ans=find(node.children.get(i),data);
			if(ans)
			{
				return true;
			}
		}
		
		return false;
	}
	
	
	public void mirror()
	{
		mirror(this.root);
	}
	
	
	private void mirror(Node node) {
		int s=node.children.size();
		if(s==0)
		{
			return ;
		}
		
		
		for(int i=0;i<node.children.size();i++)
		{
			mirror(node.children.get(i));
			
		}
		
		for(int i=0;i<s/2;i++)
		{
			int temp=node.children.get(i).data;
			node.children.get(i).data=node.children.get(s-i-1).data;
			node.children.get(s-i-1).data=temp;
			
			ArrayList temp2=node.children.get(i).children;
			node.children.get(i).children=node.children.get(s-1-i).children;
			node.children.get(s-1-i).children=temp2;
			
		}
		
		
	}
	
	
	public void printAtLevel(int level)
	{
		this.printAtLevel(this.root,level,0);
	}
	
	
	private void printAtLevel(Node node, int level,int index) {
		
		if(index==level-1)
		{
			for(int i=0;i<node.children.size();i++)
			{
				System.out.print(node.children.get(i).data+" , ");
			}
			
			return;
		}
		else
		{
			for(int i=0;i<node.children.size();i++)
			printAtLevel(node.children.get(i),level,index+1);
		}
		
	}
	
	public void preOrderTraverse(){
		System.out.println("\n");
		preOrderTraverse(this.root);
		System.out.println(" END ");
	}
	
	private void preOrderTraverse(Node node) {
		System.out.println(node.data);
		for(int i=0;i<node.children.size();i++)
		{
				this.preOrderTraverse(node.children.get(i));
		}

		
		
	}
	
	
	public void postOrderTraverse(){
		System.out.println("\n");
		postOrderTraverse(this.root);
		System.out.println(" END ");
	}
	
	private void postOrderTraverse(Node node) {
		
		for(int i=0;i<node.children.size();i++)
		{
				this.postOrderTraverse(node.children.get(i));
		}
		System.out.println(node.data);

	}
	
	
	
	
	public void levelOrder(){
		Queue <Node> queue =new LinkedList<>();
		queue.add(this.root);
		while(!queue.isEmpty())
		{
			Node node=queue.remove();
			System.out.print(node.data);
			for(int i=0;i<node.children.size();i++)
			{
				queue.add(node.children.get(i));
			}
			
		}
	}
	
	public int sumOfNodes()                           //SUM OF NODES
	{
		return this.sumOfNodes(this.root);
	}
	
	private int sumOfNodes(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		
		int sum=node.data;
		for(int i=0;i<node.children.size();i++)
		sum=sum+this.sumOfNodes(node.children.get(i));
		
		return sum;
		
	}
	
	
	public int secondMax()
	{
		return this.secondMax(this.root,Integer.MIN_VALUE,this.max());
	}
	private int secondMax(Node node,int max2,int max) {                       //SECOND MAXIMUM NODE
		
		if(node==null)
		{
			return max2;
		}
		
		if(node.data>max2&&node.data<max)
		{
			max2=node.data;
		}
		for(int i=0;i<node.children.size();i++){
			
			max2=this.secondMax(node.children.get(i), max2, max);
		
		}
		
		return max2;
		
	}
	
	
	public int justGreaterThanN(int n) throws Exception{
		int f=this.justGreaterThanN(this.root,Integer.MAX_VALUE,n);
		
		if(f<Integer.MAX_VALUE){
			return f;
		}
		else
		{
			throw new Exception("No Node found");
		}
	}
	
	private int justGreaterThanN(Node node,int found,int n) {            //JUST GREATER THAN N
		
		int greater=node.data;
		
		if(greater<found&&greater>n)
		{
			found=greater;
		}
		
             for(int i=0;i<node.children.size();i++){			
			found=this.justGreaterThanN(node.children.get(i), found, n);
		}
		
		return found;
	}
	
	public int numberOfLeafNodes()
	{
		return this.numberOfLeafNodes(this.root);
	}
	
	
	private int numberOfLeafNodes(Node node) {                      //NUMBER OF LEAF NODES
		
		int count=0;
		
		if(node.children.size()==0)
		{
			return 1;
		}
		else
		{
			for(int i=0;i<node.children.size();i++){
				count=count+this.numberOfLeafNodes(node.children.get(i));
			}
		}
		
		return count;
		
	}
	
	public boolean isSame(GenericTree tree)
	{
		return this.isSame(this.root,tree.root);
	}
	
	
	private boolean isSame(Node tnode, Node onode) {                       //IDENTICAL TREES
		
		
		boolean same=true;
		
		if(tnode.data!=onode.data)
		{
			return false;
		}
		else
		{
			if(tnode.children.size()!=onode.children.size())
			{
				return false;
			}
			else 
			{
				for(int i=0;i<tnode.children.size();i++){
					if(!same)
					{
						return false;
					}
				same=this.isSame(tnode.children.get(i),onode.children.get(i));	
				
				}
			}
		}
		return same;
	}
	
	
	public void replaceWithDepth()
	{
		this.replaceWithDepth(this.root,0);
	}

	private void replaceWithDepth(Node node,int idx) {
		
		node.data=idx;	
		
		for(int i=0;i<node.children.size();i++)
		{
			this.replaceWithDepth(node.children.get(i),idx+1);
						
		}
				
				
	}
}
