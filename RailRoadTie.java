public class Main {

    public static void main(String[] args) {
        int[] array1 = {1, 2};
        System.out.println(isRailroadTie(array1)); // Output: 1

        int[] array2 = {1, 2, 0, 1, 2, 0, 1, 2};
        System.out.println(isRailroadTie(array2)); // Output: 1

        int[] array3 = {3, 3, 0, 3, 3, 0, 3, 3, 0, 3, 3};
        System.out.println(isRailroadTie(array3)); // Output: 1

        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(isRailroadTie(array4)); // Output: 0

        int[] array5 = {1, 3, 0, 3, 5, 0};
        System.out.println(isRailroadTie(array5)); // Output: 0

        int[] array6 = {1, 2, 0, 3, -18, 0, 2, 2};
        System.out.println(isRailroadTie(array6)); // Output: 1
    }

    public static int isRailroadTie(int[] a) {
        
        if (a.length == 0 || a[0] == 0) {
            return 0; // Condition a: Array must contain at least one non-zero element
        }

        int len = a.length;

        for (int i = 0; i < len; i++) {
            
            if (a[i] != 0) {
                int leftNeighbor = (i > 0) ? a[i - 1] : 0;
                int rightNeighbor = (i < len - 1) ? a[i + 1] : 0;

                // Condition b: Every non-zero element has exactly one non-zero neighbor
                if ((leftNeighbor == 0 && rightNeighbor == 0) || (leftNeighbor != 0 && rightNeighbor != 0)) {
                    return 0;
                }
            } else {
                int leftNeighbor = (i > 0) ? a[i - 1] : 0;
                int rightNeighbor = (i < len - 1) ? a[i + 1] : 0;

                // Condition c: Every zero element has two non-zero neighbors
                if (leftNeighbor == 0 || rightNeighbor == 0) {
                    return 0;
                }
            }
        }

        return 1;
    }
}
