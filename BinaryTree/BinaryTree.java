package BinaryTree;


import LinkedList.LinkedList;
import java.util.Scanner;

public class BinaryTree {
	
	private class Node
	{
		Node left;
		Node right;
		int data;
		Node(int data,Node left,Node right)
		{
			this.data=data;
			this.left=left;
			this.right=right;
		}
	}
		
		
	
	private int size=0;
	private Node root;
	
	BinaryTree(){
		Scanner s=new Scanner(System.in);
		this.root=takeInput(s,null,false);
		
	            }
	BinaryTree(String str)
	{
		this.root=null;
	}

	private Node takeInput(Scanner s, Node parent, boolean isleftorright) {    //TAKE_INPUT
		
		if(parent==null)
		{
			System.out.println("Enter the data for root node");
		}
		else
		{
			if(isleftorright)
			{
				System.out.println("Enter the data for left child of "+ parent.data );
			}
			else
			{
				System.out.println("Enter the data for right child of "+ parent.data );	
			}
		}
		
		int nodeData=s.nextInt();
		Node node=new Node(nodeData,null,null);
		this.size++;
		
		boolean choice=false;
		System.out.println("Does the left child for "+node.data +" exist ?");
		choice=s.nextBoolean();
		
		if(choice)
		{
		        node.left=this.takeInput(s, node, true);	
		}
		
		choice=false;
		
		System.out.println("Does the right child for "+node.data +" exist ?");
		choice=s.nextBoolean();
		
		if(choice)
		{
		        node.right=this.takeInput(s, node, false);	
		}
		
		
		return node;
	}
	
	public boolean isEmpty()                                  //IS_EMPTY
	{
		return (this.size()==0);
	}
	
	public int size()                                         //SIZE()
	{
		return this.size;
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
	
	public int size2()
	{
		return this.size2(this.root);
	}

	private int size2(Node node) {                                          //SIZE 2	
		
		int retval=0;
		int leftsize=0;
		int rightsize=0;
		 if(node.left!=null) leftsize=this.size2(node.left);
		 if(node.right!=null)rightsize=this.size2(node.right);
		retval=1+leftsize+rightsize;
		return retval;
	}
	
	public int max()
	{
		return this.max(this.root);
	}

	private int max(Node node) {
		                                                                    //MAX VALUE
		int max=node.data;
		int maxl=0;
		if(node.left!=null) maxl=this.max(node.left);
		int maxr=0;
		if(node.right!=null) maxr=this.max(node.right);
		int max2;
		if(maxl>maxr)
		{
			max2=maxl;
		}
		else
		{
			max2=maxr;
		}
		
		if(max<max2)
		{
			max=max2;
		}
		
		return max;
	}
	
	public int min()
	{
		return this.min(this.root);                         // MIN VALUE
	}

	private int min(Node node) {
		
		int min=node.data;
		int minl=Integer.MAX_VALUE;
		if(node.left!=null) minl=this.min(node.left);
		int minr=Integer.MAX_VALUE;
		if(node.right!=null) minr=this.min(node.right);
		int min2;
		if(minl<minr)
		{
			min2=minl;
		}
		else
		{
			min2=minr;
		}
		
		if(min>min2)
		{
			min=min2;
		}
		
		return min;
	}
	
	
	public int height()
	{
		return this.height(this.root,0);
	}

	private int height(Node node,int counter) {
                                                                                 //HEIGHT	 	
	int maxLvalue=0;
	int maxRvalue=0;
	
	if(node.left!=null) maxLvalue=this.height(node.left,counter+1);
	
	if(node.right!=null) maxRvalue=this.height(node.right,counter+1);
		
		if(maxLvalue>maxRvalue)
		{
			 counter=maxLvalue;
		}
		else if(maxLvalue<maxRvalue)
		{
			counter= maxRvalue;
		}
		
		return counter;
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
	
	public void mirror()
	{
		this.mirror(this.root);
	}

	private void mirror(Node node) {
		if(node==null)
		{
			return ;                                               //MIRROR
		}
		
		
		mirror(node.left);
		mirror(node.right);
		
		Node temp=node.left;
		node.left=node.right;
		node.right=temp;
		
	}
	
	public void findAtLevel(int l) throws Exception
	{
		this.findAtLevel(this.root,l,0);
	}

	private void findAtLevel(Node node, int l,int index) throws Exception {             //FIND AT LEVEL
		
		if(node==null)
		{
			return;
		}
		
		if(l>=this.size())
		{
			throw new Exception("invalid Index");
		}
		
		if(index==l-1)
		{
			if(node.left!=null)
			System.out.print(node.left.data+" & ");
			if(node.right!=null)
				System.out.print(node.right.data+" & ");
			return;
		}
		
		else if(l==0)
		{
			System.out.println(node.data);
			return;
		}
		
		
		this.findAtLevel(node.left, l,index+1);
		this.findAtLevel(node.right, l,index+1);
	}
	
	public void preOrderTraverse()
	{
		System.out.println();
		this.preOrderTraverse(this.root);
	}

	private void preOrderTraverse(Node node) {
		
		if(node==null)
		{
			return;
		}
		System.out.print(node.data+" , ");
		this.preOrderTraverse(node.left);
		this.preOrderTraverse(node.right);
		
	}

	
	
	public void postOrderTraverse()
	{
		System.out.println();
		this.postOrderTraverse(this.root);
	}

	private void postOrderTraverse(Node node) {
		
		if(node==null)
		{
			return;
		}
		
		
		this.postOrderTraverse(node.left);
		this.postOrderTraverse(node.right);
		System.out.print(node.data+" , ");
		
	}
	
	public void inOrderTraverse()
	{
		System.out.println();
		this.inOrderTraverse(this.root);
		
	}

	private void inOrderTraverse(Node node) {
		if(node==null)
		{
			return;
		}
		

		this.inOrderTraverse(node.left);
		System.out.print(node.data+" , ");
		this.inOrderTraverse(node.right);
		
		
	}
	
	public int lca(int d1, int d2) {                                    //LEAST COMMON ANCESTOR
		return this.lca(d1, d2, this.root).data;
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


	
	
/*	public void preOrederTI()
	{
	                                                              //PRE ORDER ITERATION
		LinkedList<Node> stack=new LinkedList<>();
		stack.addFirst(this.root);
		while(!stack.isEmpty())	
		{
			Node node=stack.removeFirst();
			System.out.println(node.data);
			
			if(node.right!=null)
			{
				stack.addFirst(node.right);
			}
			if(node.left!=null)
			{
				stack.addFirst(node.left);
			}
			
		}
			System.out.println(" END ");
		
	}*/
	public boolean checkBST()
	{
		return checkBST(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);

	
	}

	private boolean checkBST(Node node,int min,int max) {
		if(node==null)
		{
			return true;
		}
		boolean lval=false;
		boolean rval=false;
		
		
			if(node.data<min||node.data>max){
				lval=this.checkBST(node.left, min, node.data);
				
				rval=this.checkBST(node.right, node.data+1,max);
			
		}	
		if(rval&&lval){
			return true;
		}
		else
		return false;
	}
	
	public int sumOfNodes()
	{
		return this.sumOfNodes(this.root);
	}

	private int sumOfNodes(Node node) {
		
		if(node==null)
		{
			return 0;
		}
		
		int sum=node.data;
		
		if(node.left!=null)
		sum=sum+this.sumOfNodes(node.left);
		
		if(node.right!=null)
			sum=sum+this.sumOfNodes(node.right);
		
		return sum;
	}
	
	
	public boolean isSame(BinaryTree tree){
		
		return this.isSame(this.root,tree.root);
	}

	private boolean isSame(Node tnode, Node onode) {
		
		boolean ans=true;
		
		if(tnode.data!=onode.data)
		{
			return false;
		}
		else
		{
			if(tnode.left!=null&&onode.left!=null)
			{
			     ans=this.isSame(tnode.left, onode.left);	
			     if(!ans)
			     {
			    	 return false;
			     }
			}
			
			if(tnode.right!=null&&onode.right!=null)
			{
				 ans=this.isSame(tnode.right, onode.right);	
				 if(!ans)
			     {
			    	 return false;
			     }
			}
			
		    if((tnode.right==null&&onode.right==null)&&(tnode.left==null&&onode.left==null))
			{
				return true;
			}
			
		    if(tnode.left==null||onode.left==null){
		    	return false;
		    }
		    
		    if(tnode.right==null||onode.right==null){
		    	return false;
		    }
				
		}
			
		return ans;
	}
	
	
	public void removeLeafNode()                                    //REMOVE LEAF NODE
	{
		this.root=this.removeLeafNode(this.root);
	}

	private Node removeLeafNode(Node node) {
		
		
		if(node.left==null&&node.right==null)
		{
			return null;
		}
		else{
			if(node.left!=null)
			{
				node.left=this.removeLeafNode(node.left);
			}
			
			if(node.right!=null)
			{
				node.right=this.removeLeafNode(node.right);
			}
		}
		
		return node;

	}
	
	
	
	public void alternatePrint() throws Exception
	{
		 LinkedList[] print=new LinkedList[this.height()+2];
		 
		 for(int i=0;i<print.length;i++)
		 {
			 print[i]=new LinkedList();
		 }
		 
		 
     	print=this.alternatePrint(this.root,0,print);
		
		for(int i=0;i<print.length;i++)
		{
			if(i%2==0)
			{
				print[i].reverseDI();
			}
			print[i].display();
			
		}
	}

	
	private LinkedList[] alternatePrint(Node node,int index, LinkedList[] listarr) throws Exception {                //ALTERNATE PRINT
		
		listarr[index].addAtLast(node.data);
		
	
		if(node.left!=null)
		this.alternatePrint(node.left, index+1,listarr);
		
		if(node.right!=null)
		this.alternatePrint(node.right, index+1,listarr);
			
		return listarr;
	    
	}
	
	
	public boolean possibleSum(int k)                                            //POSSIBLE SUM
	{
		return this.possibleSum(this.root,k);
	}
	
	private boolean possibleSum(Node node, int k)
	{
		if(node==null)
		{
			return false;
		}
		int leftSum=k-node.data;

		boolean rans=false;
		boolean lans=false;
		
		if(this.find(leftSum))
		{
			return true;
		}
		else
		{
			lans=this.possibleSum(node.left, k);
			rans=this.possibleSum(node.right, k);
		}
		
		if(lans||rans)
		{
			return true;
		}
		
		return false;
	}
	
	
	
	
	public void lDisplay()
	{
		for(int i=0;i<this.height()+1;i++)
		{
			this.lDisplay(this.root,i,0);
			System.out.print("END");
			System.out.println();
		}
		
		
		
		
	}

	private void lDisplay(Node node, int l, int h) {
		
		if(l==h)
		{
			System.out.println(node.data+",");
		}
		h++;
		
		if(node.left!=null)
		{
			this.lDisplay(node.left,l,h);
		}
		
		if(node.right!=null)
		{
			this.lDisplay(node.right,l,h);
		}
		
	}
	
	
	public void sumToK(int k)
	{
		this.sumToK(k,this.root);
	}

	private void sumToK(int k, Node node) 
	{
		int n=k-node.data;
	
		if(this.find(n)&&n<node.data)
		{
			if(n!=k/2)
				System.out.println(node.data+" and "+ n);  
		}
				
		    if(node.left!=null)
			this.sumToK(k, node.left);
		     
		    if(node.right!=null)
			this.sumToK(k, node.right);
					
	}
	
	public void replaceGreat()                                           //REPLACE WITH GREATER NODE DATA
	{
		this.replaceGreat(this.root);
	}

	private void replaceGreat(Node node)
	{
		if(this.sumOfGreater(node, node, 0)!=0)
		node.data=this.sumOfGreater(node, node, 0);
		
		if(node.left!=null)
		{
			this.replaceGreat(node.left);
		}
		
		if(node.right!=null)
		{
			this.replaceGreat(node.right);
		}
		
	}
	
	private int sumOfGreater(Node original,Node node,int sum)                 
	{
		
		int lsum=0;
		int rsum=0;
		if(node.left!=null)
		{
			lsum= this.sumOfGreater(original, node.left, sum);
		}
		if(node.right!=null)
		{
			rsum=this.sumOfGreater(original, node.right, sum);
		}
		
		if(node.data>original.data)
		{
			sum=sum+node.data;
		}
		sum=sum+lsum + rsum;
		return sum;
	}
	
	public void possiblePath(int k)                              //POSSIBLE PATH
	{
		BinaryTree tree = new BinaryTree("");
		tree.root=this.possiblePath(k, this.root);
		tree.displayPath(tree.root,"",k);
		
	}

	
	
	private void displayPath(Node node,String str,int k)
	{		
		if(node==null)
		{
			return ;
		}
		
		String rv=str+node.data+"->";
		this.displayPath(node.left, rv,k-node.data);
		this.displayPath(node.right, rv,k-node.data);	
		
		if(node.data==k)
		{
			System.out.println(rv+" END ");
			return ;
		}
		
	}

	private Node possiblePath(int k, Node node) 
	{
		if(node.data>k)
		{
			return null;
		}
		Node n=null;
		if(node.data==k)
		{
			n=new Node(node.data,null,null); 
			return n;
		}
		
		Node lnode=null;

		Node rnode=null;
		if(node.left!=null)
		{
			lnode=this.possiblePath(k-node.data, node.left);
		}
		if(node.right!=null)
		{
			rnode=this.possiblePath(k-node.data, node.right);
		}
		if(lnode!=null||rnode!=null)
		n=new Node(node.data,lnode,rnode); 
		return n;
	}
	
	
}
