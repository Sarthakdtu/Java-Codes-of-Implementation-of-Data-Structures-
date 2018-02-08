package BinarySearchTree;


import java.util.ArrayList;

import LinkedList.LinkedList;






public class BinarySearchTree {

	private class Node {
		Node left;
		Node right;
		int data;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private int size = 0;
	private Node root;

	BinarySearchTree() {
		this.root = null;
		
	}
	
	public void add(int data)                                                   //ADD
	{
			
		this.add(this.root,data);
	}

	
	private void add(Node parent, int data) {
		
		if(parent==null)
		{
			Node node=new Node(data,null,null);
			this.root=node;
			this.size++;
			return;
			
		}
		else if(data<=parent.data){
			if(parent.left==null){
			Node node=new Node(data,null,null);
			this.size++;
			parent.left=node;
			return;
			}
			else 
			{
				this.add(parent.left,data);
				return;
			}
		}
		else if(data>parent.data){
			if(parent.right==null){
			Node node=new Node(data,null,null);
			parent.right=node;
			this.size++;
			return;
			}
			else 
			{
				this.add(parent.right,data);
				return;
			}
		}
		
	}
	
	public void display()
	{
		this.display(this.root);
		
	}

	private void display(Node node) {
		                                                    //DISPLAY
		if(node.left!=null)
		{
			System.out.print(node.left.data+" => "); 
		}
		else
		{
			System.out.print("End => ");
		}
		
		System.out.print(node.data);
		
		if(node.right!=null)
		{
			System.out.print(" <= "+node.right.data); 
		}
		else
		{
			System.out.print(" <= End ");
		}
		
		System.out.println();
		
		if(node.left!=null){
			this.display(node.left);
			}
		
		if(node.right!=null){
			this.display(node.right);
			
		}
		
	}
	
	public int size()
	{
		return this.size;
	}
	

	public boolean find(int data)
	{
		return this.find(this.root,data);
	}

	private boolean find(Node node,int data) {
		
		if(node.data==data)                                                       //FIND
		{
			return true;
		}
		boolean ansl=false;
		if(node.left!=null)ansl= this.find(node.left,data);
		boolean ansr=false;
		if(node.right!=null)ansr=this.find(node.right, data);
		if(ansl||ansr)
		{
			return true;
		}
		
		
		return false;
	}
	
	
	
	public int max()
	{
		return this.max(this.root).data;
	}

	private Node max(Node node) {
		
		if(node.right==null)
		{
			return node;
		}
		else
		{
			return this.max(node.right);
			
		}
		
		
	}
	
	public int min()
	{
		return this.min(this.root).data;
	}

	private Node min(Node node) {
		
		if(node.left==null)
		{
			return node;
		}
		else
		{
			return this.min(node.left );
			
		}
		
		
	}
	
	public void remove(int data)
	{
		this.remove(this.root,data);
	}

	private void remove(Node node, int data) {
		
		
		
	}
	
	
	
	BinarySearchTree(int... arr)                                            //TREE USING ARRAY
	{
		this.root=this.construct(arr,0,arr.length-1);
		
}

	private Node construct(int[] arr, int si, int li) {
		
		if(si>li)
		{
			return null;
		}
		
		int mid=(si+li)/2;
		
		Node node=new Node(arr[mid],null,null);
		
		node.left=this.construct(arr, si, mid-1);
		node.right=this.construct(arr, mid+1,li);
		
		return node;
	}
	
	
	private Node lca(int d1, int d2, Node node) {
		if (node == null) {
			return null;
		}

		if (node.data == d1 || node.data == d2) {
			return node;
		}
		Node llca = this.lca(d1, d2, node.left);
		Node rlca = this.lca(d1, d2, node.right);
		if (llca != null && rlca != null) {
			return node;
		} else if (llca != null) {
			return llca;
		} else if (rlca != null) {
			return rlca;
		} else {
			return null;
		}

	}
	
	
		
	public void sumNode(int k)                                          //TWO NODES WITH SUM K
	{
		int[] arr=this.sumNode(this.root,k);

		System.out.println(arr[0]);
		System.out.println(arr[1]);
	}

	private int[] sumNode(Node node, int k) {
		if(node==null)
		{
			return null;
		}
		int leftSum=k-node.data;

		int [] arr=new int[2];
		int[] rarr;
		int[] larr;
		
		if(this.find(leftSum))
		{
			arr[0]=node.data;
			arr[1]=leftSum;
			return arr;
		}
		else
		{
			larr=this.sumNode(node.left, k);
			rarr=this.sumNode(node.right, k);
		}
		
		if(larr.length>0)
		{
			return larr;
		}
		
		if(rarr.length>0)
		{
			return rarr;
		}
		
		return null;
	}
		
	
	
	
	public void treeDuplicate()
	{
		BinarySearchTree otree=new BinarySearchTree();
		otree.root=this.root;
		this.treeDuplicate(this.root,otree.root);
	}

	private void treeDuplicate(Node parent,Node oparent) 
	{
		
		if(parent.left!=null)
		{swap(parent.left,oparent);}
		else
		{
			swap(parent,oparent);
			return ;
		}
		if(parent.right!=null)
		{	if(parent.right.data==oparent.right.data)
		 {
			swap(parent.right,oparent.right);
		 }
		}
		
		this.treeDuplicate(parent.left.left, oparent.left);
		return ;
	}
	
	private void swap(Node parent,Node node)
	{
		int temp=parent.data;
		
		if(parent.left!=null)
		{
			swap(parent.left,node.left);
			
		}
		else
		{
			this.add(parent.left,temp);
			parent.data=node.data;
			return ;
		}
		
		parent.data=node.data;
		return ;
	}
	
	
	public void sumToK(int k)
	{
		this.sumToK(k,this.root);
	}

	private void sumToK(int k, Node node)                              //SUM OF TWO NODES = K
	{
		int n=k-node.data;
	
		if(this.find(n)&&n<node.data)
		{
			if(n!=k/2)
				System.out.print(node.data+" and "+ n);  
		}
		
		
		    if(node.left!=null)
			this.sumToK(k, node.left);
		     
		    if(node.right!=null)
			this.sumToK(k, node.right);
				
	}
	
	
	
	public void possiblePath(int k)
	{
		ArrayList<LinkedList> list=new ArrayList<>();                             //ROUGH --WRONG
		LinkedList listtba=new LinkedList();                                 //CORRECT ONE AT BINARY TREE
		list.add(listtba);
		int a=this.possiblePath(k,this.root,list);
		for(int i=0;i<list.size();i++)
		{
			list.get(i).display();
		}
	}

	private static int index=1;
	
	private int possiblePath(int k, Node node, ArrayList<LinkedList> list) 
	{
		if(node.data>k)
		{
			return -1;
		}
		
		
		
		if(list.get(index-1).sumOfElements()==k)
		{
			
			list.get(index-1).addAtFirst(node.data);
			LinkedList listtba=new LinkedList();
			list.add(listtba);
			index++;
			return index-2;
		}
		
		int isL=-1;
		if(node.left!=null)
		 {
			isL=this.possiblePath(k, node.left,list);
		 }
		
		if(isL!=-1)
		{
			list.get(isL).addAtFirst(node.data);
			
		}
	    int isR=-1;
		if(node.right!=null)
		{

			if(node.right.data+list.get(index-1).sumOfElements()<k)
			{
				  isR = this.possiblePath(k, node.right,list);
			}
			
		}
						
		if(isR!=-1)
		{
			list.get(isR).addAtFirst(node.data);
			return isR;
			
		}
		else
		{
			return isL;
		}
		
		
		
	}
	
	
}
