package Heap;

public class StudentHeap {

	public static void main(String[] args) {
		
		
		
		Student[] students=new Student[9];
		
		students[0]=new Student(400,6,"A");
		students[1]=new Student(500,5,"B");
		students[2]=new Student(800,2,"C");
		students[3]=new Student(900,1,"D");
		students[4]=new Student(200,8,"E");
		students[5]=new Student(600,4,"F");
		students[6]=new Student(300,7,"G");
		students[7]=new Student(100,9,"H");
		students[8]=new Student(700,3,"I");
		
		Heaps <Student> heap=new Heaps<>(students,false);
		heap.display();

		System.out.println();
		heap.remove();
		heap.display();
	}
	
	
	
	
	
	public static class Student implements Comparable<Student>
	{

		int marks;
		int rank;
		String name;
		
		Student(int marks,int rank,String name)
		{
			this.marks=marks;
			this.rank=rank;
			this.name=name;
		}
		
		public String toString()
		{
			return "{"+this.name+"  M= "+this.marks+" R= "+this.rank+"}"; 
		}
		
		public int compareTo(Student o) {
			return this.marks-o.marks;
		}
		
		
		
	}
	

}
