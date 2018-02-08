package rough;


public class HashTableP2<K,V> {
	
	private class HTPair
	{
		K key;
		V value;
		HTPair(K key,V value)
		{
			this.key=key;
			this.value=value;
			
		}
		
		public boolean equals(Object other)
		{
			HTPair obj=(HTPair) other;
			return this.key.equals(obj);
			
		}
		
		public String toString()
		{
			return "{" + this.key + ":" + this.value + "}";
		}
		
	}
	
	private LinkedList<HTPair>[] table;
	private int size;
	
	public static final int DEFAULT_CAPACITY = 10;

	public HashTableP2() {
		this(DEFAULT_CAPACITY);
	}

	public HashTableP2(int n)
	{
		table=(LinkedList<HTPair>[])new LinkedList[n];
		this.size=0;
	}
	
	
	public void put(K key,V value) throws Exception
	{
		int bi=this.hashFunction(key);
		HTPair pta=new HTPair(key,value);
		LinkedList<HTPair> row=this.table[bi];
		
		if(row==null)
		{
			row=new LinkedList<>();
			row.addAtLast(pta);
			this.size++;
		}
		else
		{
			int foundAt=row.find(pta);
			if(foundAt==-1)
			{
				row.addAtLast(pta);
				this.size++;
			}
			else
			{
				HTPair pair=row.getAt(foundAt);
				pair.value=value;
			}
		}
		
		double lamda=(this.size * 1.0)/this.table.length;
			
		if(lamda>2)
		{
			this.rehash();
		}
	}

	private int hashFunction(K key) {
		int hcode=key.hashCode();
		hcode=Math.abs(hcode);
		int bi=hcode%this.table.length;
		return bi;
	}
	
	
	public V get(K key) throws Exception
	{
		int bi=this.hashFunction(key);
		LinkedList<HTPair> row=this.table[bi];
		HTPair ptf=new HTPair(key,null);
		if(row==null)
		{
			return null;
		}
		else
		{
			int foundAt=row.find(ptf);
			if(foundAt==-1)
			{
				return null;
			}
			else
			{
				HTPair pair=row.getAt(foundAt);
				return pair.value;
			}
		}
		
  }
	
	public V remove(K key) throws Exception
	{
		int bi=this.hashFunction(key);
		LinkedList<HTPair> row=this.table[bi];
		HTPair ptf=new HTPair(key,null);
		if(row==null)
		{
			return null;
		}
		else
		{
			int foundAt=row.find(ptf);
			if(foundAt==-1)
			{
				return null;
			}
			else
			{
				HTPair pair=row.removeAt(foundAt);
				this.size--;
				 return pair.value;
			}
		}
		
	}
	

	
	private void rehash() throws Exception
	{
		LinkedList<HTPair>[] old=this.table;
		this.table=(LinkedList<HTPair>[])new LinkedList[2*old.length];
		for(LinkedList<HTPair> oldRow:old)
		{
			while(oldRow!=null&&!oldRow.isEmpty())
			{
			HTPair oldpair= oldRow.removeFirst();
			this.put(oldpair.key,oldpair.value);		
			}
		}
	}
	
	
	
	
	
	
}
