package HashTables;
                                                              //PUT, REMOVE AND GET - O(1)
public class HashTable<K,V> {
	
		private class HTPair {
			K key;
			V value;

			HTPair(K key, V value) {
				this.key = key;
				this.value = value;
			}

			public boolean equals(Object other) {                        // OBJECT IS A SUPER  CLASS
				HTPair op = (HTPair) other;                                 //TYPE CASTING
				return this.key.equals(op.key);                               //OVERWRITING IN-BUILT METHOD
			}

			public String toString() {                                    //OVERWRITING IN-BUILT METHOD
				return "{" + this.key + ":" + this.value + "}";
			}
		}

		private int size;
		private LinkedList<HTPair>[] bucketArray;
		public static final int DEFAULT_CAPACITY = 10;

		public HashTable() {
			this(DEFAULT_CAPACITY);
		}

		public HashTable(int capacity) {
			// TODO Auto-generated constructor stub
			this.bucketArray = (LinkedList<HTPair>[]) new LinkedList[capacity];
			
			this.size = 0;
		}

		public void put(K key, V value) throws Exception {
			int bi = this.hashFunction(key);
			LinkedList<HTPair> bucket = this.bucketArray[bi];
			HTPair pta = new HTPair(key, value);
			
			if (bucket == null) {
				bucket = new LinkedList<>();
				bucket.addAtLast(pta);
				this.size++;
				this.bucketArray[bi] = bucket;
			} else {
				int foundAt = bucket.find(pta);
				if (foundAt == -1) {
					bucket.addAtLast(pta);
					this.size++;
				} else {
					HTPair pair = bucket.getAt(foundAt);
					pair.value = value;
				}
			}

			double lamda = (this.size * 1.0) / this.bucketArray.length;           //IMPORTANT
			if (lamda > 2) {
				this.rehash();
			}
		}

		private int hashFunction(K key) {                                   	//WORKING WITH HASH CODE 
			int hc = key.hashCode();                                           //IN-BUILT METHOD
			hc = Math.abs(hc);												  
			int bi = hc % this.bucketArray.length;
			return bi;
		}

		public void display() {
			for (LinkedList<HTPair> bucket : this.bucketArray) {
				if (bucket != null && !bucket.isEmpty()) {
					bucket.display();
				} else {
					System.out.println("NULL");
				}

			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}

		public V get(K key) throws Exception {                             //GET METHOD
			int bi = this.hashFunction(key);
			LinkedList<HTPair> bucket = this.bucketArray[bi];
			HTPair ptf = new HTPair(key, null);
			
			if (bucket == null) {
				return null;
			} else {
				int foundAt = bucket.find(ptf);
				if (foundAt == -1) {
					return null;
				} else {
					HTPair pair = bucket.getAt(foundAt);
					return pair.value;
				}
			}
		}

		public V remove(K key) throws Exception {
			int bi = this.hashFunction(key);
			LinkedList<HTPair> bucket = this.bucketArray[bi];
			HTPair ptf = new HTPair(key, null);
			if (bucket == null) {
				return null;
			} else {
				int foundAt = bucket.find(ptf);
				if (foundAt == -1) {
					return null;
				} else {
					HTPair pair = bucket.getAt(foundAt);
					bucket.removeAt(foundAt);
					this.size--;
					return pair.value;
				}
			}
		}

		private void rehash() throws Exception {
			LinkedList<HTPair>[] oba = this.bucketArray;                     //OLD BUCKET ARRAY
			this.bucketArray = (LinkedList<HTPair>[]) new LinkedList[2 * oba.length];
			this.size = 0;

			for (LinkedList<HTPair> ob : oba) {
				while (ob != null && !ob.isEmpty()) {
					HTPair pair = ob.removeFirst();
					this.put(pair.key, pair.value);
				}
			}
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
