import java.util.ArrayList;

public class path2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getmazepath(2,2,0,0));

	}

	
	public static int countmazepath(int er,int ec,int cr,int cc)
	{
		if(cr>=er)
		{
			return 1;
		}
		
		if(cc>=ec)
		{
			return 1;
		}
		
		
		int cor=countmazepath(er,ec,cr,cc+1);
		int coc=countmazepath(er,ec,cr+1,cc);
		int cod=countmazepath(er,ec,cr+1,cc+1);
		int tc=cor+coc+cod;
		return tc;
		
	}
	
	
	public static ArrayList<String> getmazepath(int er,int ec,int cr,int cc)
	{
		
			
			
				
				if((cc==ec)&&(cr==er)){
					ArrayList<String>  basepath=new ArrayList<>();
				    basepath.add("");
					return basepath;
					
				}
				
				if((cc>ec)||(cr>er)){
					ArrayList<String>  basepath=new ArrayList<>();
				//basepath.add("");
					return basepath;
					
				}
		
		ArrayList <String> prepathr=getmazepath(er,ec,cr,cc+1);
		ArrayList <String> prepathc=getmazepath(er,ec,cr+1,cc);
		ArrayList <String> prepathd=getmazepath(er,ec,cr+1,cc+1);
		ArrayList<String>  mypath=new ArrayList<>();
		String str=new String();
		for(int i=0;i<prepathr.size();i++)
		{
			str=prepathr.get(i);
			mypath.add("H"+str);
		}
		
		for(int j=0;j<prepathc.size();j++)
		{
			str=prepathc.get(j);
			mypath.add("V"+str);
		}
		
		
		for(int k=0;k<prepathd.size();k++)
		{
			str=prepathd.get(k);
			mypath.add("D"+str);
		}
		
		
		
		return mypath;
		
	}
	
	

	/*public static void printmazepath(int er,int ec,int cr,int cc,String str)
	{
		if(cr>=er)
		{
			System.out.println("V");
			return ;
		}
		
		if(cc>=ec)
		{			System.out.println("H");
			return ;
		}
		
		
		printmazepath(er,ec,cr,cc+1,"H");
		printmazepath(er,ec,cr+1,cc,"V");
		
		
	}sx
	
	*/
	
}
