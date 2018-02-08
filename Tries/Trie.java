package Tries;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Trie {
	
	private class Node
	{
		Character data;
		HashMap<Character,Node> children;
		boolean isTerminal;
		
		Node(Character data,boolean isTerminal)
		{
			this.data=data;
			this.children=new HashMap<>();
			this.isTerminal=isTerminal;
		}
	}
	
	private Node root;
	private int numWords;
	
	Trie()
	{
		this.root=new Node('\0',false);
		this.numWords=0;
	}
	
	
	public int getNumWords()
	{
		return this.numWords;
	}
	
	public boolean isEmpty()
	{
		return this.numWords==0;
	}
	
	
	public void addWord(String word)
	{
		this.addWord(this.root,word);
	}


	private void addWord(Node parent, String word)                                  //ADD WORD
	{
		
		if(word.length()==0)
		{
			if(!parent.isTerminal)
			{
				parent.isTerminal=true;
				this.numWords++;
			}
			
			return ;
		}
		
		  char ch=word.charAt(0);
          
		  String ros=word.substring(1);
		  Node child=parent.children.get(ch);
		
				
		if(child==null)
		{
			child=new Node(ch,false);
			parent.children.put(ch,child);
		}
			this.addWord(child, ros);
		
	}
	
	
	
	public void display()
	{
		this.display(this.root,"");
	}


	private void display(Node node,String osf)                          //DISPLAY
	{		
		
		if(node.isTerminal)
		{
			String toPrint=osf.substring(1)+node.data;
			System.out.println(toPrint);
		}
		
		Set<Map.Entry<Character,Node>> entries=node.children.entrySet();
		
		for(Map.Entry<Character,Node> entry:entries)
		{
			this.display(entry.getValue(), osf+node.data);
		}
		
	}
	
	
	public boolean searchWord(String word)
	{
		return this.searchWord(this.root,word);
	}


	private boolean searchWord(Node parent, String word) {                          //SEARCHING A WORD
		
		if(word.length()==0&&parent.isTerminal)
		{
			return true;
		}
		else if(word.length()==0&&!parent.isTerminal)
		{
			return false;
		}
		
		 char ch=word.charAt(0);         
		 String ros=word.substring(1);
		  	
		Node child=parent.children.get(ch);
		
				
		if(child==null)
		{
			return false;
		}
			
		boolean ans=this.searchWord(child,ros);
			
		return ans;
	}

	
	
	public void remove(String word)
	{
		this.remove(this.root,word);
	}


	private void remove(Node parent, String word) {                                  //DELETING A WORD
		
		if(word.length()==0)
		{
			if(parent.isTerminal)
			{
				parent.isTerminal=false;
				this.numWords--;
			}
			return;
		}
		
		 char ch=word.charAt(0);         
		 String ros=word.substring(1);
		  	
		Node child=parent.children.get(ch);
		
				
		if(child==null)
		{
			return;
		}
		
		this.remove(child,ros);
		
		if(child.children.size()==0&&!child.isTerminal)
		{
			parent.children.remove(ch);
		}
		
	}
	
	
	
	public void displayAsATree()
	{
		this.displayAsATree(this.root);
	}


	private void displayAsATree(Node parent) {                            // DISPLAY AS A TREE
		
		if(parent.data=='\0')
		{
			System.out.print("\\0 => ");
		}
		else
		System.out.print(parent.data+" => ");
		
		Set<Character> keys=parent.children.keySet();
		
		for(Character ch: keys)
		{
			System.out.print(ch+" , ");
		}
		
		Collection<Node> values= parent.children.values();
		
		System.out.println(" END ");
		
		for(Node value: values)
		{
			this.displayAsATree(value);
		}
		
		
	}
	
	
}
