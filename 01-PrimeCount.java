/*  Write a function named primeCount with signature
    int primeCount(int start, int end);
    The function returns the number of primes between start and end inclusive. Recall that a prime is
    a positive integer greater than 1 whose only integer factors are 1 and itself.
*/
    
public class Main{
    
     public static void main(String[] args) {
        System.out.println(primeCount(10, 30)); // Output: 6
        System.out.println(primeCount(11, 29)); // Output: 6
        System.out.println(primeCount(20, 22)); // Output: 0
        System.out.println(primeCount(1, 1)); // Output: 0
        System.out.println(primeCount(5, 5)); // Output: 1
        System.out.println(primeCount(6, 2)); // Output: 0
        System.out.println(primeCount(-10, 6)); // Output: 3
    }

    public static int primeCount(int start, int end) {
        
        if (start > end || end  < 2) {
            return 0;
        }
        
        if (start <= 1) {
                start = 2;
        }

        int count = 0;
        
        for (int num = start; num <= end; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num/2 ; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;
            }
        }
        return count;
    }
}