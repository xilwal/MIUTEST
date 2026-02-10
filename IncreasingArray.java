public class Main {
	
        public static void main(String[] args) {
          int[] array1 = {1};
          int[] array2 = {1, 1, 1, 2};
          int[] array3 = {1, 1, 2, 1, 2, 3};
          int[] array4 = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
          int[] array5 = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5};
          int[] array6 = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6};

          System.out.println(isSystematicallyIncreasing(array1)); // Output: 1
          System.out.println(isSystematicallyIncreasing(array2)); // Output: 0
          System.out.println(isSystematicallyIncreasing(array3)); // Output: 0
          System.out.println(isSystematicallyIncreasing(array4)); // Output: 0
          System.out.println(isSystematicallyIncreasing(array5)); // Output: 0
          System.out.println(isSystematicallyIncreasing(array6)); // Output: 1
      }

    public static int isSystematicallyIncreasing(int[] a) {

        int end = 1; // Track the end of the current sequence
        int index = 0; // Track the index of the array

        while (index < a.length) {

            // Iterate througha larger and larger subsequence
            for (int i = 1; i <= end; i++) {
                if (a[index] != i) return 0;

                index++;
                if (index == a.length) break;
            }

            end++;
        }

        return 1;
    }
}
