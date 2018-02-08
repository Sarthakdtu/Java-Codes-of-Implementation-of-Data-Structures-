package l3;

public class ctof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f;
		f=0;
		int  c=0;
		while(f<301)
		{
			c=(int)(float)((5.0/9)*(f-32));

			System.out.print(f+"\t");
			System.out.print(c+"\n");
			f=f+20;
		}
		

	}

}
