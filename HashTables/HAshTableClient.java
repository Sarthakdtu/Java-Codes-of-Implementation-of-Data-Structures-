package HashTables;

public class HAshTableClient {

	public static void main(String[] args) throws Exception {
		
		HashTable<String,Integer> hash=new HashTable(3);
		
		hash.put("India",300 );
		hash.put("usa",250);
		hash.put("pak",200 );
		hash.put("uk",270);
		
		hash.put("russia",290 );
		hash.put("Aus",280);
		hash.put("abc",300 );
		hash.put("pqr",250);
		hash.put("xyz",200 );
		hash.put("jkl",270);
		
		hash.put("Africa",290 );
		hash.put("mno",280);
		hash.put("uvw",280);
		//hash.display();
		
		
	
	}

}
