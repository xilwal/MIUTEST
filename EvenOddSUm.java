public class EvenOddSUm {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 2, 1, 4, 5};
        int[] array3 = {3, 2, 1, 4, 1};
        int[] array4 = {1, 2, 3, 4};
        int[] array5 = {};
        int[] array6 = {10};

        System.out.println("Array 1: " + f(array1)); // Output: 0
        System.out.println("Array 2: " + f(array2)); // Output: 1
        System.out.println("Array 3: " + f(array3)); // Output: 0
        System.out.println("Array 4: " + f(array4)); // Output: 0
        System.out.println("Array 5: " + f(array5)); // Output: 0
        System.out.println("Array 6: " + f(array6)); // Output: 1
    }

    public static int f(int[] a) {
        if (a.length == 0) {
            return 0; // No middle element for arrays with even length or empty arrays
        }

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                evenSum += a[i];
            }else{
                oddSum += a[i];
            }
        }

        return oddSum - evenSum;
    }
}
