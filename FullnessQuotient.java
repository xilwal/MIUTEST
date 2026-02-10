public class Main {

    public static void main(String[] args) {
        System.out.println(fullnessQuotient(1));   // Output: 8
        System.out.println(fullnessQuotient(9));   // Output: 5
        System.out.println(fullnessQuotient(94));   // Output: 6
        System.out.println(fullnessQuotient(360)); // Output: 0
        System.out.println(fullnessQuotient(-47)); // Output: -1
    }

    static int fullnessQuotient(int n) {
        if (n < 1) {
            return -1; // The argument must be > 0
        }

        int count = 0;

        for (int base = 2; base <= 9; base++) {
            int temp = n;
            boolean hasZero = false;

            while (temp > 0) {
                int digit = temp % base;
                if (digit == 0) {
                    hasZero = true;
                    break;
                }
                temp /= base;
            }

            if (!hasZero) {
                count++;
            }
        }

        return count;
    }
}
