

import java.util.ArrayList;

public class LargestPalindromeProduct {

	public static void main(String[] args) {
		int digitLimit = 3;
		computeDigits(digitLimit);
	}

	private static void computeDigits(int digits) {
		int largestNum = 0;
		int[] numbers = new int[digits]; 
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = 9;
			//System.out.println(i);
		}
		
		int numberLeftSide = 0;
		for(int i=0; i<numbers.length; i++) {
			numberLeftSide+= Math.pow(10, i)*9;
			//System.out.println(numberLeftSide);
		}
		System.out.println(numberLeftSide);
		
		for(int i=0; i<numberLeftSide; i++) {
		int ans = computeLargestPalindrome(numberLeftSide, numberLeftSide-i);
		if(ans > largestNum) {
			largestNum = ans;
		}
		if(ans != -1) {
			System.out.println(largestNum);
		}
		if(i==100) {
			i=0;
			numberLeftSide--;
		}
		
		}
		
		
	}

	private static int computeLargestPalindrome(int a, int b) {
		
		
		 int numberOrigin = a*b;
		 int reversedNumber = 0;
		 ArrayList<Integer> digits = new ArrayList<>();
		 
		 while(numberOrigin>0) {
			 digits.add(numberOrigin%10);
			 numberOrigin /= 10;
		 }
		 for(int i=0; i<digits.size(); i++) {
				reversedNumber+= Math.pow(10,digits.size()-i-1)*digits.get(i);
				//System.out.println(reversedNumber);
			}
		 
		 if(a*b == reversedNumber) {
			 System.out.println(a+" "+b+" "+reversedNumber);
			 return reversedNumber;
		 }
		return -1;
	}


}
