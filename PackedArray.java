public class Main {

    public static void main(String[] args) {
        int[] array1 = {2, 2, 1};
        System.out.println(isPacked(array1)); // Output: 1

        int[] array2 = {2, 2, 1, 2, 2};
        System.out.println(isPacked(array2)); // Output: 1

        int[] array3 = {4, 4, 4, 4, 1, 2, 2, 3, 3, 3};
        System.out.println(isPacked(array3)); // Output: 1

        int[] array4 = {7, 7, 7, 7, 7, 7, 7, 1};
        System.out.println(isPacked(array4)); // Output: 1

        int[] array5 = {7, 7, 7, 7, 1, 7, 7, 7};
        System.out.println(isPacked(array5)); // Output: 0

        int[] array6 = {7, 7, 7, 7, 7, 7, 7};
        System.out.println(isPacked(array6)); // Output: 1

        int[] array7 = {};
        System.out.println(isPacked(array7)); // Output: 1

        int[] array8 = {1, 2, 1};
        System.out.println(isPacked(array8)); // Output: 0

        int[] array9 = {2, 1, 1};
        System.out.println(isPacked(array9)); // Output: 0

        int[] array10 = {-3, -3, -3};
        System.out.println(isPacked(array10)); // Output: 0

        int[] array11 = {0, 2, 2};
        System.out.println(isPacked(array11)); // Output: 0

        int[] array12 = {2, 1, 2};
        System.out.println(isPacked(array12)); // Output: 0
    }

    static int isPacked(int[] a) {
        int len = a.length;
		if(len == 0)
        	return 1;
        for (int i = 0; i < len; i++) {
            if (a[i] <= 0) {
                return 0; // Check if all values are positive
            }

            int count = 1;
            while (i + 1 < len && a[i] == a[i + 1]) {
                count++;
                i++;
            }

            if (count != a[i]) {
                return 0; // Check if each value appears the correct number of times
            }
        }

        return 1;
    }
}
