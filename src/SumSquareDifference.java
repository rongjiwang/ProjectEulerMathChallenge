

public class SumSquareDifference {
		public static final int MAXNUMBER = 100;
	public static void main(String[] args) {
		
		int sumSquareNumber = calculateSumAndSquare(MAXNUMBER);
		System.out.println(sumSquareNumber);
		int squareSumNumber = calculateSquareAndSum(MAXNUMBER);
		
		int diff = squareSumNumber-sumSquareNumber;
		
		System.out.println(diff);
	}
	private static int calculateSquareAndSum(int max) {
		
		int squareThenSumTotal = 0;
		for(int i=1; i<=max; i++) {
			squareThenSumTotal+=i;
		}
		squareThenSumTotal = (int) Math.pow(squareThenSumTotal, 2);
		return squareThenSumTotal;
	}
	private static int calculateSumAndSquare(int max) {
		int sumThenSquareTotal = 0;
		for(int i=1; i<=max; i++) {
			sumThenSquareTotal+= Math.pow(i, 2);
		}
		return sumThenSquareTotal;
	}

}
