public class Main {

    public static void main(String[] args) {
        System.out.println(closestFibonacci(13)); // Output: 13
        System.out.println(closestFibonacci(33)); // Output: 21
        System.out.println(closestFibonacci(35)); // Output: 34
        System.out.println(closestFibonacci(1));  // Output: 1
        System.out.println(closestFibonacci(0));  // Output: 0
    }

    public static int closestFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int prev = 1;
        int current = 1;

        while (current <= n) {
            int temp = current;
            current += prev;
            prev = temp;
        }

        return prev;
    }
}
