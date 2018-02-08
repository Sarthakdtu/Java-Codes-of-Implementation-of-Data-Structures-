package Graphs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

public class Graph {

	private class Vertex {
		String name;
		HashMap<Vertex,Integer> neighbours;
		
		Vertex(String name)
		{
			this.name=name;
			this.neighbours=new HashMap<>();
		}
		
	public boolean equals(Object other)
	{
		Vertex ov=(Vertex) other;
		return this.name.equals(ov.name);
	}
	
	public int hashCode()
	{
		return this.name.hashCode();
	}
	
	public void display()
	{
		String rv="";
		rv=rv+this.name+"=> ";
		Set<Vertex> nbrs=this.neighbours.keySet();
		for(Vertex nbr:nbrs)
		{
			rv=rv+nbr.name+"( "+this.neighbours.get(nbr)+" ) ,";
		}
		
		rv=rv+" END ";
		System.out.println(rv);
	}
	
	}
	
	private HashMap<String,Vertex> vertices;
	
	Graph()
	{
		this.vertices=new HashMap<>();
	}

	public int numVertices(){
		return this.vertices.size();
	}
	
	public void addVertex(String name)
	{
		if(this.vertices.containsKey(name))
		{
			return; 
		}
		
		Vertex vtx=new Vertex(name);
		this.vertices.put(name, vtx);
	}
	
	public void removeVertex(String name)
	{
		
		if(!this.vertices.containsKey(name))
		{
			return ;
		}
		
		Vertex vtx=this.vertices.get(name);
		Set<Vertex> nbrs =vtx.neighbours.keySet();
		
		for(Vertex nbr:nbrs)
		{
			nbr.neighbours.remove(vtx);
		}
		this.vertices.remove(name);
	}
	
	
	public int nEdges()
	{
		int rv=0;
		Collection <Vertex> vtces=this.vertices.values();
		for(Vertex vtx:vtces)
		{
			rv=rv+vtx.neighbours.size();
		}
		rv=rv/2;
		return rv;
	}
	
	
	public void addEdge(String v1,String v2,int weight)
	{
		Vertex vtx1=this.vertices.get(v1);
		Vertex vtx2=this.vertices.get(v2);
		
		if(vtx1==null||vtx2==null||vtx1.neighbours.containsKey(vtx2))
		{
			return ;
		}
		
		vtx1.neighbours.put(vtx2, weight);

		vtx2.neighbours.put(vtx1, weight);
	}
	
	public void removeEdge(String v1,String v2)
	{
		Vertex vtx1=this.vertices.get(v1);
		Vertex vtx2=this.vertices.get(v2);
		
		if(vtx1==null||vtx2==null||!vtx1.neighbours.containsKey(vtx2))
		{
			return ;
		}
		
		vtx1.neighbours.remove(vtx2);

		vtx2.neighbours.remove(vtx1);
	}
	
	
	public void display()
	{
		Set<String> vtces=this.vertices.keySet();
		for(String vtxname:vtces)
		{
			Vertex vtx=this.vertices.get(vtxname);
			vtx.display();
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
	}
	
	
	
	
	public boolean isPath(String v1, String v2)
	{
		Vertex vtx1=this.vertices.get(v1);
		Vertex vtx2=this.vertices.get(v2);
		
		if(v1==null|v2==null)
		{
			return false;
		}
		HashMap<Vertex,Boolean> explored=new HashMap<>();
		
		return isPathDFS(vtx1,vtx2, explored);
				
	}

	private boolean isPathDFS(Vertex v1, Vertex v2, HashMap<Vertex, Boolean> explored) { //DEPTH PER SEARCH
		
		if(!explored.containsKey(v1))
		{
			explored.put(v1,true);
		}
		else
		{
			return false;
		}
		
		if(v1.neighbours.containsKey(v2))
		{
			return true;
		}
		
		Set<Vertex> nbrs =v1.neighbours.keySet();
		for(Vertex nbr:nbrs)
		{
			if(this.isPathDFS(nbr, v2, explored))
			{
				return true;
			}
			
		}
		
		
		return false;
	}
	
	
	public boolean isPathIBFS(String v1, String v2)
	{
		Vertex vtx1=this.vertices.get(v1);
		Vertex vtx2=this.vertices.get(v2);
		
		if(v1==null|v2==null)
		{
			return false;
		}
		
		HashMap<Vertex,Boolean> explored=new HashMap<>();
		
		return isPathIBFS(vtx1,vtx2, explored);
	}

	private boolean isPathIBFS(Vertex v1, Vertex v2, HashMap<Vertex, Boolean> explored)  //BREADTH FOR SEARCH
	{	
		
		LinkedList<Vertex> queue=new LinkedList<>();
			
		queue.add(v1);
		 
		while(!queue.isEmpty())
		{
			Vertex vtx=queue.removeFirst(); 
			
			if(!explored.containsKey(vtx))
			{
				explored.put(vtx,true);
			}
			
			if(vtx.neighbours.containsKey(v2))
			{
				return true;
			}
			
			Set<Vertex> nbrs =vtx.neighbours.keySet();
			for(Vertex nbr:nbrs)
			{		
				if(!explored.containsKey(nbr))
					{
					  queue.add(nbr);
					}	
					
			}
		}		
		return false;
	}		
	
	
	
	public boolean isPathIDPS(String v1, String v2)
	{
		Vertex vtx1=this.vertices.get(v1);
		Vertex vtx2=this.vertices.get(v2);
		
		if(v1==null|v2==null)
		{
			return false;
		}
		
		HashMap<Vertex,Boolean> explored=new HashMap<>();
		
		return isPathIDPS(vtx1,vtx2, explored);
	}

	private boolean isPathIDPS(Vertex v1, Vertex v2, HashMap<Vertex, Boolean> explored)
	{
		
		LinkedList<Vertex> stack=new LinkedList<>();
			
		stack.add(v1);
		
		while(!stack.isEmpty())
		{
			Vertex vtx=stack.removeFirst();
			
			if(!explored.containsKey(vtx))
			{
				explored.put(vtx,true);
			}
			
			if(vtx.neighbours.containsKey(v2))
			{
				return true;
			}
			
			Set<Vertex> nbrs =vtx.neighbours.keySet();
			for(Vertex nbr:nbrs)
			{		
				if(!explored.containsKey(nbr))
					{
					  stack.addFirst(nbr);
					}	
					
			}
		}		
		return false;
	}

	
	
	public void BFTraversal()                       //BREADTH TRAVERSAL
	{
	    
	}
	

	public void DFTraversal()                       //DEPTH TRAVERSAL
	{
	    
	}
	
	public boolean isConnected()                       //   IS CONNECTED
	{
		Set<String> keyname=this.vertices.keySet();
		
		boolean ans=true;;
	   for(String test: keyname)
	   {
		   for(String test2:keyname)
			{
			   if(ans)
			   {
			    ans=this.isPath(test, test2);
			   }
			   else
			   {
				   return false;
			   }
			
			}
	   }
	   return true;
	}
	
	
	
	
	public ArrayList<ArrayList<String>> getCC()
	{
		ArrayList<ArrayList<String >> numGraphs=new ArrayList<>();
		HashMap<String,Boolean> explored=new HashMap<>();
		return this.getCC(numGraphs,explored);
	}

	private ArrayList<ArrayList<String>> getCC(ArrayList<ArrayList<String>> list,HashMap<String,Boolean> explored)
	{
			return null;     //GET CONNECTED COMPONENTS	
		
	}
	
	
	
//	public boolean isBipartite()
//	{
//		HashMap<String,String> list=new HashMap<>();
//		Set<String> keyname=this.vertices.keySet();
//		
//		for(String key:keyname)
//		{
//			if(list.get(key).equals(""))
//			{
//				list.put(key, "G");
//			}
//		
//		Set<Vertex> nbrs=this.vertices.get(key).neighbours.keySet();
//		for(Vertex nbr:nbrs)
//		{
//			if(list.get(nbr.name).equals(list.get(key)))
//			{
//				return false;
//			}
//			else
//			{
//				
//			}
//			
//			
//		}
//		
//		
//		}
//	}
//	
//	
	
	
	
}
