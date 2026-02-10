public class Main {
    public static void main(String[] args) {
        int[] a = {21, 3, 7, 9, 11, 4, 6};
        System.out.println(isPrimeProduct(36)); //output 1
    }
    
    public static int isPrimeProduct(int n){
        if(n < 2) return 0;
        
        for(int i = 2; i < n; i++){
        	if(n%i == 0){
            	if(isPrime(i) == 0){
                	return 0;
                }
            }
        }
        return 1;
    }
    
    public static int isPrime(int n){
        if(n<2)
            return 0;
        for(int i = 2; i < n; i++){
            if(n%i == 0)
                return 0;
        }
        return 1;
    }
}