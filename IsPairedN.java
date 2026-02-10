public class Main {

    public static void main(String[] args) {
        System.out.println(isPairedN(new int[]{1, 4, 1, 4, 5, 6}, 6));               // Output: 1
        System.out.println(isPairedN(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}, 6));     // Output: 1
        System.out.println(isPairedN(new int[]{1, 4, 1}, 5));                       // Output: 0
        System.out.println(isPairedN(new int[]{8, 8, 8, 8, 7, 7, 7}, 15));          // Output: 0
        System.out.println(isPairedN(new int[]{8, -8, 8, 8, 7, 7, -7}, -15));       // Output: 0
        System.out.println(isPairedN(new int[]{3}, 3));                              // Output: 0
        System.out.println(isPairedN(new int[]{}, 0));                               // Output: 0
    }

    public static int isPairedN(int[] a, int n) {
        if (a.length < 2) {
            return 0; // Array must have at least two elements
        }

        if (n < 0) {
            return 0; // N must be non-negative
        }

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == n && i + j == n) {
                    return 1; // Array is paired-N
                }
            }
        }

        return 0; // No paired-N found
    }
}
