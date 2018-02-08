package L9;

public class TCprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[] arr=new boolean[51];
		for(int m=0;m<arr.length;m++)
		{
			arr[m]=true;
		}
		int root=0;
		boolean find=false;
		for(int k=1;k<50/2;k++)
		{
			if((k*k>=50)&&(find==false))
			{
				root=k-1;
				find=true;
			}
		}
		
		for(int i=2;i<=(root);i++)
		{
			for(int j=1;j<arr.length;j++){
			if(j%i==0){
				arr[j]=false;
			}
			else
			{
				arr[j]=true;
			}
			}
			
			for(int m=0;m<arr.length;m++)
			{
				System.out.println(arr[m]+" at "+m );
			}
			


		}
		
		
		
		
	}

	
	
	
	
}
