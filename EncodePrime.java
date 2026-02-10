public class Main {

    public static void main(String[] args) {
        // Examples
        printResult(encodeNumber(2));
        printResult(encodeNumber(6));
        printResult(encodeNumber(14));
        printResult(encodeNumber(24));
        printResult(encodeNumber(1200));
        printResult(encodeNumber(1));
        printResult(encodeNumber(-18));
    }

    static int[] encodeNumber(int n) {
        if (n <= 1) {
            return null; // n must be greater than 1
        }

        int totalFactors = 0;
        int num = n;
        for (int i = 2; i <= num; i++) {
            while (num % i == 0) {
                totalFactors++;
                num /= i;
            }
        }

        int[] primeFactors = new int[totalFactors + 1]; // One additional element for terminating zero
        int index = 0;

        // Populate the array with prime factors
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeFactors[index++] = i;
                n /= i;
            }
        }

        primeFactors[index] = 0; // Terminating zero

        return primeFactors;
    }    

    static void printResult(int[] result) {
        if (result == null) {
            System.out.println("null");
            return;
        }

        System.out.print("{");
        for (int i = 0; i < result.length - 1; i++) {
            System.out.print(result[i]);
            if (result[i + 1] != 0) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
