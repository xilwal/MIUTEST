public class Main {

    public static void main(String[] args) {
        System.out.println(getExponent(162, 3));   // Output: 3
        System.out.println(getExponent(28, 3));   // Output: 0
        System.out.println(getExponent(280, 7));  // Output: 1
        System.out.println(getExponent(-250, 5)); // Output: 3
        System.out.println(getExponent(18, 1));   // Output: -1
        System.out.println(getExponent(128, 4));  // Output: 3
    }

    static int getExponent(int n, int p) {
        if (p <= 1) {
            return -1;
        }

        int exponent = 0;

        while (n % p == 0) {
            n /= p;
            exponent++;
        }

        return exponent;
    }
}
