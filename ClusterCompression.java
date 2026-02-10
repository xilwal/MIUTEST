public class Main {

    public static void main(String[] args) {
        int[] array1 = {0, 0, 0, 2, 0, 2, 0, 2, 0, 0};
        int[] result1 = clusterCompression(array1);
        printArray(result1); // Output: {0, 2, 0, 2, 0, 2, 0}

        int[] array2 = {18};
        int[] result2 = clusterCompression(array2);
        printArray(result2); // Output: {18}

        int[] array3 = {};
        int[] result3 = clusterCompression(array3);
        printArray(result3); // Output: {}

        int[] array4 = {-5, -5, -5, -5, -5};
        int[] result4 = clusterCompression(array4);
        printArray(result4); // Output: {-5}

        int[] array5 = {1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1};
        int[] result5 = clusterCompression(array5);
        printArray(result5); // Output: {1, 2, 1}

        int[] array6 = {8, 8, 6, 6, -2, -2, -2};
        int[] result6 = clusterCompression(array6);
        printArray(result6); // Output: {8, 6, -2}
    }

    static int[] clusterCompression(int[] a) {
        if (a == null || a.length == 0) {
            return new int[0];
        }

        int compressedSize = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                compressedSize++;
            }
        }

        int[] compressedArray = new int[compressedSize];
        compressedArray[0] = a[0];
        int compressedIndex = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i - 1]) {
                compressedArray[compressedIndex++] = a[i];
            }
        }

        return compressedArray;
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
