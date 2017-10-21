

public class MultiplesOf3and5 {

	public static void main(String[] args) {
		int maxNumber = 10000;
		
		int sum = 0;
		
		for(int i=0; i<maxNumber; i++) {
			if(i%3==0) {
				sum+=i;}
			if(i%5==0) {
				sum+=i;
			}
			if(i%15==0) {
				sum-=i;
			}
			
			}
		System.out.println(sum);
		
		}

}
