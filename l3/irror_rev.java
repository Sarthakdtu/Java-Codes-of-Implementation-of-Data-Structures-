package Lecture3;

public class irror_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(power(2, 5));
		System.out.println(log(32, 2));
		System.out.println(inverse(3214));
	}

	public static int power(int x, int n) {
		int retVal = 1;
		while (n != 0) {
			retVal = retVal * x;
			n--;
		}
		return retVal;
	}

	public static int log(int x, int n) {
		int counter = 0;
		while (x != 1) {
			counter = counter + 1;
			x = x / n;
		}
		return counter;
	}
	
	public static int inverse(int num){
		int counter=1;
		int inv=0;
		while(num!=0){
			int rem=num%10;
			int power=1;
			while(rem!=1){
				power=power*10;
				rem--;
			}
			
			inv=inv+power*counter;
			counter++;
			num=num/10;
		}
		return inv;
	}

}
