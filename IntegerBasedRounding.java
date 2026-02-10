public class Main {

    public static void main(String[] args) {
        // Examples
        int[] array1 = {1, 2, 3, 4, 5};
        doIntegerBasedRounding(array1, 2);
        printArray(array1); // Output: {2, 2, 4, 4, 6}

        int[] array2 = {1, 2, 3, 4, 5};
        doIntegerBasedRounding(array2, 3);
        printArray(array2); // Output: {0, 3, 3, 3, 6}

        int[] array3 = {1, 2, 3, 4, 5};
        doIntegerBasedRounding(array3, 0);
        printArray(array3); // Output: {1, 2, 3, 4, 5}

        int[] array4 = {-1, -2, -3, -4, -5};
        doIntegerBasedRounding(array4, -3);
        printArray(array4); // Output: {-1, -2, -3, -4, -5}

        int[] array5 = {-18, 1, 2, 3, 4, 5};
        doIntegerBasedRounding(array5, 4);
        printArray(array5); // Output: {-18, 0, 4, 4, 4, 4}

        int[] array6 = {1, 2, 3, 4, 5};
        doIntegerBasedRounding(array6, -1);
        printArray(array6); // Output: {0, 0, 5, 5, 5}
    }

    static void doIntegerBasedRounding(int[] a, int n) {
        if (n <= 0) {
            return; // no elements are modified if n <= 0
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                a[i] = (a[i] + n/2) / n * n; // n-based integer rounding formula
            }
        }
    }

    static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
