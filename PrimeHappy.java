public class Main {
    public static void main(String[] args) {

        System.out.println(isPrimeHappy(24)); //output 1
    }
    
    public static int isPrimeHappy(int n){
        
       	if(n < 3)
       		return 0;
            
		int sum = 0;
        
        for (int i = 2; i < n; i++) {
        
        	int isPrime = 1;
            
            for (int j = 2; j <= i/2 ; j++) {
                if (i % j == 0) {
                    isPrime = 0;
                    break;
                }
            }
            
            if(isPrime == 1) {
                sum += i;
            }
        }
        
        return sum%n == 0 ? 1: 0;

    }
}