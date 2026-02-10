public class Main {

    public static void main(String[] args) {
        // Test cases
        System.out.println(isFactorialPrime(2)); // 1
        System.out.println(isFactorialPrime(3)); // 1
        System.out.println(isFactorialPrime(7)); // 1
        System.out.println(isFactorialPrime(8)); // 0
        System.out.println(isFactorialPrime(110)); // 0
        System.out.println(isFactorialPrime(721)); // 0
    }

    // Function to check if a number is a factorial prime
    public static int isFactorialPrime(int n) {
        
        if (n <= 1) {
            return 0;
        }
        
        int num = n;
        
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return 0;
            }
        }
        
        int factorial = 1;
        int i = 1;
        while(factorial+1 < num) {
        	factorial = factorial * i;
            i++;
        }
         
        if (n == factorial + 1) {
            return 1;
        }
        
        return 0;
    }
}
