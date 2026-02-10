public class Main {

    public static void main(String[] args) {
        // Examples
        System.out.println("Result 1: " + largestPrimeFactor(10));
        System.out.println("Result 2: " + largestPrimeFactor(6936));
        System.out.println("Result 3: " + largestPrimeFactor(1));
    }

    static int largestPrimeFactor(int n) {
        if (n <= 1) {
            return 0; 
        }

        int largestPrime = 2; 

        while (n % 2 == 0) {
            n /= 2;
            largestPrime = 2;
        }

        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                n /= i;
                largestPrime = i;
            }
        }

        if (n > 2) {
            largestPrime = n;
        }

        return largestPrime;
    }
}
