

public class EvenFibonacciNumbers {
	
	private static final int MAXVALUE = 4000000;
	
	public static void main(String[] args) {

		int x = 1;
		int y = 2;
		
		int total = 0;
		
		total += x%2==0 ? x:0;
		
		while(y<MAXVALUE) {
			
			total += y%2==0 ? y:0;

			int sumNumbers = (x+y);
			x = y;
			y = sumNumbers;
			
		}
		
		System.out.println(total);
	}

}
