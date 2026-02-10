public class Main {

    public static void main(String[] args) {
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1}));  // Output: 1
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0})); // Output: 0
        System.out.println(isOneBalanced(new int[]{1, 1, 2, 3, 1, -18, 26, 1})); // Output: 0
        System.out.println(isOneBalanced(new int[]{}));                         // Output: 1
        System.out.println(isOneBalanced(new int[]{3, 4, 1, 1}));               // Output: 1
        System.out.println(isOneBalanced(new int[]{1, 1, 3, 4}));                // Output: 1
        System.out.println(isOneBalanced(new int[]{3, 3, 3, 3, 3, 3}));         // Output: 0
        System.out.println(isOneBalanced(new int[]{1, 1, 1, 1, 1, 1}));         // Output: 0
    }

    public static int isOneBalanced(int[] a) {
        int nonOnes = 0;
        int countBeginningOnes = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1 && nonOnes == 0) {
                countBeginningOnes++;
            } else if (a[i] != 1) {
                nonOnes++;
            } else {
                break;  // Break when encountering the first 1 after the non-1 sequence
            }
        }

        int countEndingOnes = 0;
        nonOnes = 0;

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == 1 && nonOnes == 0) {
                countEndingOnes++;
            } else if (a[i] != 1) {
                nonOnes++;
            } else {
                break;  // Break when encountering the first 1 after the non-1 sequence
            }
        }

        return countBeginningOnes + countEndingOnes == nonOnes ? 1 : 0;
    }
}
