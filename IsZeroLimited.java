public class Main {

    public static void main(String[] args) {
        int[] array1 = {0, 0, 0, 0, 0};
        int[] array2 = {1, 0};
        int[] array3 = {0, 1};
        int[] array4 = {5};
        int[] array5 = {1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0};
        int[] array6 = {};

        System.out.println(isZeroLimited(array1)); // Output: 0
        System.out.println(isZeroLimited(array2)); // Output: 1
        System.out.println(isZeroLimited(array3)); // Output: 0
        System.out.println(isZeroLimited(array4)); // Output: 1
        System.out.println(isZeroLimited(array5)); // Output: 1
        System.out.println(isZeroLimited(array6)); // Output: 1
    }

    static int isZeroLimited(int[] a) {
        // Check if the array is empty
        if (a.length == 0) {
            return 1;
        }

        // Initialize flag to check condition ii
        int zeroFound = 0;

        // Iterate through the array
        for (int i = 0; i < a.length; i++) {
            // Check condition i for each 3n+1 index
            if (i % 3 == 1 && a[i] != 0) {
                return 0;
            }

            // Check condition ii for other indices
            if (i % 3 != 1 && a[i] == 0) {
                zeroFound = 1;
            }
        }

        // If condition ii is violated, return 0; otherwise, return 1
        return zeroFound == 1 ? 0 : 1;
    }
}
