package Heap;

import java.util.ArrayList;

public class Heaps< T extends Comparable <T> > {                       //TWO TYPES OF HEAP
	                                                                   //MIN AND MAX
	
		private ArrayList<T> data;
		private boolean isMin;

		Heaps() {
			this(false);
		}

		Heaps(boolean isMin) {
			this.data = new ArrayList<>();
			this.isMin = isMin;
		}

		Heaps(T[] arr, boolean isMin) {
			this(isMin); 
			for (T item : arr) {
				this.data.add(item);
			}
			for (int i = this.data.size() / 2 - 1; i >= 0; i--) {                  //O(log(n))
				this.downheapify(i);
			}
		}

		public int size() {
			return this.data.size();
		}

		public boolean isEmpty() {
			return this.data.size() == 0;
		}

		public T get() {
			return this.data.get(0);
		}

		public void add(T item) {
			this.data.add(item);
			this.upheapify(this.data.size() - 1);
		}

		private void upheapify(int ci) {
			if (ci == 0) {
				return;
			}
			int pi = (ci - 1) / 2;
			if (!isLarger(pi, ci)) {
				this.swap(pi, ci);
				this.upheapify(pi);
			}
		}

		private void swap(int i, int j) {
			T temp = this.data.get(i);
			this.data.set(i, this.data.get(j));
			this.data.set(j, temp);
		}

		private boolean isLarger(int i, int j) {
			T ithitem = this.data.get(i);
			T jthitem = this.data.get(j);

			if (this.isMin) {
				return ithitem.compareTo(jthitem) < 0;
			} else {
				return ithitem.compareTo(jthitem) > 0;
			}
		}

		public T remove() {
			T hp = this.data.get(0);
			this.swap(0, this.data.size() - 1);
			this.data.remove(this.data.size() - 1);
			this.downheapify(0);
			return hp;
		}

		private void downheapify(int pi) {
			int lci = 2 * pi + 1;
			int rci = 2 * pi + 2;

			int mi = pi;
			if (lci < this.data.size() && this.isLarger(lci, mi)) {
				mi = lci;
			}

			if (rci < this.data.size() && this.isLarger(rci, mi)) {
				mi = rci;
			}

			if (mi != pi) {
				this.swap(mi, pi);
				
				this.downheapify(mi);
			}
		}

		public void display() {
			this.display(0);
		}

		private void display(int idx) {
			int lci = 2 * idx + 1;
			int rci = 2 * idx + 2;

			String str = "";
			T node = this.data.get(idx);
			if (lci < this.data.size()) {
				T lc = this.data.get(lci);
				str = str + lc + "=>";
			} else {
				str = str + "END=>";
			}

			str = str + node;
			if (rci < this.data.size()) {
				T rc = this.data.get(rci);
				str = str + "<=" + rc;
			} else {
				str = str + "<=END";
			}

			System.out.println(str);
			if (lci < this.data.size()) {
				this.display(lci);
			}

			if (rci < this.data.size()) {
				this.display(rci);
			}

		}
		
		public int returnMedian()
		{                                                            //MEDIAN
			if(this.size()%2!=0)
			{
				System.out.println("At odd");
				return (int)this.data.get((this.size()+1)/2);
			}
			
			int i=(this.data.size()-1)/2;
			int j=(this.data.size())/2;
			System.out.println();
			return ((int)this.data.get(i)+(int)this.data.get(j))/2;
			
		}
		

		
	
		
		
		
		
	}
