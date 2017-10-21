

public class SmallestMultiple {

	private static final int MAXVALUE = 20;
	public static void main(String[] args) {

		for(int num=MAXVALUE; num<Integer.MAX_VALUE; num++) {
			for(int i=1; i<=MAXVALUE; i++) {
				if(num%i!=0) {
					break;
				}
				if(i==MAXVALUE) {
					System.out.println(num);
					System.exit(1);
				}
			}
		}
	}

}
