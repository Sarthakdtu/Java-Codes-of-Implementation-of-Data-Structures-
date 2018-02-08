package LinkedList;

public class StackUsingLL {
	
 private LinkedList list;
 
 public StackUsingLL()
 {
	 this.list=new LinkedList();
 }
 
 
 
 public int size()
 { 
	 return this.list.size();
 }
 public boolean isEmpty()
 {
	 if(this.size()==0)
	 {
		 return true;
	 }
	 else
	 {
		 return false;
	 }
 }
 
 public void push(int data)
 {
	 list.addAtFirst(data);
 }
 
 public int pop() throws Exception
 {
	 int del=list.getFirst();
     list.removeFirst();
	return del;
 }
 
 public int top() throws Exception
 {
	 return list.getFirst();
 }
	
 public void display()
 {
	 list.display();
	 
 }
 
	
	
	
	
	
}
