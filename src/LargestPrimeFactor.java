

import java.math.BigInteger;
import java.util.ArrayList;

public class LargestPrimeFactor {

	public static long MAXNUMBER = 600851475143L;
	
	public static void main(String[] args) {
		ArrayList<Integer> primeList = new ArrayList<>();
		int primeBegin = 1;
		
		while(MAXNUMBER!=1) {
			if(MAXNUMBER%primeBegin==0) {
				MAXNUMBER /= primeBegin;
				primeList.add(primeBegin);
			}
			primeBegin++;
		}
		
		System.out.println(primeList.toString());
	}

}
