
public class The10001stPrime {
    public static final int TARGET_PRIME_NUMBER = 10001;
    public static void main(String[] args) {
        int count = 1;
        int currentNumber = 0;
        while(count < TARGET_PRIME_NUMBER){
            currentNumber++;

            for(int i=2; i<currentNumber; i++){
                if(currentNumber%i==0){
                    break;
                }
                if(i+1==currentNumber){
                    count++;
                }
            }
        }
        System.out.println(currentNumber);
    }
}
